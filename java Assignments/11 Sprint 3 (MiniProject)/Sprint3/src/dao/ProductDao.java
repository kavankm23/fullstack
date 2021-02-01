package dao;
import bean.Product;
import java.sql.*;
import java.time.LocalDate;
import java.util.*;
import java.text.*;
//import java.util.Date;

public class ProductDao {
    Scanner obj=new Scanner(System.in); 
	public void addProduct(Product p) {
	    try {
	    	Class.forName("com.mysql.cj.jdbc.Driver");
	    	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","9964013930");
	    	System.out.println("Connected Successfully");
	    	PreparedStatement ps= con.prepareStatement("insert into product values(?,?,?)");
	    	System.out.println("Enter Product Id");
	    	int pId=obj.nextInt();
	    	p.setpId(pId);
	    	System.out.println("Enter Product Name");
	    	String pName=obj.next();
	    	p.setpName(pName);
	    	System.out.println("Enter Product Price");
	    	float pPrice=obj.nextFloat();
	    	p.setpPrice(pPrice);
	    	
	    	
	    	 System.out.println("Enter Product Purchase Date");
	    	 String datePurchase=obj.next();
	    	 SimpleDateFormat sdf= new SimpleDateFormat("dd-mm-yyyy");
	    	 java.util.Date datepurchase=sdf.parse(datePurchase);
	    	 p.setDatepurchase(datepurchase);
	         long ms=p.getDatepurchase().getTime();
	    	 java.sql.Date aqd=new java.sql.Date(ms);
	    	 
	    	ps.setInt(1,p.getpId());
	    	ps.setString(2,p.getpName());
	    	ps.setFloat(3,p.getpPrice());
	    	ps.setDate(4,aqd);
	    	
	    	int res=ps.executeUpdate();
	    	if(res==0) {
	    		System.out.println("There is no record to insert");
	    	}
	    	else {
	    		System.out.println("Record Inserted");
	    	}
	    	
	    }catch(Exception e) {
	    	
	    }
	}
	
	public void updateProduct() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully...");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","9964013930");
			System.out.println("Connected Successfully");
			PreparedStatement stm= con.prepareStatement("update product set pPrice= ? where pId=?");
			System.out.println("Enter pId whoes price u want to update");
			int pId=obj.nextInt();
			System.out.println("Enter the price u want to update");
			float pPrice=obj.nextFloat();
			stm.setInt(1,pId);
			stm.setFloat(2, pPrice);
			stm.executeUpdate();
			System.out.println("record get Updated");
		}catch(Exception e) {
			
		}
	}
	
	public void deleteProduct() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully...");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","9964013930");
			System.out.println("Connected Successfully");
			PreparedStatement stm= con.prepareStatement("delete from product where pId=?");
			System.out.println("Enter pId whoes details u want to delete");
			int pId=obj.nextInt();
			stm.setInt(1,pId);
			stm.executeUpdate();
			System.out.println("record get deleted");
			}catch(Exception e) {
			
		}
	}
	public List<Product> getAllProduct() {
		List<Product> listOfProduct = new ArrayList<>();
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded Successfully...");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "9964013930");
			System.out.println("Connected Successfully");
			PreparedStatement pstmt = con.prepareStatement("select * from product");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Product p = new Product();
				p.setpId(rs.getInt(1));
				p.setpName(rs.getString(2));
				p.setpPrice(rs.getFloat(3));
				//p.setStoreDate(rs.getDate(4));	We have to convert SQL Date format to Java7/Java8 Date format.
				p.setDatepurchase(rs.getDate(4));     // converting SQL date to LocalDate format. 
				listOfProduct.add(p);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listOfProduct;
	}
	 public List<Product> productNameAss(){
		 List<Product> listOfProduct = new ArrayList<>();
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 System.out.println("Driver Loaded Successfully...");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "9964013930");
				System.out.println("Connected Successfully");
				PreparedStatement pstmt = con.prepareStatement("select * from product");
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					Product p = new Product();
					p.setpId(rs.getInt(1));
					p.setpName(rs.getString(2));
					p.setpPrice(rs.getFloat(3));
					//p.setStoreDate(rs.getDate(4));	We have to convert SQL Date format to Java7/Java8 Date format.
					p.setDatepurchase(rs.getDate(4));     // converting SQL date to LocalDate format. 
					listOfProduct.add(p);
				}
		 }catch(Exception e) {
			 
		 }
		 return listOfProduct;
	 }
	 public List<Product> productNameDes(){
		 List<Product> listOfProduct = new ArrayList<>();
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 System.out.println("Driver Loaded Successfully...");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "9964013930");
				System.out.println("Connected Successfully");
				PreparedStatement pstmt = con.prepareStatement("select * from product");
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					Product p = new Product();
					p.setpId(rs.getInt(1));
					p.setpName(rs.getString(2));
					p.setpPrice(rs.getFloat(3));
					//p.setStoreDate(rs.getDate(4));	We have to convert SQL Date format to Java7/Java8 Date format.
					p.setDatepurchase(rs.getDate(4));     // converting SQL date to LocalDate format. 
					listOfProduct.add(p);
				}
		 }catch(Exception e) {
			 
		 }
		 return listOfProduct;
	 }
	 public List<Product> productPriceAss(){
		 List<Product> listOfProduct = new ArrayList<>();
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 System.out.println("Driver Loaded Successfully...");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "9964013930");
				System.out.println("Connected Successfully");
				PreparedStatement pstmt = con.prepareStatement("select * from product");
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					Product p = new Product();
					p.setpId(rs.getInt(1));
					p.setpName(rs.getString(2));
					p.setpPrice(rs.getFloat(3));
					//p.setStoreDate(rs.getDate(4));	We have to convert SQL Date format to Java7/Java8 Date format.
					p.setDatepurchase(rs.getDate(4));     // converting SQL date to LocalDate format. 
					listOfProduct.add(p);
				}
		 }catch(Exception e) {
			 
		 }
		 return listOfProduct;
	 }
	 public List<Product> productPriceDes(){
		 List<Product> listOfProduct = new ArrayList<>();
		 try {
			 Class.forName("com.mysql.cj.jdbc.Driver");
			 System.out.println("Driver Loaded Successfully...");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "9964013930");
				System.out.println("Connected Successfully");
				
				PreparedStatement pstmt = con.prepareStatement("select * from product");
				ResultSet rs = pstmt.executeQuery();
				while(rs.next()) {
					Product p = new Product();
					p.setpId(rs.getInt(1));
					p.setpName(rs.getString(2));
					p.setpPrice(rs.getFloat(3));
					//p.setStoreDate(rs.getDate(4));	We have to convert SQL Date format to Java7/Java8 Date format.
					p.setDatepurchase(rs.getDate(4));     // converting SQL date to LocalDate format. 
					listOfProduct.add(p);
				}
		 }catch(Exception e) {
			 
		 }
		 return listOfProduct;
	 }
}