package security.demo.dto;

import lombok.Getter;
import security.demo.entities.OrderItem;

@Getter
public class OrderItemDTO {

    private Long productId;
    private String name;
    private Double price;
    private Integer quantity;

    public OrderItemDTO(Long productId, String name, Double price, Integer quantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public OrderItemDTO(OrderItem entity) {
        productId = entity.getProduct().getId();
        name = entity.getName().getName;
        price = entity.getPrice();
        quantity = entity.getQuantity();
    }

    public double getSubtotal(){
        return price * quantity;
    }
}
