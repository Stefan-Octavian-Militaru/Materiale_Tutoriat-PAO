public class Order implements Comparable<Order> {
    private int id;
    private String product;
    private double price;
    private int quantity;
    private boolean isDelivered;

    public Order(int id, String product, double price, int quantity, boolean isDelivered) {
        this.id = id;
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.isDelivered = isDelivered;
    }

    public int getId() {
        return id;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isDelivered() {
        return isDelivered;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", product='" + product + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", isDelivered=" + isDelivered +
                '}';
    }

    @Override
    public int compareTo(Order o) {
        return Double.compare(o.price, this.price);
    }
}
