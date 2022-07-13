package co.develhope.FirstApi2.controllers;

import co.develhope.FirstApi2.services.FactorialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Tania Ielpo
 */

@RestController
@RequestMapping

public class FactorialController {

    private FactorialService factorialService;

    @Autowired
    public FactorialController(FactorialService factorialService){
            this.factorialService=factorialService;
    }

    @GetMapping("/factorial/{n}")
    public int factorial(@PathVariable(required = true)int n) {
        return factorialService.factorial(n);
    }
}
