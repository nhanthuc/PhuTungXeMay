package model;

public class Company {
	private String name;
	private String address;
	private String phone;
	private String fax;
	public Company() {
		
	}
	
	
	public Company(String name, String address, String phone, String fax) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.fax = fax;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}

}
