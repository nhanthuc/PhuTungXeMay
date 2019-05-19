package model;

public class Detail_Oder {
	private long id;
	private long id_Oder;
	private long product_id;
	private long quantity;
	private long magio_hang;
	public Detail_Oder() {
		
	}
	public Detail_Oder(long id, long oder_id, long product_id, long quantity, long magio_hang) {
		super();
		this.id = id;
		this.id_Oder = oder_id;
		this.product_id = product_id;
		this.quantity = quantity;
		this.magio_hang = magio_hang;
	}
	public long getId_Oder() {
		return id_Oder;
	}
	public void setId_Oder(long id_Oder) {
		this.id_Oder = id_Oder;
	}
	public long getMagio_hang() {
		return magio_hang;
	}
	public void setMagio_hang(long magio_hang) {
		this.magio_hang = magio_hang;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
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
