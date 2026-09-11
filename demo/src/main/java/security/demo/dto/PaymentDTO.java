package security.demo.dto;

import lombok.Getter;
import security.demo.entities.Payment;
import security.demo.entities.User;

import java.time.Instant;

@Getter
public class PaymentDTO {

    private Long id;
    private Instant moment;

    public PaymentDTO(Long id, Instant moment) {
        this.id = id;
        this.moment = moment;
    }

    public PaymentDTO(Payment entity) {
        id = entity.getId();
        moment = entity.getMoment();
    }
}
