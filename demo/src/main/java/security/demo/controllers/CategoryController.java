package security.demo.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import security.demo.dto.CategoryDTO;
import security.demo.dto.ProductDTO;
import security.demo.dto.ProductMinDTO;
import security.demo.services.CategoryService;



import java.util.List;


@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    private CategoryService service;


    @GetMapping
    public ResponseEntity<List<CategoryDTO>> findAll() {
        List<CategoryDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }


}
