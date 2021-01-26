// ASSIGNMENT 3

import java.util.*;

class EmployeeDetails
{
	int n;
	int id[];
	String name[];
	double salary[];
	String desg[];

	EmployeeDetails(int size){
		this.n = size;
		id = new int[size];
		name = new String[size];
		salary = new double[size];
		desg = new String[size];
	}

	void read(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Employees Details \n");
		for(int i=0;i<n;i++){
			System.out.println("Enter Employee "+(i+1)+" record \n");

			System.out.println("Enter Id of Employee");
			id[i] = sc.nextInt();

			System.out.println("Enter Name of Employee ");
			name[i] = sc.next();	

			System.out.println("Enter Salary of Employee");
			salary[i] = sc.nextDouble();

			System.out.println("Enter Designation of Employee ");
			desg[i] = sc.next();
			System.out.println("\n");
		}
	}

	void calSalary(){
		double bonus,pf,hra,da;

		for(int i=0;i<n;i++){
			if(desg[i].equals("Manager")){
				bonus = salary[i]*15/100;
			}else if(desg[i].equals("Developer")){
				bonus = salary[i]*10/100;
			}else{
				bonus = salary[i]*5/100;
			}

			hra = salary[i]*10/100;
			da = salary[i]*7/100;
			pf = salary[i]*5/100;
			salary[i] = salary[i]+hra+da+bonus-pf;	
		}

	}

	void display(){
		for(int i=0;i<n;i++){
			System.out.println("Employee "+(i+1)+" Record \n");
			System.out.println("Employee Id = "+id[i]);
			System.out.println("Employee Name = "+name[i]);
			System.out.println("Employee Salary = "+salary[i]);
			System.out.println("Employee Designation = "+desg[i]);
			System.out.println("\n");
		}
	}

}


class Employee{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number of Employee Records You Want to Store");
		int size = sc.nextInt();

		EmployeeDetails emp = new EmployeeDetails(size);
		emp.read();
		emp.calSalary();
		emp.display();
	}
}