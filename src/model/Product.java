package model;

import java.sql.*;

public class Product {
	private long id_sp;
	private String nameproduct;
	private double price;
	private byte[] image;
	private Date date;
	private String status;
	private long group_product_id;
	private String detail;
	private long companyid;
	public Product() {
		
	}
	
	public Product(long id_sp, String nameproduct, double price, byte[] image, Date date, String status,
			long group_product_id, String detail, long companyid) {
		super();
		this.id_sp = id_sp;
		this.nameproduct = nameproduct;
		this.price = price;
		this.image = image;
		this.date = date;
		this.status = status;
		this.group_product_id = group_product_id;
		this.detail = detail;
		this.companyid = companyid;
	}

	public long getId_sp() {
		return id_sp;
	}
	public void setId_sp(long id_sp) {
		this.id_sp = id_sp;
	}
	public String getNameproduct() {
		return nameproduct;
	}
	public void setNameproduct(String nameproduct) {
		this.nameproduct = nameproduct;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getGroup_product_id() {
		return group_product_id;
	}
	public void setGroup_product_id(long group_product_id) {
		this.group_product_id = group_product_id;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public long getCompanyid() {
		return companyid;
	}
	public void setCompanyid(long companyid) {
		this.companyid = companyid;
	}
	
	

}
