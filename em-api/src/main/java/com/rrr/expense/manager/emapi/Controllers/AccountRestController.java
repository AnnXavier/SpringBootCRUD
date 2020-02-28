package com.rrr.expense.manager.emapi.Controllers;

import Model.Account;
import Model.AccountBuilder;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

@RestController
public class AccountRestController {

    ArrayList<Account> accounts= new ArrayList<Account>();
    Long index =1L;

@GetMapping(value = "/accounts")
 private ResponseEntity<List<Account>> getaccounts(){

    Comparator<String> annLambda = new Comparator<String>() {
        @Override
        public int compare(String s, String t1) {
            return s.length()-t1.length();
        }
    };

    Comparator<String> ann2=  (String a, String b) -> {return 0;};
    accounts.add(AccountBuilder.anAccount()
            .withId(index++)
            .withName("AnaAccount")
            .withDescription("AnaAccountDescription")
            .build());
    return ResponseEntity.ok()
            .body(accounts);

}


    @RequestMapping(method = RequestMethod.POST, path = "/addAccount")
    public ResponseEntity<List<Account>> addAccount(@RequestBody Account acc){

        accounts.add(acc);
        return ResponseEntity.ok().body(accounts);

    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/deleteAccount/{id}")
    public String deleteAccount(@PathVariable int id){
    accounts.remove(id);
    return "SUCCESS!!";

    }
}
