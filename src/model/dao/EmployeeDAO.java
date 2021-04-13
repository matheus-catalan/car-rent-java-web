package model.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Employee;
import model.connection.ConnectionFactory;

public class EmployeeDAO {
	public List<Employee> index(){
		List<Employee> employees = new ArrayList<>();
		
		try {
			Connection connection = ConnectionFactory.getConnection();
			
			String sql = "SELECT id, name, phone, cpf, gender, created_at FROM employees";
			
			PreparedStatement conn = connection.prepareStatement(sql);
			
			ResultSet resultSet = conn.executeQuery();
			
			while(resultSet.next()) {
				Employee employee = new Employee(resultSet.getInt(1), 
												resultSet.getString(2),
												resultSet.getString(3), 
												resultSet.getString(4), 
												resultSet.getString(5),
												resultSet.getString(5));
				employees.add(employee);
			}
		} catch (Exception e) {
			System.out.println("Ops: " + e.getMessage());
		}
		
		return employees;
	}
	
	public void store(Employee employee) {
		try {
			Connection connection = ConnectionFactory.getConnection();
			
			String sql = "INSERT INTO employees(name, phone, cpf, gender, created_at) VALUES(?, ?, ?, ?, ?)";
			 
			 PreparedStatement conn = connection.prepareStatement(sql);
			 
			 conn.setString(1, employee.getName());	
			 conn.setString(2, employee.getPhone());
			 conn.setString(3, employee.getCpf());
			 conn.setString(4, employee.getGender());
	         java.util.Date utilDate = new java.util.Date();
	         java.sql.Timestamp date = new java.sql.Timestamp(utilDate.getTime());
			 conn.setTimestamp(5, date);
			 
			 
			 conn.execute();
			 conn.close();
			 connection.close();
		} catch (Exception e) {
			System.out.println("Ops: " + e.getMessage());
		}
	}
	
	public void update(Employee employee) {
		try {
			Connection conexao = ConnectionFactory.getConnection();
			
			String sql = "UPDATE employees SET name = ?, phone = ?, cpf = ?, gender = ? WHERE id = ?";
			
			PreparedStatement conn = conexao.prepareStatement(sql);
			
			conn.setString(1, employee.getName());	
			conn.setString(2, employee.getPhone());
			conn.setString(3, employee.getCpf());
			conn.setString(4, employee.getGender());
			conn.setInt(4, employee.getId());
			conn.execute();
			
			conn.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println("Ops: " + e.getMessage());
		}
	}
	
	public void destroy(Employee employee) {
		try {
			Connection connection = ConnectionFactory.getConnection();
			
			String sql = "DELETE FROM employees WHERE id = ?";
			
			PreparedStatement conn = connection.prepareStatement(sql);
			conn.setInt(1, employee.getId());
			conn.execute();
			conn.close();
			
			connection.close();
		} catch (Exception e) {
			System.out.println("Ops: " + e.getMessage());
		}
	}
}
