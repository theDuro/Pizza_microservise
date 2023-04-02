package pl.edu.pwsztar.service;

import org.springframework.stereotype.Service;
import pl.edu.pwsztar.domain.dto.BillDto;
import pl.edu.pwsztar.domain.dto.LoginDto;
import pl.edu.pwsztar.domain.enity.Bill;

import java.util.List;

public interface UserService {
    public List<BillDto> getAllBills();
    public void addBill(BillDto billDto);

    public void login(LoginDto loginDto);
    public void registration(LoginDto loginDto);
}
