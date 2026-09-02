package security.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;


@Getter
@Setter
@Entity
@Table(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;

    @Column(unique = true)
    private String email;
    private String password;

    @ManyToMany
    @JoinTable(name = "tb_user_role",
                joinColumns = @JoinColumn(name = "user_id"),
                inverseJoinColumns = @JoinColumn(name = "role_id"))
    private Set<Role> roles = new HashSet<>();

    public User(long id, String name, String email, String password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User() {
    }

    public void addrole(Role role) {
        roles.add(role);
    }

    public boolean hasRole(String roleName){
        for(Role role : roles){
            if (role.getAuthority().equals(roleName)){
                return true;
            }
        }
        return false;
    }


}
