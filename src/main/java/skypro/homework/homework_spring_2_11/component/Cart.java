package skypro.homework.homework_spring_2_11.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.*;

@Component
@SessionScope
public class Cart {
   private final List<Integer> userCart = new ArrayList<>();

   public void addToCart(List<Integer> idsToAdd) {
       userCart.addAll(idsToAdd);
   }

   public List<Integer> getCartContent() {
       return Collections.unmodifiableList(userCart);
   }

}
