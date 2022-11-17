package skypro.homework.homework_spring_2_11.service;

import org.springframework.stereotype.Service;
import skypro.homework.homework_spring_2_11.component.Cart;

import java.util.List;

@Service
public class OrderService {

    private final Cart cart;

    public OrderService(Cart cart) {
        this.cart = cart;
    }

    public void addToCart(List<Integer> idsToAdd){
        cart.addToCart(idsToAdd);
    }

    public List<Integer> getItems(){
        return cart.getCartContent();
    }

}
