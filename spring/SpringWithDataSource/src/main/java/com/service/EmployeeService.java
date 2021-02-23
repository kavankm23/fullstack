package com.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;
	
	public List<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee().stream().filter(emp->emp.getSalary()>13000).collect(Collectors.toList());
	}

	
	public String storeEmployee(Employee emp) {
		if(emp.getSalary()>10000) {
				if(employeeDao.storeEmployee(emp)>0) {
					return "Record stored successfully";
				}else {
					return "Record didn't store";
				}
		}else {
			return "Salary must > 10000";
		}
	}
	
	public String deleteEmployee(int empId) {
			int res = employeeDao.deleteEmployee(empId);
				if(res==1) {
					return "Record deleted successfully";
				}else if(res==2) {
					return "Exception generated";
				}else {
					return "Record didn't find";
				}
			} 
	
	public boolean updateEmployee(int i , double salary) {
        if(employeeDao.updateEmployee(i,salary) > 0) {
            return true;
        }else {
            return false;
        }
	}
}
