// ASSIGNMENT 4

import java.util.Scanner;

class Employee{
	int id;
	String name;
	double salary;

	 Scanner sc = new Scanner(System.in);
	 Address addr = new Address();
	
	void read() {
		System.out.println("Enter the Id of Employee");
		id=sc.nextInt();
		System.out.println("Enter the Name of Employee");
		name=sc.next();
		System.out.println("Enter the Salary of Employee");
		salary=sc.nextDouble();
	}

	void calsalary() {
		double hra,da,pf;

	     hra = salary*10/100;
	     da = salary*7/100;
	     pf = salary*5/100;

	     salary = salary+hra+da-pf;
	}

	void display() {
		System.out.println("\n");
		System.out.println("Employee Id is = "+id);
		System.out.println("Employee Name is = "+name);
		System.out.println("Employee Salary is = "+salary);
	
	}
}

class Manager extends Employee{
	int nmgr;

	void readmgr() {
		System.out.println("Enter Number of Managers");
		nmgr=sc.nextInt();
		addr.readaddr();
	}

	void dismgr() {
		System.out.println("Number of Managers are = "+nmgr);
		addr.displayaddr();
	}
}

class Programmer extends Employee{
	String project;

	void readprog() {
		System.out.println("Enter the Project Name");
		project = sc.next();
		addr.readaddr();
	}

	void disprog() {
		System.out.println("The project Name is "+project);
		addr.displayaddr();
	}
}

class Address{

	String city,state;
	int pincode;
	Scanner obj=new Scanner(System.in);

	void readaddr() {
		System.out.println("Enter the name of the City. They are Currently Working");
		city=obj.next();
		System.out.println("Enter the state of the City");
		state=obj.next();
		System.out.println("Enter the pincode of the City");
		pincode=obj.nextInt();
		System.out.println("\n");
	}
	
	void displayaddr() {
		System.out.println("Name of City. They are Currently working = "+city);
		System.out.println("State of the City is = "+state);
		System.out.println("Pincode of City is = "+pincode);
		System.out.println("\n");
	}
}


public class EmployeeDetail {
	public static void main(String[] args) {

	  System.out.println("Manager details  ");
      Manager mgr=new Manager();
      mgr.read();
      mgr.readmgr();
     
      
      System.out.println("\n");

      System.out.println("Programmer details ");
      Programmer prog=new Programmer();
      prog.read();
      prog.readprog();

      mgr.calsalary();
      prog.calsalary();
      mgr.display();
      mgr.dismgr();
      prog.display();
      prog.disprog();
	}
} 