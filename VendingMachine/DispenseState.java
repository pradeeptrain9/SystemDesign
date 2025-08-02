package VendingMachine;

public class DispenseState implements State{
    @Override
    public void insertAmount(VendingMachine vendingMachine, int amount) {
        System.out.println("Cannot insert amount while dispensing a product.");
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, String productCode) {
        System.out.println("Cannot select product while dispensing a product.");
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) {
        Product product = vendingMachine.getSelectedProduct();
        if (product != null) {
            if (vendingMachine.getProductInventory().getInventory().get(product) > 0) {
                if (vendingMachine.getCurrentBalance() >= product.getPrice()) {
                    vendingMachine.getProductInventory().getInventory().put(product,
                        vendingMachine.getProductInventory().getInventory().get(product) - 1);
                    vendingMachine.setCurrentBalance(vendingMachine.getCurrentBalance() - product.getPrice());
                    System.out.println("Dispensing product: " + product.getName());
                    System.out.println("Remaining balance: " + vendingMachine.getCurrentBalance());
                    vendingMachine.setState(new IdleSate());
                } else {
                    System.out.println("Insufficient balance to dispense the product.");
                }
            } else {
                System.out.println("Selected product is out of stock.");
            }
        } else {
            System.out.println("No product selected for dispensing.");
        }
    }

    @Override
    public void cancelTransaction(VendingMachine vendingMachine) {
        System.out.println("Transaction cancelled. Returning current balance: " + vendingMachine.getCurrentBalance());
        vendingMachine.setState(new IdleSate());
        vendingMachine.setCurrentBalance(-vendingMachine.getCurrentBalance()); // Reset balance
        System.out.println("Balance reset to 0.");
    }
}
