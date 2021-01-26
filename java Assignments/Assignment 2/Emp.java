// ASSIGNMENT 2

import java.util.*;
class Emp{
	  public static void main(String args[]){

      int n;
      Scanner obj=new Scanner (System.in);

      System.out.println("Enter the Number of Employees = ");
      n=obj.nextInt();
	  
	  int id[]=new int[n];
	  float salary[]=new float[n];
      	  String name[]=new String[n];
 	  String desg[]=new String[n];
 	  System.out.println("\n");

      System.out.println("Enter Employee Details");
	  for(int i=0;i<n;i++)
	  {
	    System.out.println("Id = ");
	    id[i]=obj.nextInt();
	    System.out.println("Enter Name = ");
	    name[i]=obj.next();
	    System.out.println("Enter Designation = ");
	    desg[i]=obj.next();
	    System.out.println("Enter Salary = ");
	    salary[i]=obj.nextFloat();
	    System.out.println("\n");
	  }

	  System.out.println("Employee Details are : \n");
  	  for(int i = 0; i <n; i++) 
 	  {
     	    System.out.println("Id = " +id[i]);
	    System.out.println("Name = " +name[i]);
	    System.out.println("Designation = " +desg[i]);

	    if(desg[i].equals("Manager"))
	    {
		System.out.println("Employee Salary = " +(salary[i]+(0.15*salary[i])+(0.10*salary[i])+(0.07*salary[i])-(0.05*salary[i])));
		System.out.println("\n");
	    }

	    else if(desg[i].equals("Developer")){
	    	System.out.println("Employee Salary = " +(salary[i]+(0.10*salary[i])+(0.10*salary[i])+(0.07*salary[i])-(0.05*salary[i])));
	    	System.out.println("\n");
	    }

	    else{
		System.out.println("Employee Salary = " +(salary[i]+(0.05*salary[i])+(0.10*salary[i])+(0.07*salary[i])-(0.05*salary[i])));
		System.out.println("\n");
	    }
	    
      }
   }
}