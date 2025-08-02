package VendingMachine;

public class VendingMachine {
    private State state;
    private final Inventory<Product> productInventory ;
     // Initializing the inventory
     // This will hold the products available in the vending machine

    private int currentBalance ;

    private Product selectedProduct;
     public VendingMachine(){
        this.state = new IdleSate(); // Initial state
        this.productInventory = new Inventory<Product>();// Initial state
        this.currentBalance = 0; // Initial balance

     }

    public void addAmount(int amount) {
         state.insertAmount(this, amount);
    }

    public void setState(State state) {
        this.state = state;
    }

    public Inventory<Product> getProductInventory() {
        return productInventory;
    }

    public void selectProduct(String productCode) {
         state.selectProduct(this, productCode);
    }

    public Product getProduct(String productCode) {
         return productInventory.getInventory().keySet().stream()
                .filter(product -> product.getId().equals(productCode))
                .findFirst()
                .orElse(null);
    }

    public int getCurrentBalance() {
         return this.currentBalance;
    }

    public Product getSelectedProduct() {
         return selectedProduct;
    }

    public void setCurrentBalance(int amount) {
            this.currentBalance = amount;
    }

    public void dispenseProduct() {
         state.dispenseProduct(this);
    }

    public void setSelectedProduct(Product product) {
        this.selectedProduct = product;
    }

    public void refillProduct(String code, String name, int amount, int quantity) {
        Product product = new Product(code, name, amount);
        this.productInventory.addItem(product, quantity);
        System.out.println("Product refilled: " + product.getName() + " with quantity: " + quantity);
    }

    public void refund() {
        //state.cancelTransaction(this);
        System.out.println("Refunded amount: " + currentBalance);
        this.currentBalance = 0; // Reset balance after refund
        System.out.println("Balance reset to 0.");
    }

    public void cancelTransaction() {
        state.cancelTransaction(this);
        System.out.println("Transaction cancelled. Returning current balance: " + currentBalance);
        this.currentBalance = 0; // Reset balance after cancellation
        System.out.println("Balance reset to 0.");
    }
}
