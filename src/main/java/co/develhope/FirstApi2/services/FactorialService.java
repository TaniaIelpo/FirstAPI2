package co.develhope.FirstApi2.services;


import co.develhope.FirstApi2.components.FactorialComponent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Tania Ielpo
 */
@Service
public class FactorialService {

    private FactorialComponent factorialComponent;

    @Autowired
    public FactorialService(FactorialComponent factorialComponent){
        this.factorialComponent=factorialComponent;
    }

    public int factorial(int n){
        return factorialComponent.factorial(n);
    }
}
