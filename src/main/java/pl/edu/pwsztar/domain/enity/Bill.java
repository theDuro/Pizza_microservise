package pl.edu.pwsztar.domain.enity;

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
    @Column(name = "bill_id", nullable = false)
    private Long bill_id;

    @Type(type = "json",typeClass = JsonType.class)
    @Column(columnDefinition = "jsonb")
    private List<String> tags;

}





}
