package demo;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    public void checkout(String status){
        //Logging
        //Authentication and Authorization
        //Sanitization
        System.out.println("Checking out-- checkout method from ShoppingCart called");
    }
    public int quantity(){
        return 5;
    }
}
