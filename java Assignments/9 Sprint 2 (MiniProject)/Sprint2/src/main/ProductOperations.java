package main;
import bean.Product;
import service.ProductService;
import java.io.*;
import java.util.*;
public class ProductOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
      Scanner obj=new Scanner(System.in);
      //Map<Integer,Product> hm=new HashMap<Integer,Product>();
      
      
      ProductService ps=new ProductService();
      
      public void storeobjects(Product p){
    	  OutputStream ops=null;
    	  ObjectOutputStream oos=null;
    	  try {
    		  ops=new FileOutputStream("productObject.txt");
    		  oos=new ObjectOutputStream(ops);
    		  oos.writeObject(p);
    		  oos.flush();
    		  
    	  }catch(FileNotFoundException e) {
    		  e.printStackTrace();
    	  }catch(IOException e) {
    		  e.printStackTrace();
    	  }finally {
    		  try {
    			  if(oos!=null)oos.close();
    		  }catch(Exception e) {
    			  
    		  }
    	  }
    	  
      }
	 
      
      public void displayObjects(){
    	  InputStream ips=null;
    	  ObjectInputStream iis=null;
    	  try {
    		  ips=new FileInputStream("productObject.txt");
    		  iis=new ObjectInputStream(ips);
    		 Product p1=(Product)iis.readObject();
    		  System.out.println(p1);
    		  
    	  }catch(FileNotFoundException e) {
    		  e.printStackTrace();
    	  }catch(IOException e) {
    		  e.printStackTrace();
    	  }finally {
    		  try {
    			  if(iis!=null)iis.close();
    		  }catch(Exception e) {
    			  
    		  }
    	  }
    	  
      }
      
		do {
			 System.out.println("Choose Operation you want to perform");
		      System.out.println("1.Add Product");
		      System.out.println("2.Update Product");
		      System.out.println("3.Delete Product");
		      System.out.println("4.Display All Product");
		      System.out.println("5.Display price using Product Id");
		      System.out.println("6.Display Objects");
		      System.out.println("7.Exit System");
			     int ch=obj.nextInt();
			switch(ch) {
			case 1:System.out.println("Enter number of Product Details u want to store");
			       int n=obj.nextInt();
			       System.out.println("Enter pId,pName,pPrice");
			       
			      // Product products=new Product[n];
			            for(int i=0;i<n;i++) {
						  int pId=obj.nextInt();
						  String pName=obj.next();
						  int pPrice=obj.nextInt();
						  ProductOperations po=new ProductOperations();
						  Product products=new Product(pId,pName,pPrice);
						  po.storeObjects(products);
			              ps.addProduct(products);
			              System.out.println("product is added");
			            }
			      break;
			case 2:System.out.println("enter pId and price u want to update");
			      int pId=obj.nextInt();
			      int pPrice=obj.nextInt();
			      ps. updateProduct(pId,pPrice);
				  System.out.println("Prices is update");
				break ;
			case 3:System.out.println("Enter pId to delete Product");
			      int pId1=obj.nextInt();
			      ps.deleteProduct(pId1);
			      System.out.println("Element get deleted");
				break;
			case 4:System.out.println("your All Products Are");
			      ps.displayAllProudct();
				break;
			case 5:System.out.println("Enter pId whose pPrice u want to display");
			       int pId2=obj.nextInt();
			      int price=ps.retrieveProductPrice(pId2);
			      System.out.println("Price of the product is"+price);
				break;
			case 6:	 ProductOperations po=new ProductOperations();
			        po.displayObjects();
			case 7:System.exit(0);
				break;
			default:
				System.out.println("Invalid Choice");
		    }
		}while(true);
	}		
}
