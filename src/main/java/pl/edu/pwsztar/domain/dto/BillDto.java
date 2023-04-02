package pl.edu.pwsztar.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BillDto {
    private Long id;
    private long userId;
    private String customerName;
    private String produckts;
    private double cost;

}
