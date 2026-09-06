package security.demo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import security.demo.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> searchByName(String name);
}
