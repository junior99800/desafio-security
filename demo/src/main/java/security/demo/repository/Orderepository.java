package security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import security.demo.entities.Order;

public interface Orderepository extends JpaRepository<Order,Long> {
}
