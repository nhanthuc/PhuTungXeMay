package model;

public class Detail_Oder {
	private long id;
	private long oder_id;
	private long product_id;
	private long quantity;
	public Detail_Oder() {
		
	}
	public Detail_Oder(long id, long oder_id, long product_id, long quantity) {
		super();
		this.id = id;
		this.oder_id = oder_id;
		this.product_id = product_id;
		this.quantity = quantity;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getOder_id() {
		return oder_id;
	}
	public void setOder_id(long oder_id) {
		this.oder_id = oder_id;
	}
	public long getProduct_id() {
		return product_id;
	}
	public void setProduct_id(long product_id) {
		this.product_id = product_id;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
}
