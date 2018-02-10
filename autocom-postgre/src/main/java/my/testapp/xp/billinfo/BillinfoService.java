package my.testapp.xp.billinfo;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillinfoService {
	
	@Autowired
	private BillinfoRepository billinfoRepository;
	

	
	public List<Billinfo> getAllBillinfos(String customerId){
		//return billinfo;
		List<Billinfo> billinfos = new ArrayList<>();
		billinfoRepository.findByCustomerId(customerId)
		.forEach(billinfos::add);
		return billinfos;
	} 
	
	public Billinfo getBillinfo(String id) {
		//return billinfo.stream().filter(c -> c.getId().equals(id)).findFirst().get();
		return billinfoRepository.findOne(id);
	}

	public void addBillinfo(Billinfo billinfo) {
		//billinfo.add(customer);
		billinfoRepository.save(billinfo);
	}

	public void updateBillinfo(Billinfo billinfo) {
		/*for(int i = 0; i < billinfo.size(); i++) {
			Customer c = billinfo.get(i);
			if(c.getId().equals(id)) {
				billinfo.set(i, customer);
				return;
			}
		}*/
		billinfoRepository.save(billinfo);
		
	}

	public void deleteBillinfo(String id) {
		//billinfo.removeIf(c -> c.getId().equals(id));
		billinfoRepository.delete(id);
		
	}
}
