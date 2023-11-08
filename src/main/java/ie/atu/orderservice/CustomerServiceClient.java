package ie.atu.orderservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "customer-service", url = "http://localhost:8082")
public interface CustomerServiceClient {
    @PostMapping("/customer")
    String someDetails (@RequestBody OrderDetails orderDetails);

}
