package model.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.User;
import model.connection.ConnectionFactory;

public class UserDAO {
	public List<User> index(){
		List<User> users = new ArrayList<>();
		
		try {
			Connection connection = ConnectionFactory.getConnection();
			
			String sql = "SELECT id, name, phone, cpf, gender, created_at FROM users";
			
			PreparedStatement conn = connection.prepareStatement(sql);
			
			ResultSet resultSet = conn.executeQuery();
			
			while(resultSet.next()) {
				User user = new User(resultSet.getInt(1), 
												resultSet.getString(2),
												resultSet.getString(3), 
												resultSet.getString(4), 
												resultSet.getString(5),
												resultSet.getString(6));
				users.add(user);
			}
		} catch (Exception e) {
			System.out.println("Ops: " + e.getMessage());
		}
		
		return users;
	}
	
	public void store(User user) {
		try {
			Connection connection = ConnectionFactory.getConnection();
			
			String sql = "INSERT INTO users(name, phone, cpf, gender, created_at) VALUES(?, ?, ?, ?, ?)";
			 
			 PreparedStatement conn = connection.prepareStatement(sql);
			 
			 conn.setString(1, user.getName());	
			 conn.setString(2, user.getPhone());
			 conn.setString(3, user.getCpf());
			 conn.setString(4, user.getGender());
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
	
	public void update(User user) {
		try {
			Connection conexao = ConnectionFactory.getConnection();
			
			String sql = "UPDATE users SET name = ?, phone = ?, cpf = ?, gender = ? WHERE id = ?";
			
			PreparedStatement conn = conexao.prepareStatement(sql);
			
			conn.setString(1, user.getName());	
			conn.setString(2, user.getPhone());
			conn.setString(3, user.getCpf());
			conn.setString(4, user.getGender());
			conn.setInt(4, user.getId());
			conn.execute();
			
			conn.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println("Ops: " + e.getMessage());
		}
	}
	
	public void destroy(User user) {
		try {
			Connection connection = ConnectionFactory.getConnection();
			
			String sql = "DELETE FROM users WHERE id = ?";
			
			PreparedStatement conn = connection.prepareStatement(sql);
			conn.setInt(1, user.getId());
			conn.execute();
			conn.close();
			
			connection.close();
		} catch (Exception e) {
			System.out.println("Ops: " + e.getMessage());
		}
	}
}
