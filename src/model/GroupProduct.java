package model;

public class GroupProduct {
	private long idgroupproduct;
	private String namegroup;
	private byte[] image;
	private String status;
	public GroupProduct() {
		
	}
	public GroupProduct(long idgroupproduct, String namegroup, byte[] image, String status) {
		super();
		this.idgroupproduct = idgroupproduct;
		this.namegroup = namegroup;
		this.image = image;
		this.status = status;
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
}
