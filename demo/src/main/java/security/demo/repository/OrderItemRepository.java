package security.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import security.demo.entities.OrderItem;
import security.demo.entities.OrderItemPK;

public interface OrderItemRepository  extends JpaRepository<OrderItem, OrderItemPK> {
}
