package pl.edu.pwsztar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.pwsztar.domain.dto.BillDto;
import pl.edu.pwsztar.domain.dto.LoginDto;
import pl.edu.pwsztar.domain.mappers.BillToBillDto;
import pl.edu.pwsztar.domain.repository.BillRepository;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class UserServiceimp implements UserService{
    private final BillRepository billRepository;
    private final BillToBillDto billToBillDto;
@Autowired
    public UserServiceimp(BillRepository billRepository, BillToBillDto billToBillDto) {
        this.billRepository = billRepository;
        this.billToBillDto = billToBillDto;
}

    @Override
    public List<BillDto> getAllBills() {
        return billRepository.findAll()
                .stream()
                .map(billToBillDto::toBillDto)
                .collect(Collectors.toList());

    }

    @Override
    public void addBill(BillDto billDto) {

    }

    @Override
    public void login(LoginDto loginDto) {

    }

    @Override
    public void registration(LoginDto loginDto) {

    }
}
