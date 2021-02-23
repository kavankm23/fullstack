package com.dao;

 

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

 

import com.bean.*;
import javax.sql.DataSource;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

 

@Repository
public class EmployeeDao {
    @Autowired
    DataSource ds;
    Connection con;
    List<Employee> listOfEmployee = new ArrayList<>();
    public List<Employee> getEmployee(){
        
        try {
            con = ds.getConnection();
            PreparedStatement pstmt = con.prepareStatement("select * from employee");
            ResultSet rs = pstmt.executeQuery();
            
            while(rs.next()) {
                Employee emp = new Employee();
                emp.setId(rs.getInt(1));
                emp.setName(rs.getString(2));
                emp.setSalary(rs.getFloat(3));
                listOfEmployee.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listOfEmployee;

 

    }
    public int insertEmployee(Employee emp) {
        try {
            con = ds.getConnection();
            PreparedStatement pstmt = con.prepareStatement("insert into employee value(?,?,?)");
            pstmt.setInt(1, emp.getId());
            pstmt.setString(2, emp.getName());
            pstmt.setFloat(3, emp.getSalary());
            return pstmt.executeUpdate();
        } catch(Exception e1) {
           
            return 0;
        }
        
    }
    public int deleteEmployee(int id) {
        try {
            con = ds.getConnection();
            PreparedStatement pstmt = con.prepareStatement("delete from employee where id =?");
            pstmt.setInt(1, id);
            return pstmt.executeUpdate();
        } catch(Exception e1) {
           
            return 0;
        }
    }
    public int updateEmployee(int id, float salary) {
        try {
            con = ds.getConnection();
            PreparedStatement pstmt = con.prepareStatement("update employee set salary=salary+? where id =?");
            pstmt.setFloat(1, salary);
            pstmt.setInt(2, id);
            return pstmt.executeUpdate();
        } catch(Exception e1) {
            
            return 0;
        }
    }

 

}