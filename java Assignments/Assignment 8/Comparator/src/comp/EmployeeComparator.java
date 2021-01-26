package comp;

import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;
import bean.Employee;
import bean.SortId;
import bean.SortName;
import bean.SortSalary;

class EmployeeComparator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int choice,n;
		int id;
		String name;
		int salary;
		
		System.out.println("Enter the Number of Employees ");
		n=sc.nextInt();
		
		ArrayList<Employee>e=new ArrayList<Employee>();
		
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter the Id of Employee "+i);
			id=sc.nextInt();
			System.out.println("Enter the Name of the Employee "+i);
			sc.nextLine();
			name=sc.nextLine();
			
			System.out.println("Enter the Salary of the Employees "+i);
			salary=sc.nextInt();
			e.add(new Employee(id,name,salary));
		}
		
			System.out.println("Enter your Choice:");
			System.out.println("1. Sort By Id");
			System.out.println("2. Sort By Name");
			System.out.println("3. Sort By Salary");
			choice=sc.nextInt();
			
			switch (choice)
			{  
				case 1:
						Collections.sort(e, new SortId());
				 
						System.out.println("\nSorted By Id");
						for(int i=0; i<e.size(); i++)
							System.out.println(e.get(i));
						break;
						
				case 2:
						Collections.sort(e, new SortName());
				 
						System.out.println("\nSorted By Name");
						for(int i=0; i<e.size(); i++)
							System.out.println(e.get(i));
						break;
						
				case 3:
						Collections.sort(e, new SortSalary());
				 
						System.out.println("\nSorted By Salary");
						for(int i=0; i<e.size(); i++)
							System.out.println(e.get(i));
						break;
						
				default:
						System.out.println("Invalid  Option. Plz Select The Correct Option");
						break;
			}
		}
}