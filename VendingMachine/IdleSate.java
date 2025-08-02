package VendingMachine;

public class IdleSate implements State{
    @Override
    public void insertAmount(VendingMachine vendingMachine, int amount) {
        vendingMachine.setCurrentBalance(amount);
        vendingMachine.setState(new AmountInsertedState());
        System.out.println("Amount inserted: " + amount);
    }

    @Override
    public void selectProduct(VendingMachine vendingMachine, String productCode) {
        System.out.println("Please insert amount before selecting a product.");

    }

    @Override
    public void dispenseProduct(VendingMachine vendingMachine) {
        System.out.println("Please insert amount and select a product before dispensing.");
    }

    @Override
    public void cancelTransaction(VendingMachine vendingMachine) {
        System.out.println("No transaction to cancel. Please insert amount first.");
    }
}
