package uabc.videoclubs.services;

import java.util.Optional;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uabc.videoclubs.entities.Customer;
import uabc.videoclubs.entities.CustomerIndex;
import uabc.videoclubs.repository.CustomerRepository;

@Service
public class CustomerService implements ICustomerService{
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public List<CustomerIndex> getCustomers(){
        return customerRepository.getCustomers();
    }
    @Override
	public Optional<Customer> findById(Integer id) {
		return customerRepository.findById(id);
	}
}
