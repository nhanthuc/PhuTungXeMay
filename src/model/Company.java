package model;

public class Company {
	private long id;
	private String name;
	private String address;
	private String phone;
	private String fax;
	public Company() {
		
	}
	
	
	public Company(long id, String name, String address, String phone, String fax) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.fax = fax;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
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
