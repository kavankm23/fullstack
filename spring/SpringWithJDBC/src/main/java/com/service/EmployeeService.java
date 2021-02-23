package com.service;

 

import java.util.List;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import com.bean.*;
import com.dao.EmployeeDao;

 

@Service
public class EmployeeService {
    @Autowired
    EmployeeDao ed;
    public List<Employee> getEmployee(){
        return ed.getEmployee();
        
    }
    public boolean insertEmployee(Employee emp) {
        if(ed.insertEmployee(emp) > 0) {
            return true;
        }else {
            return false;
        }
        
    }
    public boolean deleteEmployee(int id) {
        if(ed.deleteEmployee(id) > 0) {
            return true;
        }else {
            return false;
        }
        
    }
    public boolean updateEmployee(int id ,float salary) {
        if(ed.updateEmployee(id,salary) > 0) {
            return true;
        }else {
            return false;
        }
    }
}