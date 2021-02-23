package com.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Porder")	//if table name and class name different.
public class POrder {
	@Id
	private int Oid;
	private String Pname;
	private int Qty;
	private float Price;
	private LocalDate Odate;
	private String Status;
	
	public int getOid() {
		return Oid;
	}
	
	public void setOid(int oid) {
		Oid = oid;
	}
	
	public String getPname() {
		return Pname;
	}
	
	public void setPname(String pname) {
		Pname = pname;
	}
	
	public int getQty() {
		return Qty;
	}
	
	public void setQty(int qty) {
		Qty = qty;
	}
	
	public float getPrice() {
		return Price;
	}
	
	public void setPrice(float price) {
		Price = price;
	}
	
	public LocalDate getOdate() {
		return Odate;
	}
	public void setOdate(LocalDate odate) {
		Odate = odate;
	}
	
	public String getStatus() {
		return Status;
	}
	
	public void setStatus(String status) {
		Status = status;
	}
	
	@Override
	public String toString() {
		return "Porder [OrderId = " + Oid +" , ProductName = " + Pname +" , Quantity = " + Qty +" Price = " + Price +" OrderDate = " + Odate +" Status = " + Status +"]";
	}
}
