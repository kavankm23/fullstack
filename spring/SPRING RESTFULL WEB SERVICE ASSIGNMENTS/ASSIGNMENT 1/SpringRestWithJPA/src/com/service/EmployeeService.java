package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.Employee;
import com.dao.EmployeeDao;

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeDao ed;
	
	public String storeEmployeeService(Employee emp) {
		if(ed.storeEmployee(emp)>0) {
			return "Record Stored Successfully";
		} else {
			return "Didn't Store";
		}
	}
	
	public List<Employee> getEmployeeInfo() {
		return ed.getEmployeeDetails();
	}
	
	public String deleteEmployeeInfo(int id) {
		int res = ed.deleteEmployeeInfo(id);
		if(res > 0) {
			return "Record Deleted SuccessFully";
		} else {
			return "Record Didn't Deleted";
		}
	}
	
	public String updateEmployeeInfo(int id , double price) {
		int res1 = ed.updateEmployeeInfo(id, price);
        if(res1 > 0) {
            return "Record updated successfully";
        }else {
            return "Record Not Updated";
        }
	}
}
