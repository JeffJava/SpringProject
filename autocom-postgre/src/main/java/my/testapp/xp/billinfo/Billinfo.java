package my.testapp.xp.billinfo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import my.testapp.xp.customer.Customer;

@Entity
public class Billinfo {
	
	@Id
	private String id; //water
	private String date;
	private int presentR;
	private int previousR;
	private int currentM;
	private int total;
	@ManyToOne
	private Customer customer;
	
	public Billinfo() {
	}
	
	public Billinfo(String id, String date, int presentR, int previousR, int currentM, int total, String customerId) {
		super();
		this.id = id;
		this.date = date;
		this.presentR = presentR;
		this.previousR = previousR;
		this.currentM = currentM;
		this.total =total;
		this.customer = new Customer(customerId,"");
	}
	
	public String getId() {
		return id;
	} 
	public void setId(String id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}

	public int getPresentR() {
		return presentR;
	}

	public void setPresentR(int presentR) {
		this.presentR = presentR;
	}

	public int getPreviousR() {
		return previousR;
	}

	public void setPreviousR(int previousR) {
		this.previousR = previousR;
	}

	public int getCurrentM() {
		return currentM;
	}

	public void setCurrentM(int currentM) {
		this.currentM = currentM;
	}
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
}
