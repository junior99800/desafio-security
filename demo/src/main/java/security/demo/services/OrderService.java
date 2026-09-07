package security.demo.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import security.demo.dto.OrderDTO;
import security.demo.dto.ProductDTO;
import security.demo.entities.Product;
import security.demo.repository.Orderepository;
import security.demo.repository.ProductRepository;

@Service
public class OrderService  {


    @Autowired
    private Orderepository repository;

    @Transactional
    public OrderDTO findById(Long id){
        Product product = repository.findById(id).orElseThrow(
                () -> new RumtimeNotFoundExeception("Recuso não encontrado"));
        return new OrderDTO(order);

    }

}
