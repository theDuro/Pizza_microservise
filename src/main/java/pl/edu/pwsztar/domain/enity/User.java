package pl.edu.pwsztar.domain.enity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Table(name = "user")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private long userId;
    @Column(name = "login")
    private String login;

    @Column(name = "password")
    @JsonIgnore
    private String password;

    @Column(name = "born_date")
    private Date bornDate;

    @Column(name ="email")
    private String email;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Bill> bills = new HashSet<>();

}
