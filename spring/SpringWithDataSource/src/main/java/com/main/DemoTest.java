package com.main;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Employee;
import com.dao.EmployeeDao;
import com.service.EmployeeService;

public class DemoTest {

	public static void main(String[] args) {
		
		
		
		int choice;
		
		do {
			System.out.println("Select the Choice");
			System.out.println("\n 1. Display \n 2. Insert \n 3. Delete \n 4. Update ");
			Scanner sc=new Scanner(System.in);
			ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
			
			EmployeeService es = (EmployeeService)ac.getBean("employeeService");
			choice=sc.nextInt();
			
			switch(choice)
			{
				case 1:
						//Display All Records
						es.getAllEmployee().forEach(emp->System.out.println(emp));
						break;
		
				case 2:
						//Insert
						Employee e = new Employee();
						e.setId(7);
						e.setName("Arun");
						e.setSalary(5000);
						EmployeeDao ed = (EmployeeDao)ac.getBean("employeeDao");
						int res = ed.storeEmployee(e);
						if(res>0) {
							System.out.println("Insert Success");
						}else {
							System.out.println("Not Inserted Success");
						}
						break;
					
				case 3:
						//Delete
						EmployeeDao ed1 = (EmployeeDao)ac.getBean("employeeDao");
						int res1 = ed1.deleteEmployee(7);
						if(res1>0) {
							System.out.println("Deleted Success");
						}else {
							System.out.println("Not Deleted");
						}
						break;
		
				case 4:
						//Update
						if(es.updateEmployee(3,1000)) {
							System.out.println("Update Success");
						}else {
							System.out.println("Update Not Success");
						}
						break;
			}
		}while(choice<5);
	}

}
