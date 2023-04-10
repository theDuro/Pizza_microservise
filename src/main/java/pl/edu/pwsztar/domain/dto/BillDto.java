package pl.edu.pwsztar.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BillDto {
    private long userId;
    private String produckts;
    //json -> list off produckts
    private double cost;

}
