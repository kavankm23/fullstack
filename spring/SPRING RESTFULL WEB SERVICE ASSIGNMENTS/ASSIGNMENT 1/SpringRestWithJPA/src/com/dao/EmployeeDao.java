package com.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Employee;

@Repository
public class EmployeeDao {
	
	@Autowired
	EntityManagerFactory emf;
	
	public int storeEmployee(Employee emp) {
		
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		tran.begin();
			manager.persist(emp);
		tran.commit();
		
		Employee e = manager.find(Employee.class, emp.getId());
		if(e!=null) {
			return 1;
		}else {
			return 0;
		}
	}
	
	public List<Employee> getEmployeeDetails() {
		EntityManager manager = emf.createEntityManager();
		Query qry = manager.createQuery("select e from Employee e");
		List<Employee> listOfEmp = qry.getResultList();
		return listOfEmp;
	
	}

	public int deleteEmployeeInfo(int id) {
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		
		Employee e	= manager.find(Employee.class, id);			// primary key	if record is available automatically convert record to object 
		if(e==null) {															// select * from product where pid =1
			System.out.println("Employee Is Not Present");
		}else {
			tran.begin();
						manager.remove(e);						// delete from product where pid = 1;
			tran.commit();
			System.out.println("Employee Record Deleted Successfully");
		}
		return id;
	}

	public int updateEmployeeInfo(int id, double salary) {
		
		EntityManager manager = emf.createEntityManager();
		EntityTransaction tran = manager.getTransaction();
		
		Employee emp = manager.find(Employee.class, id);			// primary key
		if(emp==null) {
			System.out.println("Employee is not present");
		}else {
			tran.begin();
						emp.setSalary(emp.getSalary()+2000);
						manager.merge(emp);									//update price using pid column 
			tran.commit();
			System.out.println("Employee Record updated successfully");
		}
		return id;
	}
}
