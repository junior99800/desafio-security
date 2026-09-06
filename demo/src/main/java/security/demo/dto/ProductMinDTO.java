package security.demo.dto;


import lombok.Getter;
import lombok.Setter;
import security.demo.entities.Product;

@Getter
@Setter
public class ProductMinDTO {

    private Long id;
    private String name;
    private Double price;
    private String imgUrl;

    public ProductMinDTO(Long id, String name, Double price, String imgUrl) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.imgUrl = imgUrl;
    }

    public ProductMinDTO(Product entity) {
        id = getId();
        name = getName();
        price = getPrice();
        imgUrl = getImgUrl();
    }
}
