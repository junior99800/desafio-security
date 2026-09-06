package security.demo.dto;

import jakarta.persistence.Column;
import lombok.Getter;
import org.springframework.security.core.GrantedAuthority;
import security.demo.entities.User;

import java.util.ArrayList;
import java.util.List;


@Getter
public class UserDTO {

    private long id;
    private String name;
    private String email;



    private List<String> roles = new ArrayList<>();


    public UserDTO(User entity) {
        id = entity.getId();
        name = entity.getName();
        email = entity.getEmail();
        for(GrantedAuthority role: entity.getRoles()){
            roles.add(role.getAuthority());
        }
    }



}
