
package fhw.service;

import fhw.model.Customer;
import fhw.model.CustomerService;
import fhw.service.repo.CustomerServiceRepository;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;


@Stateless(name = "customerService")
public class CustomerServiceImpl
    implements CustomerService
{
    @Inject 
    private CustomerServiceRepository customerServiceRepository; 
    
    @Override 
    @TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
    public Customer createCustomer(Long bankId, String firstName, String lastName)
    {
        Customer c = Customer.builder().bankId(bankId).firstName(firstName).lastName(lastName).build();        
        System.out.println("Is the CSR null:  " + (null == customerServiceRepository)); 
        return(customerServiceRepository.createCustomer(c)); 
    }
    
}
