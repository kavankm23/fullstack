package bean;
import java.util.Comparator;

public class Employee {
	
	 public Employee() {
			super();
			// TODO Auto-generated constructor stub
	}
	 private int id;
	 private String name;
	 private int salary;
	 
	 
	public Employee(int id, String name, int salary) {

		this.id= id;
		this.name = name;
		this.salary = salary;
		
	}
		
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public float getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}