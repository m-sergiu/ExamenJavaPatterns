package Singleton;

import Singleton.business.Product;
import Singleton.business.ShoppingSession;

public class Client {
    public static void main(String[] args){
        Product product1 = new Product("product1", "manufacturer1");
        Product product2 = new Product("product2", "manufacturer2");
        Product product3 = new Product("product3", "manufacturer3");
        Product product4 = new Product("product4", "manufacturer4");

        ShoppingSession shoppingSession1 = new ShoppingSession();
        ShoppingSession shoppingSession2 = new ShoppingSession();

        shoppingSession1.addProductToCart(product1, 2);
        shoppingSession1.addProductToCart(product2, 5);

        shoppingSession2.addProductToCart(product3, 2);
        shoppingSession2.addProductToCart(product4, 1);

        shoppingSession1.checkout();
        shoppingSession2.checkout();
    }
}
