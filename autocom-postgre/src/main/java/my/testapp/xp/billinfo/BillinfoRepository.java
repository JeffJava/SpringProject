package my.testapp.xp.billinfo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BillinfoRepository extends CrudRepository<Billinfo, String>{
	
	public List<Billinfo> findByCustomerId(String customerId);

}
