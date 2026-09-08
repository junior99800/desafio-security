package security.demo.services;


import org.springframework.stereotype.Service;
import security.demo.entities.User;
import security.demo.services.exception.ForbiddenException;

@Service
public class AuthService {

    private UserService userService;

    public void validateSelforAdmin(long userId) {
        User me = userService.authenticated();
        if (!me.hasRole("ROLE_ADMIN") && !me.getId().equals(userId)){
            throw new ForbiddenException("Acesso negado");
        }
    }
}
