package Singleton.business;

public class ShoppingSession {
    public void addProductToCart(Product product, int pieces){
        ShoppingCart.getInstance().addToCart(product, pieces);
    }

    public void checkout(){
        ShoppingCart.getInstance().checkout();
    }
}

