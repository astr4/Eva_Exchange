package com.ayberkortancalar.eva_exchange;

import java.rmi.ServerException;
import java.util.List;

import org.springframework.beans
        .factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http
        .ResponseEntity;
import org.springframework.web.bind.annotation.*;

// Creating the REST controller
@RestController
@RequestMapping(path = "/buy")
public class BuyController {

    @GetMapping(
            path = "/",
            produces = "application/json")
    public ResponseEntity<List<Share>> getRegisteredShares()
    {

        return new ResponseEntity<>(RegisteredShares.getShares(), HttpStatus.OK);
    }


}