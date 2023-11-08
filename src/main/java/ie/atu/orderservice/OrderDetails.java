package ie.atu.orderservice;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetails {

    @JsonProperty("orderID")
    private int orderID;
    @JsonProperty("productID")
    private int productID;
    @JsonProperty("quantity")
    private int quantity;
    @JsonProperty("customerID")
    private int customerID;
}
