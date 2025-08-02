package VendingMachine;

public interface State {
    void insertAmount(VendingMachine vendingMachine, int amount);
    void selectProduct(VendingMachine vendingMachine, String productCode);
    void dispenseProduct(VendingMachine vendingMachine);
    void cancelTransaction(VendingMachine vendingMachine);
}
