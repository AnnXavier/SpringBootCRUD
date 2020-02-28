package com.rrr.expense.manager.emapi.Controllers;


import Model.Account;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HealthRestController {

    @GetMapping(value = "/health")
    public  String health(){

        return "The service is up and running!";
    }

    @GetMapping(value = "/error")
    public String error(){

     return "Error Page!!" ;
    }

    @GetMapping(value= "ana")
    public String ana(){

        return "ANNAAAA!!!";
    }


}
