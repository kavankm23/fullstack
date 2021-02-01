package bean;

import java.io.*;

public class Product implements Serializable{
    private int pId;
    private String pName;
    private int pPrice;
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
public int getpPrice() {
	return pPrice;
}
public void setpPrice(int pPrice) {
	this.pPrice = pPrice;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
public Product(int pId, String pName, int pPrice) {
	super();
	this.pId = pId;
	this.pName = pName;
	this.pPrice = pPrice;
}
}
