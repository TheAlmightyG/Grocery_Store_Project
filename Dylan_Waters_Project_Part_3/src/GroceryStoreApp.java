
public class GroceryStoreApp {
    public static void main(String[] args) {
        Store store = new Store();
        Shopper shopper = new Shopper();

        // Browse the store and display aisles
        shopper.browseStore(store);

        // Add items to the cart
        Aisle produceAisle = store.getAisles().get(0); // Example to get the first aisle
        shopper.getCart().addItem(produceAisle.getProducts().get(0)); // Add first product
        shopper.getCart().addItem(produceAisle.getProducts().get(1)); // Add second product
        Aisle dairyAisle = store.getAisles().get(1);
        shopper.getCart().addItem(dairyAisle.getProducts().get(1));
        // Display cart contents
        shopper.getCart().displayCart();

        // Checkout
        shopper.checkout(store);

   
    }
}
