package pl.edu.pwsztar.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
public class ProducktDto implements Serializable {
    private String producktName;
    private double cost;
}
