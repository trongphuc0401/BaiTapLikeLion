package vn.edu.likelion.Day10.Bai2;

/**
 * ShoppingApp -
 *
 * @param
 * @return
 * @throws
 */
public class ShoppingApp {
    public static void main(String[] args) {
        Product product1 = new Product(12,"Cá",5000);
        Product product2 = new Product(13,"Bò",5000);

        Cart cart1 = new Cart();
        cart1.addToCard(product1);
        cart1.addToCard(product2);
        cart1.displayCart();
        System.out.println(cart1.totalPrice());




    }
}
