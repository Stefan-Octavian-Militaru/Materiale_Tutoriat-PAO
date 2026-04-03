public class Product {
    private String productName;
    private double price;
    private static int contor;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public Product (Product other){
        this.productName = other.productName;
        this.price = other.price;
    }

    public double applySale(double sale) { // sale is for example 0.2 which means 20%
        price = price - price * sale;
        return price;
    }

    public int getContor() {
        return contor;
    }

    @Override
    public String toString() {
        return "Product [productName=" + productName + ", price=" + price + "]";
    }

    @Override
    public boolean equals(Object other){
        if (!(other instanceof Product)) {
            return false;
        }
        else {
            Product otherProduct = (Product) other;
            if (this.productName.equals(otherProduct.productName)) {
                if (this.price == otherProduct.price) {
                    return true;
                }
            }
            return false;
        }
    }

    static{
        contor = 0;
    }

    {
        contor++;
    }

}


