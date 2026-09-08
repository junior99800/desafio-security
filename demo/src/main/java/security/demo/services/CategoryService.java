package security.demo.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import security.demo.dto.CategoryDTO;
import security.demo.dto.ProductDTO;
import security.demo.dto.ProductMinDTO;
import security.demo.entities.Category;
import security.demo.entities.Product;
import security.demo.repository.CategoryRepository;
import security.demo.repository.ProductRepository;

import java.util.List;

public class CategoryService {

    @Autowired
    private CategoryRepository repository;


    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> result = repository.findAll();
        return result.stream().map(x -> new CategoryDTO(x)).toList();
    }




}
