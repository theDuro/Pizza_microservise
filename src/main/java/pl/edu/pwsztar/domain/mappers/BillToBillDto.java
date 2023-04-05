package pl.edu.pwsztar.domain.mappers;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.BillDto;
import pl.edu.pwsztar.domain.enity.Bill;
@Component
public class BillToBillDto {
    public BillDto toBillDto(Bill bill){
        BillDto billDto = new BillDto();
        billDto.setCost(bill.getCost());
        billDto.setCustomerName(bill.getCustomerName());
        billDto.setProduckts(billDto.getProduckts());
        billDto.setUserId(bill.getUserId());
        return billDto;
    }
}
