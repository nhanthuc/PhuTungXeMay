package model;

import java.sql.Date;

public class Customers {
  private long id;
  private String name;
  private Date birth;
  private String province;
  private String address;
  private String tel;
  private String email;
  private String password;
  
public Customers() {}

public Customers(long id, String name, Date birth, String province, String address, String tel, String email,
		String password) {
	super();
	this.id = id;
	this.name = name;
	this.birth = birth;
	this.province = province;
	this.address = address;
	this.tel = tel;
	this.email = email;
	this.password = password;
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
public Date getBirth() {
	return birth;
}
public void setBirth(Date birth) {
	this.birth = birth;
}
public String getProvince() {
	return province;
}
public void setProvince(String province) {
	this.province = province;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
}
