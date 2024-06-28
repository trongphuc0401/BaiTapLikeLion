package vn.edu.likelion.Day10.Bai2;

import java.util.ArrayList;
import java.util.List;

/**
 * Cart -
 *
 * @param
 * @return
 * @throws
 */
public class Cart {
    List<Product> listProduct;

    public Cart() {
        this.listProduct = new ArrayList<>();
    }

    public void addToCard(Product product) {
        product.setProductId(product.getProductId());
        product.setProductName(product.getProductName());
        product.setPrice(product.getPrice());
        listProduct.add(product);
    }

    public void displayCart() {
        for (Product product: listProduct) {
            System.out.println( product.getProductId());
            System.out.println( product.getProductName());
            System.out.println( product.getPrice());
        }
    }

    public double totalPrice() {
        double sum= 0;
        for (Product p : listProduct) {
            sum =  sum + p.getPrice();
        }
        return sum;
    }

}
