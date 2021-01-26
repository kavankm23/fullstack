package service;

import java.io.Serializable;
import java.util.HashMap;

import bean.Product;

public class ProductService implements Serializable
{   
	
	HashMap map = new HashMap<String, Product>();
	String pid = "pid";
	String ppid = "pid";
	
	public String addProduct(int id, String name,float price)
	{
		pid = ppid + id;
		Product pd = new Product(pid,name,price);
		map.put(pid, pd);
		return pid;
	}
	
	public int updateProduct(String pid,float price)
	{
		Product p = (Product) map.get(pid);
		p.setPrice(price);
		return 1;
	}
	
	public int deleteProduct(String pid)
	{
		map.remove(pid);
		return 1;
	}
	
	public HashMap displayAllProduct()
	{		
		return map;
	}
	
	public float retrieveProductPrice(String pid)
	{
		Product p = (Product) map.get(pid);
		return p.getPrice();
	}
	
}