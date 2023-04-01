package pl.edu.pwsztar.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.edu.pwsztar.domain.dto.BillDto;

import java.util.List;

@RestController
public class Controler {


    @CrossOrigin
    @GetMapping(value = "/comands", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<BillDto>> getBills() {
        //LOGGER.info("find all comands");


        return new ResponseEntity<>( HttpStatus.OK);
        //shoud return list off bills

    }
}
