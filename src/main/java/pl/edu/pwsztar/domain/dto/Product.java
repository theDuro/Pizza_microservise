package pl.edu.pwsztar.domain.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Product {
    private String name;
    private String ingredients;
    private double cost;
    private boolean isProduckOnlyForAdults;
}
