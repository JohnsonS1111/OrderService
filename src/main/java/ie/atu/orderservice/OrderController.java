package ie.atu.orderservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    private final CustomerServiceClient customerServiceClient;
    private OrderService orderService;

    @Autowired
    public void setOrderService(OrderService orderService){
        this.orderService = orderService;
    }

    @Autowired
    public OrderController(CustomerServiceClient customerServiceClient){
        this.customerServiceClient = customerServiceClient;
    }

    @GetMapping("/getBuild")
    public @ResponseBody List<OrderDetails> getOrder(){
        return orderService.getOrderBlyd();
    }

    @PostMapping("/createOrder")
    public String createOrder(@RequestBody OrderDetails od){
        orderService.createOrder(od);
        return "Order Added";
    }

    @PostMapping("/customer")
    public String orderRequest(@RequestBody OrderDetails od){
        return customerServiceClient.someDetails(od);
    }
}
