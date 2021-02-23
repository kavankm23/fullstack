package com.dao;

import com.bean.Employee;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	
	@Autowired
	DataSource ds;		//Before spring framework using JNDI look up we search database details from application server
	public List<Employee> getAllEmployee() {
		List<Employee> listOfEmp = new ArrayList<Employee>();
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from emp");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Employee emp = new Employee();
				emp.setId(rs.getInt(1));
				emp.setName(rs.getString(2));
				emp.setSalary(rs.getFloat(3));
				listOfEmp.add(emp);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
		return listOfEmp;
	}
	
	public int storeEmployee(Employee emp) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into emp values(?,?,?)");
			pstmt.setInt(1, emp.getId());
			pstmt.setString(2, emp.getName());
			pstmt.setFloat(3, emp.getSalary());
			return pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		return 0;
	}
	

	public int deleteEmployee(int empId) {
		try {
			Connection con = ds.getConnection();
			PreparedStatement pstmt = con.prepareStatement("delete from emp where id = ?");
			pstmt.setInt(1, empId);
			return pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
			return 2;
		}
	}
	
	public int updateEmployee(int i, double salary) {
        try {
        	Connection con = ds.getConnection();
            PreparedStatement pstmt = con.prepareStatement("update emp set salary=salary+? where id =?");
            pstmt.setDouble(1, salary);
            pstmt.setInt(2, i);
            return pstmt.executeUpdate();
        } catch(Exception e1) {
            e1.printStackTrace();
            return 0;
        }
    }
}
