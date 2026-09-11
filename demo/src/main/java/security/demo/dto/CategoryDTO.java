package security.demo.dto;

import lombok.Getter;
import security.demo.entities.Category;


@Getter
public class CategoryDTO {

    private Long id;
    private String name;

    public CategoryDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoryDTO(Category entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public CategoryDTO() {
    }
}
