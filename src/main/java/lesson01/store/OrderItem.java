package lesson01.store;

public class OrderItem {
    private static int counter = 5000;
    private int id;
    private Product product;
    private int quantity;

    {
        id = ++counter;
    }

    public OrderItem(Product product) {
        this.product = product;
    }

    public OrderItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public static int getCount() {
        return counter;
    }

    public static void setCount(int count) {
        OrderItem.counter = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
