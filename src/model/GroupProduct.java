package model;

public class GroupProduct {
	private long idgroupproduct;
	private String namegroup;
	private byte[] image;
	private String status;
	private long id_sp;
	public GroupProduct() {
		
	}
	public GroupProduct(long idgroupproduct, String namegroup, byte[] image, String status, long id_sp) {
		super();
		this.idgroupproduct = idgroupproduct;
		this.namegroup = namegroup;
		this.image = image;
		this.status = status;
		this.id_sp = id_sp;
	}
	public long getIdgroupproduct() {
		return idgroupproduct;
	}
	public void setIdgroupproduct(long idgroupproduct) {
		this.idgroupproduct = idgroupproduct;
	}
	public String getNamegroup() {
		return namegroup;
	}
	public void setNamegroup(String namegroup) {
		this.namegroup = namegroup;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public long getId_sp() {
		return id_sp;
	}
	public void setId_sp(long id_sp) {
		this.id_sp = id_sp;
	}
}
