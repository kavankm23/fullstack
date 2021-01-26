// Assignment 5
//Create Student class which contains sId,SName,Age,Marks[](PCMB) ,Grade(char)
import java.util.*;
class student
{
	int sId;
	String sName;
	int sAge;
	int sMarks[] = new int[4];
	String sGrade;

	void read()		
	{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Student ID = ");
			sId = sc.nextInt();
			System.out.println("Enter the Student Name = ");
			sName = sc.next();
			System.out.println("Enter the Student Age = ");
			sAge = sc.nextInt();
			System.out.println("Enter the Student Marks = ");
			for(int i=0;i<4;i++) {
					sMarks[i]=sc.nextInt();
			}
	}

	void calculateGrade()
	{
		int total=0;
		for(int i=0;i<4;i++)
		{
			total = total + sMarks[i];
		}
		float avg = total/4.0f;

		if(avg > 90.0f)
		{
			sGrade = "A+";
		} else if(avg > 80.0f && avg < 90.0f)
		{
			sGrade = "A";
		} else if(avg > 70.0f && avg < 80.0f)
		{
			sGrade = "B";
		} else if(avg > 55.0f && avg < 70.0f)
		{
			sGrade = "C";
		} else {
			sGrade = "D";
		}
	}
			
			
	void display()
	{
		System.out.println("Student Id is = " +sId);
		System.out.println("Student Name is = " +sName);
		System.out.println("Student Age is = " +sAge);
		System.out.println("Student Grade is = "+sGrade);
	}
		
}	


class StudentTest
{
	public static void main(String args[]){
		//Create Student array object 
		//How many student details do you want to store.
		int n=0;
      	Scanner obj=new Scanner (System.in);
      	System.out.println("Enter the value of n");
	  	n=obj.nextInt();

		student std[]=new student[n];

		for(int i=0;i<n;i++) {
			std[i]=new student();
			std[i].read();
		}

		for(int i=0;i<n;i++){
			std[i].calculateGrade();
		}

		for(int i=0;i<n;i++){
			std[i].display();
			System.out.println();
		}
	}
}

		

