package model;

import java.sql.Date;

public class Oders {
	private long id_oder;
	private long custumer_id;
	private double total_money;
	private Date date;
	private String status;
	public Oders() {
	}
	
	public Oders(long id_oder, long custumer_id, double total_money, Date date, String status) {
		super();
		this.id_oder = id_oder;
		this.custumer_id = custumer_id;
		this.total_money = total_money;
		this.date = date;
		this.status = status;
	}

	public long getId_oder() {
		return id_oder;
	}
	public void setId_oder(long id_oder) {
		this.id_oder = id_oder;
	}
	public long getCustumer_id() {
		return custumer_id;
	}
	public void setCustumer_id(long custumer_id) {
		this.custumer_id = custumer_id;
	}
	public double getTotal_money() {
		return total_money;
	}
	public void setTotal_money(double total_money) {
		this.total_money = total_money;
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
	private long ma_gio_hang;
}
