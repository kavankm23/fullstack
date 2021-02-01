package bean;

import java.time.*;
import java .util.Date;

public class Product {
	private int pId;
	private String pName;
	private float pPrice;
	private Date datepurchase;
	
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public float getpPrice() {
		return pPrice;
	}
	public void setpPrice(float pPrice) {
		this.pPrice = pPrice;
	}
	public Date getDatepurchase() {
		return datepurchase;
	}
	public void setDatepurchase(Date datepurchase) {
		this.datepurchase = datepurchase;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pPrice=" + pPrice + ", datepurchase=" + datepurchase
				+ "]";
	}
	public Product(int pId, String pName, float pPrice, Date datepurchase) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pPrice = pPrice;
		this.datepurchase = datepurchase;
	}
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}