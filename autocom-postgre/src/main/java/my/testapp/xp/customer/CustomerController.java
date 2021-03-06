package my.testapp.xp.customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;

	@RequestMapping("/customers")
	public List<Customer>getAllCustomer() {
		return customerService.getAllCustomer();
	}
	
	@RequestMapping("/customers/{id}")
	public Customer getCustomer(@PathVariable String id) {
		return customerService.getCustomer(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/customers")
	public void addCustomer(@RequestBody Customer customer) {
		customerService.addCustomer(customer);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/customers/{id}")
	public void updateCustomer(@RequestBody Customer customer, @PathVariable String id) {
		customerService.updateCustomer(id, customer);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/customers/{id}")
	public void deleteCustomer(@PathVariable String id) {
		customerService.deleteCustomer(id);
	}
	
	
}
