package vn.edu.likelion.Day10.Bai2;

/**
 * Product -
 *
 * @param
 * @return
 * @throws
 */
public class Product {
    int productId;
    String productName;
    double price;
    static final String storeName = "ABC Store";

    public Product(int productId, String productName, double price) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
