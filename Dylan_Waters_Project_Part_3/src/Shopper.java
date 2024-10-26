public class Shopper {
    private Cart cart;

    public Shopper() {
        cart = new Cart();
    }

    public void browseStore(Store store) {
        store.displayAisles();
    }

    public void checkout(Store store) {
        store.checkout(cart);
    }

    public Cart getCart() {
        return cart;
    }
}
