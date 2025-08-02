package VendingMachine;

public class AmountInsertedState implements State{
    @Override
    public void insertAmount(VendingMachine vendingMachine, int amount) {
        vendingMachine.addAmount(amount);
        System.out.println("Amount inserted: " + amount);
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, String productCode) {
        Product product = vendingMachine.getProduct(productCode);
        if (product != null) {
            if (vendingMachine.getProductInventory().getInventory().get(product) > 0) {
                if (vendingMachine.getCurrentBalance() >= product.getPrice()) {
                    System.out.println("Product selected: " + product.getName());
                    vendingMachine.setSelectedProduct(product);

                    vendingMachine.setState(new DispenseState());
                    vendingMachine.dispenseProduct();
                } else {
                    System.out.println("Insufficient balance to select the product.");
                }
            } else {
                System.out.println("Selected product is out of stock.");
            }
        } else {
            System.out.println("Invalid product code.");
        }
    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) {
        System.out.println("Please select a product before dispensing.");
    }

    @Override
    public void cancelTransaction(VendingMachine vendingMachine) {
        System.out.println("Transaction cancelled. Returning current balance: " + vendingMachine.getCurrentBalance());
        vendingMachine.setState(new IdleSate());
        vendingMachine.setCurrentBalance(0); // Reset balance
        System.out.println("Balance reset to 0.");
    }
}
