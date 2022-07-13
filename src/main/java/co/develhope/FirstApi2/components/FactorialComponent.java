package co.develhope.FirstApi2.components;

import org.springframework.stereotype.Component;

/**
 * @author Tania Ielpo
 */
@Component
public class FactorialComponent {

    public int factorial(int n){
        if (n <= 2)
            return n;
        return n * factorial(n - 1);
    }
}
