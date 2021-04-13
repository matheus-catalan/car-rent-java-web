package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Vehicle;
import model.connection.ConnectionFactory;

public class VehicleDAO {
	public List<Vehicle> index(){
		List<Vehicle> vehicles = new ArrayList<>();
		
		try {
			Connection connection = ConnectionFactory.getConnection();
			
			String sql = "SELECT id, identification, manufacturer, model, year, fuel, status, created_at FROM vehicles";
			
			PreparedStatement conn = connection.prepareStatement(sql);
			
			ResultSet resultSet = conn.executeQuery();
			
			while(resultSet.next()) {
				Vehicle vehicle = new Vehicle(resultSet.getInt(1), 
				resultSet.getString(2),
				resultSet.getString(3), 
				resultSet.getString(4), 
				resultSet.getString(5),
				resultSet.getString(6),
				resultSet.getString(7),
				resultSet.getString(8));
				
				vehicles.add(vehicle);
			}
		} catch (Exception e) {
			System.out.println("Ops: " + e.getMessage());
		}
		
		return vehicles;
	}
	
	public void store(Vehicle vehicle) {
		try {
			Connection connection = ConnectionFactory.getConnection();
			
			String sql = "INSERT INTO vehicles(id, identification, manufacturer, model, year, fuel, status, created_at) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
			 
			PreparedStatement conn = connection.prepareStatement(sql);
			 
            conn.setInt(1, vehicle.getId()); 
			conn.setString(2, vehicle.getIdentification());
			conn.setString(3, vehicle.getManufacturer());
			conn.setString(4, vehicle.getModel());
			conn.setString(5, vehicle.getYear());
			conn.setString(6, vehicle.getFuel());
			conn.setString(7, vehicle.getStatus());
	        java.util.Date utilDate = new java.util.Date();
	        java.sql.Timestamp date = new java.sql.Timestamp(utilDate.getTime());
			conn.setTimestamp(8, date);
			 
			 
			 conn.execute();
			 conn.close();
			 connection.close();
		} catch (Exception e) {
			System.out.println("Ops: " + e.getMessage());
		}
	}
	
	
	
	
}
