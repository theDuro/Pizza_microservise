package pl.edu.pwsztar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.pwsztar.domain.dto.BillDto;
import pl.edu.pwsztar.service.UserService;
import pl.edu.pwsztar.service.UserServiceimp;

import java.util.List;

@RestController
public class Controler {
private final UserServiceimp userService;
    @Autowired
    public Controler(UserServiceimp userService) {
        this.userService = userService;
    }

    @CrossOrigin
    @GetMapping(value = "/bills", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<BillDto>> getBills() {
        return new ResponseEntity<>(userService.getAllBills() ,HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(value = "/test", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> test() {


        return new ResponseEntity<>("test" ,HttpStatus.OK);


    }
}
