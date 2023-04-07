package pl.edu.pwsztar.domain.enity;

import com.google.gson.Gson;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@AllArgsConstructor
@Setter
@Getter
@NoArgsConstructor
@Table(name = "bill")
public class Bill implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "user_id")
    private long userId;
    @Column(name = "customer_name")
    private String customerName;
    //JSON list of Produckts
     @Column(name = "products")
    private String produckts;

     @Column(name = "cost")
     private double cost;
    //@ManyToOne
   // private User user;

}






