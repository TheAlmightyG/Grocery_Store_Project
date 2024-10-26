import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Aisle> aisles;

    public Store() {
        aisles = new ArrayList<>();
        initializeAisles();
    }

    private void initializeAisles() {
        List<Product> produceProducts = List.of(
                new Product("Apple", 0.50),
                new Product("Banana", 0.30)
        );
        List<Product> dairyProducts = List.of(
                new Product("Milk", 1.99),
                new Product("Cheese", 3.50)
        );
        List<Product> breadProducts = List.of(
                new Product("Bread", 2.50),
                new Product("Bagel", 1.25)
        );
        List<Product> sweetsProducts = List.of(
                new Product("Candy", 0.99),
                new Product("Chocolate", 1.50)
        );

        aisles.add(new Aisle("Produce", produceProducts));
        aisles.add(new Aisle("Dairy", dairyProducts));
        aisles.add(new Aisle("Bread", breadProducts));
        aisles.add(new Aisle("Sweets", sweetsProducts));
    }

    public void displayAisles() {
        System.out.println("Available Aisles:");
        for (Aisle aisle : aisles) {
            System.out.println("- " + aisle.getAisleName());
            aisle.displayProducts();
        }
    }

    public void checkout(Cart cart) {
        System.out.println("Checkout:");
        cart.displayCart();
        System.out.printf("Total: $%.2f\n", cart.getTotal());
    }

    public List<Aisle> getAisles() {
        return aisles;
    }
}
