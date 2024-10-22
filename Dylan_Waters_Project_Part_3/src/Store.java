import java.util.List;

public class Store {
    private List<Aisle> aisles;

    public Store(List<Aisle> aisles) {
        this.aisles = aisles;
    }

    public void displayAisles() {
        System.out.println("Available Aisles:");
        for (Aisle aisle : aisles) {
            System.out.println("- " + aisle.getAisleName());
        }
    }

    public void navigateToAisle(Aisle aisle) {
        System.out.println("Navigating to: " + aisle.getAisleName());
        aisle.displayProducts();
    }

    public void checkout(Cart cart) {
        System.out.println("Checking out...");
        System.out.println(cart.displayCart());
        System.out.println("Total Price: $" + cart.getTotal());
    }
}
