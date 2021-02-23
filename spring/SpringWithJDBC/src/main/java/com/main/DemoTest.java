package com.main;

 

import java.util.List;

 

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 

import com.bean.Employee;
import com.service.EmployeeService;

 

public class DemoTest {

 

    public static void main(String[] args) {
    
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        EmployeeService es = (EmployeeService)ac.getBean("employeeService");
//        List<Employee> list=es.getEmployee();
//        list.forEach(e->System.out.println(e));
        
        //Insert employee
//        Employee e = new Employee();
//        e.setId(4);
//        e.setName("john");
//        e.setSalary(50000);
//        if(es.insertEmployee(e)) {
//            System.out.println("Inserted");
//        }else {
//            System.out.println("not inserted");
//        }
//        
        
        
        //Delete employee
        
//        if(es.deleteEmployee(1)) {
//            System.out.println("Deleted");
//        }else {
//            System.out.println("not deleted");
//        }
        
        //Update employee
        if(es.updateEmployee(4,5000)) {
        System.out.println("Updated");
    }else {
        System.out.println("not updated");
    }
//        
        
        
    }

 

}