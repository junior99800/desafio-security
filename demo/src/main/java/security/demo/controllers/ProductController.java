package security.demo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import security.demo.dto.ProductDTO;
import security.demo.services.ProductService;

import java.net.URI;
import java.util.List;


@RestController
@RequestMapping(value = "/products")
public class ProductController {


    public ResponseEntity<List<ProductDTO>> findAll(){
    List<ProductDTO> List = productServiceduc.findAll();
    return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<List<ProductDTO>> findById(@PathVariable Long id){
        ProductDTO dto = ProductService.findById(id);
        return ResponseEntity.ok(dto);
    }

    @PostMapping
    public ResponseEntity<ProductDTO> insert(@RequestBody ProductDTO dto) {
        dto = ProductService.insert(dto);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id")
                .buildAndExpand(dto.getId()).toUri();
        return ResponseEntity.created(uri).body(dto);
    }
}
