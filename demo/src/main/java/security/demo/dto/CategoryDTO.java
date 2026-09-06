package security.demo.dto;

import lombok.Getter;
import lombok.Setter;
import security.demo.entities.Category;


@Getter
@Setter
public class CategoryDTO {

    private long id;
    private String name;

    public CategoryDTO(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoryDTO(Category entity) {
        id = entity.getId(); ;
        name = entity.getName();
    }
}
