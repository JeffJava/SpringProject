package my.testapp.xp.customer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	

	
	public List<Customer> getAllCustomer(){
		//return customers;
		List<Customer> customers = new ArrayList<>();
		customerRepository.findAll()
		.forEach(customers::add);
		
		return customers;
	}
	
	public Customer getCustomer(String id) {
		//return customers.stream().filter(c -> c.getId().equals(id)).findFirst().get();
		return customerRepository.findOne(id);
	}

	public void addCustomer(Customer customer) {
		//customers.add(customer);
		customerRepository.save(customer);
	}

	public void updateCustomer(String id, Customer customer) {
		/*for(int i = 0; i < customers.size(); i++) {
			Customer c = customers.get(i);
			if(c.getId().equals(id)) {
				customers.set(i, customer);
				return;
			}
		}*/
		customerRepository.save(customer);
		
	}

	public void deleteCustomer(String id) {
		//customers.removeIf(c -> c.getId().equals(id));
		customerRepository.delete(id);
		
	}
}
