package main;
import service.ProductService;
import bean.Product;
import java.util.Scanner;

import service.ProductService;
import java.util.*;
public class ProductOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner obj=new Scanner(System.in);
	      //Map<Integer,Product> hm=new HashMap<Integer,Product>();
	      //ProductService =new ProductService();
		 
	      
			do {
				 System.out.println("Choose Operation you want to perform");
			      System.out.println("1.Add Product");
			      System.out.println("2.Update Product");
			      System.out.println("3.Delete Product");
			      System.out.println("4.Display All Product");
			      System.out.println("5: Product-Name-Asc");
			      System.out.println("6:Product-Name-Desc");
			      System.out.println("7:Price-Low ");
			      System.out.println("8:Price-High");
			      System.out.println("9.Exit application");
				     int ch=obj.nextInt();
				switch(ch){
				case 1:ProductService ps1 = new ProductService();
					   Product p=new Product();
				       ps1.addProduct(p);
				      break;
				case 2:ProductService ps2 = new ProductService();
				       ps2.updateProduct();
					  break;
				case 3:ProductService ps3 = new ProductService();
				       ps3.deleteProduct();
					  break;
				case 4:ProductService ps4 = new ProductService();
				       ps4.getAllProduct().stream().forEach(p1->System.out.println(p1));
					  break;
				case 5:ProductService ps5 = new ProductService();
				      ps5.productNameAss().stream().map(pro->pro.getpName()).sorted().forEach(name->System.out.println(name));
					  break;
				case 6:ProductService ps6 = new ProductService();
				      ps6.productNameDes().stream().map(pro->pro.getpName()).sorted().forEach(name->System.out.println(name));
					  break;
				case 7:ProductService ps7 = new ProductService();
			          ps7.productPriceAss().stream().map(pro->pro.getpPrice()).sorted().forEach(price->System.out.println(price));
					  break;
				case 8:ProductService ps8 = new ProductService();
		               ps8.productPriceDes().stream().map(pro->pro.getpPrice()).sorted().forEach(price->System.out.println(price));
					  break;
				case 9:System.exit(0);
				default:System.out.println("Invalid choice");
				}
	         }while(true);
	}
}