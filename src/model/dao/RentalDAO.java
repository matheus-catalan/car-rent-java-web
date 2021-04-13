package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Rental;
import model.connection.ConnectionFactory;

public class RentalDAO {
	public List<Rental> index(){
		List<Rental> rentals = new ArrayList<>();
		
		try {
			Connection connection = ConnectionFactory.getConnection();
			
			String sql = "SELECT id, user_id, employee_id, vehicle_id, date_withdrawa, date_delivered FROM rent;";
			
			PreparedStatement conn = connection.prepareStatement(sql);
			
			ResultSet resultSet = conn.executeQuery();
			
			while(resultSet.next()) {
				Rental rent = new Rental(resultSet.getInt(1), 
									resultSet.getInt(2),
									resultSet.getInt(3),
									resultSet.getInt(4),
									resultSet.getString(5),
									resultSet.getString(6));
				
				
				rentals.add(rent);
			}
		} catch (Exception e) {
			System.out.println("Ops: " + e.getMessage());
		}
		
		return rentals;
	}
	
	public void store(Rental rental) {
		try {
			Connection connection = ConnectionFactory.getConnection();
			
			String sql = "INSERT INTO rental(employee_id, user_id, vehicle_id, date_withdrawa, date_delivered) VALUES(?, ?, ?, ?, ?)";
			 
			 PreparedStatement conn = connection.prepareStatement(sql);
			 
			 conn.setInt(1, rental.getEmployeeId());	
			 conn.setInt(2, rental.getUserId());
			 conn.setInt(3, rental.getVehicleId());
			 java.util.Date utilDate = new java.util.Date();
	         java.sql.Timestamp date = new java.sql.Timestamp(utilDate.getTime());
			 conn.setTimestamp(4, date);
			 conn.setTimestamp(5, date);
			 
			 
			 conn.execute();
			 conn.close();
			 connection.close();
		} catch (Exception e) {
			System.out.println("Ops: " + e.getMessage());
		}
	}
	
	public void update(Rental rental) {
		try {
			Connection conexao = ConnectionFactory.getConnection();
			
			String sql = "UPDATE rental SET date_delivered = ?, date_withdrawa = ? WHERE id = ?";
			
			PreparedStatement conn = conexao.prepareStatement(sql);
			
			conn.setString(1, rental.getDateWithdrawa());	
			conn.setString(2, rental.getDateDelivered());
			conn.setInt(3, rental.getId());
			conn.execute();
			
			conn.close();
			conexao.close();
		} catch (Exception e) {
			System.out.println("Ops: " + e.getMessage());
		}
	}
	
	public void destroy(Rental rental) {
		try {
			Connection connection = ConnectionFactory.getConnection();
			
			String sql = "DELETE FROM rental WHERE id = ?";
			
			PreparedStatement conn = connection.prepareStatement(sql);
			conn.setInt(1, rental.getId());
			conn.execute();
			conn.close();
			
			connection.close();
		} catch (Exception e) {
			System.out.println("Ops: " + e.getMessage());
		}
	}
}
