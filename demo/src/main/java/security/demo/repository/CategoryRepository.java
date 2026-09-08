package security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import security.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
