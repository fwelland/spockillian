package fhw.service.repo;

import fhw.model.Customer; 
import javax.inject.Named;


@Named 
public class CustomerServiceRepository
{
    
    public CustomerServiceRepository() {}
    
    
    
    public Customer createCustomer(Customer c)
    {
        System.out.println("woohoo I created a customer:  " + c.getFirstName()); 
        return(c);
    }
}
