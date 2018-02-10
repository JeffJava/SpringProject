package my.testapp.xp.billinfo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import my.testapp.xp.customer.Customer;


@RestController
public class BillinfoController {
	
	@Autowired
	private BillinfoService billinfoService;

	@RequestMapping("/customers/{id}/billinfos")
	public List<Billinfo> getAllBillinfos(@PathVariable String id) {
		return billinfoService.getAllBillinfos(id);
	}
	
	@RequestMapping("/customers/{customerId}/billinfos/{id}")
	public Billinfo getBillinfo(@PathVariable String id) {
		return billinfoService.getBillinfo(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/customers/{customerId}/billinfos")
	public void addBillinfo(@RequestBody Billinfo billinfo, @PathVariable String customerId) {
		billinfo.setCustomer(new Customer(customerId,""));
		billinfoService.addBillinfo(billinfo);
	} 
	
	@RequestMapping(method=RequestMethod.PUT, value="/customers/{customerId}/billinfos/{id}")
	public void updateBillinfo(@RequestBody Billinfo billinfo, @PathVariable String customerId, @PathVariable String id) {
		billinfo.setCustomer(new Customer(customerId,""));
		billinfoService.updateBillinfo(billinfo);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/customers/{customerId}/billinfos/{id}")
	public void deleteCustomer(@PathVariable String id) {
		billinfoService.deleteBillinfo(id);
	}
	
	
}
