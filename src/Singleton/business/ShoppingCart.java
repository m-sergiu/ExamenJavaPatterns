package Singleton.business;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart {
    private static ShoppingCart INSTANCE;
    private static List<Pair<Product, Integer>> cart;
    private ShoppingCart() {
        cart = new ArrayList<>();
    }

    void addToCart(Product product, int pieces){
        cart.add(new Pair<>(product, pieces));
    }

    void checkout(){
        if(cart.isEmpty()){
            System.out.println("cart is empty. nothing to checkout");
        } else{
            System.out.println("checkout:");
            for(Pair<Product, Integer> cartItem : cart){
                System.out.println(cartItem.getKey().productName + " (" + cartItem.getKey().manufacturer + "):" + cartItem.getValue() + " pieces");
            }
            cart.clear();
        }
    }

    static ShoppingCart getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new ShoppingCart();
        }
        return INSTANCE;
    }

}
