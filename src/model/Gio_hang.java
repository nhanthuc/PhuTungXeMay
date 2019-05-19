package model;

import java.sql.Date;

public class Gio_hang {
	private long magiohang;
	private String name_guest;
	private double total_money;
	private Date date;
	public Gio_hang() {
		
	}
	
	public Gio_hang(long magiohang, String name_guest, double total_money, Date date, String status, String sdt,
			String diachi) {
		super();
		this.magiohang = magiohang;
		this.name_guest = name_guest;
		this.total_money = total_money;
		this.date = date;
		this.status = status;
		this.sdt = sdt;
		this.diachi = diachi;
	}

	public long getMagiohang() {
		return magiohang;
	}
	public void setMagiohang(long magiohang) {
		this.magiohang = magiohang;
	}
	public String getName_guest() {
		return name_guest;
	}
	public void setName_guest(String name_guest) {
		this.name_guest = name_guest;
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
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	private String status;
	private String sdt;
	private String diachi;
	
}
