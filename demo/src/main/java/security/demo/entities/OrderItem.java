package security.demo.entities;


import lombok.Getter;

@Getter
public class OrderItem {

    private Long productId;
    private String name;
    private Double price;
    private Integer quantity;
}
