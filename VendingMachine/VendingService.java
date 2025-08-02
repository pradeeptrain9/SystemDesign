package VendingMachine;

public class VendingService {

    public static void main(String[] args) {
        // Create a vending machine instance
        VendingMachine vendingMachine = new VendingMachine();

        vendingMachine.refillProduct("A1", "Soda", 150, 10);

        // Insert amount
        vendingMachine.addAmount(300);

        // vendingMachine.cancelTransaction();

        // Select a product
        vendingMachine.selectProduct("A1");

        vendingMachine.refund();

        // Cancel the transaction
        //vendingMachine.cancelTransaction();
    }
}
