package Entity;

import java.util.Date;
import java.util.List;

public class Bill {

	private String id;
	private Double total;
	private String customerName;
	private String phone;
	private Date saledDate;
	private Staff staff;
	private List<Product> product;

	public Bill() {
		// TODO Auto-generated constructor stub
	}
	

	public Bill(String id, Double total, String customerName, String phone, Date saledDate, Staff staff,
			List<Product> product) {
		super();
		this.id = id;
		this.total = total;
		this.customerName = customerName;
		this.phone = phone;
		this.saledDate = saledDate;
		this.staff = staff;
		this.product = product;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public Double getTotal() {
		return total;
	}


	public void setTotal(Double total) {
		this.total = total;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public Date getSaledDate() {
		return saledDate;
	}


	public void setSaledDate(Date saledDate) {
		this.saledDate = saledDate;
	}


	public Staff getStaff() {
		return staff;
	}


	public void setStaff(Staff staff) {
		this.staff = staff;
	}


	public List<Product> getProduct() {
		return product;
	}


	public void setProduct(List<Product> product) {
		this.product = product;
	}


	public void showInfor() {
		// TODO - implement Bill.showInfor
		throw new UnsupportedOperationException();
	}

}