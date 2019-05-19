package model;

public class User {
	private long iduser;
	private String name;
	private String username;
	private String password;
	private String status;
	private String gioitinh;
	private String dia_chi;
	private String sdt;
	private String mail;
	public User() {
		
	}
	public User(long iduse, String name, String username, String password, String status, String gioitinh, String dia_chi,
			String sdt, String mail) {
		super();
		this.iduser = iduse;
		this.name = name;
		this.username = username;
		this.password = password;
		this.status = status;
		this.gioitinh = gioitinh;
		this.dia_chi = dia_chi;
		this.sdt = sdt;
		this.mail = mail;
	}
	public long getIduse() {
		return iduser;
	}
	public void setIduse(long iduse) {
		this.iduser = iduse;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsename() {
		return username;
	}
	public void setUsename(String usename) {
		this.username = usename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGioitinh() {
		return gioitinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}
	public String getDia_chi() {
		return dia_chi;
	}
	public void setDia_chi(String dia_chi) {
		this.dia_chi = dia_chi;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	

}
