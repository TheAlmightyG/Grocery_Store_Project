import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> items;

    public Cart() {
        items = new ArrayList<>();
    }

    public void addItem(Product product) {
        items.add(product);
        System.out.println(product.getProductName() + " added to cart.");
    }

    public void removeItem(Product product) {
        items.remove(product);
        System.out.println(product.getProductName() + " removed from cart.");
    }

    public void displayCart() {
        System.out.println("Cart Contents:");
        for (Product item : items) {
            System.out.println(item.getDetails());
        }
    }

    public double getTotal() {
        return items.stream().mapToDouble(Product::getPrice).sum();
    }

    // Optional: Save cart to file
    public void saveCart(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Product item : items) {
                writer.write(item.getProductName() + "," + item.getPrice());
                writer.newLine();
            }
            System.out.println("Cart saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving cart: " + e.getMessage());
        }
    }

    // Optional: Load cart from file
    public void loadCart(String filename) {
        items.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 2) {
                    String productName = data[0];
                    double price = Double.parseDouble(data[1]);
                    items.add(new Product(productName, price));
                }
            }
            System.out.println("Cart loaded from " + filename);
        } catch (IOException e) {
            System.out.println("Error loading cart: " + e.getMessage());
        }
    }
}
