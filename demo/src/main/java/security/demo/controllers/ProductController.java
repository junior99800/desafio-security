package security.demo.controllers;

import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import security.demo.dto.ProductDTO;
import security.demo.dto.ProductMinDTO;
import security.demo.services.ProductService;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping(value = "/products")
public class ProductController {

    private ProductService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<List<ProductDTO>> findById(@PathVariable Long id){
        ProductDTO dto = ProductService.findById(id);
        return ResponseEntity.ok(dto);
    }

    @GetMapping
    public ResponseEntity<Page<ProductMinDTO>> findAll(@RequestParam (name = "name",
            defaultValue = "")String name, Pageable pageable) {
        Page<ProductMinDTO> dto = service.findAll(name, pageable);
        return ResponseEntity.ok(dto);
    }

    @PreAuthorize("hasRole('ROLE_ADMIN')")
    @PostMapping
    public ResponseEntity<ProductDTO> insert(@Valid @RequestBody ProductDTO dto) {
        dto = ProductService.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }
}
