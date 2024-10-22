import java.util.Arrays;

public class GroceryStoreApp {
    public static void main(String[] args) {
        // Creating products
        Product apple = new Product("Apple", 0.99);
        Product milk = new Product("Milk", 1.99);
        Product bread = new Product("Bread", 2.49);
        Product chocolate = new Product("Chocolate", 1.50);

        // Creating aisles
        Aisle produceAisle = new Aisle("Produce", Arrays.asList(apple));
        Aisle dairyAisle = new Aisle("Dairy", Arrays.asList(milk));
        Aisle breadAisle = new Aisle("Bread", Arrays.asList(bread));
        Aisle sweetsAisle = new Aisle("Sweets", Arrays.asList(chocolate));

        // Creating store with aisles
        Store store = new Store(Arrays.asList(produceAisle, dairyAisle, breadAisle, sweetsAisle));

        // Creating a shopper and browsing the store
        Shopper shopper = new Shopper();
        shopper.browseStore(store);

        // Adding items to cart
        shopper.getCart().addItem(apple);
        shopper.getCart().addItem(milk);

        // Checking out
        shopper.checkout(store);
    }
}
