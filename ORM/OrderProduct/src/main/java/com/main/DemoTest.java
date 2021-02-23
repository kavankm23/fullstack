package com.main;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import com.bean.POrder;
import com.dao.POrderDao;

public class DemoTest {
	public static void main(String[] args) {
	
		int choice;
		
		POrderDao od=new POrderDao();
		POrder po = new POrder();
		
		do {
			System.out.println("Select the Choice");
			System.out.println("\n 1. Insert \n 2. Display \n 3. Update \n 4. Delete \n 5. Retrieve ");
			Scanner sc=new Scanner(System.in);
			choice=sc.nextInt();
			int oid,qty;
			float price;
			String pname,status;

			switch(choice)
			{
				case 1:
						System.out.println("Please Enter Your Product Order Id ");
						oid = sc.nextInt();
						po.setOid(oid);
						
						System.out.println("Please Enter Your Product Order Name ");
						pname = sc.next();
						po.setPname(pname);
						
						System.out.println("Please Enter Your Product Order Quantity ");
						qty = sc.nextInt();
						po.setQty(qty);
						
						System.out.println("Please Enter Your Product Order Price ");
						price = sc.nextFloat();
						po.setPrice(price);
						
						System.out.println("Please Enter Your Product Ordered Date ");
						LocalDate date = LocalDate.now();
						po.setOdate(date);
						
						System.out.println("Please Enter Your Product Order Status ");
						status = sc.next();
						po.setStatus(status);
						
						od.storePOrder(po);
						break;
        
				case 2:
						List<POrder> listOfProduct = od.getAllPOrders();
						System.out.println("Number of Product Orders are:"+listOfProduct.size());
						for(POrder pp:listOfProduct)
						{
							System.out.println(pp);
						}
						break;
			
				case 3:
						System.out.println("Enter Your Order Id to Update the Price ");
						oid = sc.nextInt();
						po.setOid(oid);
						
						price = sc.nextFloat();
						po.setPrice(price);
						od.updatePOrder(po);
						break;
			
				case 4:
						System.out.println("Enter Your Product Order Id to Delete ");
						oid=sc.nextInt();
						od.deletePOrder(oid);
						break;
						
				case 5:
						List<POrder> listOfOrderProduct	= od.getAllProductOrderByPrice(45000);
						System.out.println("Number of Ordered Products are "+listOfOrderProduct.size());
						for(POrder pp:listOfOrderProduct) {
							System.out.println(pp);
						}
			}
		}while(choice<5);
	}
}
