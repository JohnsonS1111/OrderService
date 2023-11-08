package ie.atu.orderservice;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Data
@Service
public class OrderService {

    private List<OrderDetails> orders = new ArrayList<>();

    public void createOrder(OrderDetails od){
        orders.add(od);
    }

    public List<OrderDetails> getOrderBlyd() {
        return orders;
    }
}