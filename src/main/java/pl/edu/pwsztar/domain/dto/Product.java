package pl.edu.pwsztar.domain.dto;

import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product implements Serializable {
    private String name;
    private String ingredients;
    private BigDecimal cost;
    private boolean isProduckOnlyForAdults;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", cost=" + cost +
                ", isProductOnlyForAdults=" + isProduckOnlyForAdults +
                '}';
    }


}

