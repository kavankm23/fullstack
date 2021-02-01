package service;

import bean.Product;
import java.util.*;
import main.ProductOperations;

public class ProductService {
	//Scanner obj1=new Scanner(System.in);
	
	    Map<Integer,Product> hm=new HashMap<Integer,Product>();
	    static int i=1;
	    
	public void addProduct(Product products){
		 //Product[] products=new Product[n]
		 hm.put(i,products);
		 i++;
		  }
	  
	public void updateProduct(int pId,int pPrice) {
		Product p=hm.get(pId);
		p.setpPrice(pPrice);
		
	}
	public void deleteProduct(int pId) {
		hm.remove(pId);
	}
	public void displayAllProudct() {
		for(Integer keys:hm.keySet()) {
			System.out.println(keys);
		}
	}
	public int retrieveProductPrice(int pId){
		Product p=hm.get(pId);
		return p.getpId();
	}
}