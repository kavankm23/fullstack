package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.bean.Employee;
import com.service.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService es;
	
	@RequestMapping(value="getEmpInfo",method = RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getEmpInfo() {
		System.out.println(es.getEmployeeInfo().size());
		return es.getEmployeeInfo();
	}
	
	
	@RequestMapping(value="storeEmpInfo", method = RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public String storeEmpInfo(@RequestBody Employee emp) {
		Employee emp1 = new Employee();
		emp1.setId(emp.getId());
		emp1.setName(emp.getName());
		emp1.setSalary(emp.getSalary());
		String res = es.storeEmployeeService(emp1);
		System.out.println(res);
		return res;
	}
	
	@RequestMapping(value="deleteEmpInfo/{empId}", method = RequestMethod.DELETE, produces = MediaType.TEXT_PLAIN_VALUE)
	public String deleteEmpInfo(@PathVariable("empId") int id) {
		String res = es.deleteEmployeeInfo(id);
		System.out.println(res);
		return res; 
	} 
	
	@RequestMapping(value="updateEmpInfo", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.TEXT_PLAIN_VALUE)
	public String updateEmpInfo(@RequestBody Employee emp) {
		String res = es.updateEmployeeInfo(5, 2000.00);
		System.out.println(res);
		return res; 
	}
}
