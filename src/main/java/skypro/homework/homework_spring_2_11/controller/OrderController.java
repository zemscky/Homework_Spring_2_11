package skypro.homework.homework_spring_2_11.controller;

import org.springframework.web.bind.annotation.*;
import skypro.homework.homework_spring_2_11.service.OrderService;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class OrderController {
    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/add")
    public void addItems(@RequestParam List<Integer> idsToAdd){
        this.orderService.addToCart(idsToAdd);
    }

    @GetMapping("/get")
    public List<Integer> getItems() {
        return this.orderService.getItems();
    }

}
