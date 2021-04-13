package model;

public class Rental {
	private int id;
	private int user_id;
	private int employee_id;
	private int vehicle_id;
	private String date_withdrawa;
	private String date_delivered;

	
	public Rental(int id, int user, int employee, int vehicle, String date_withdrawa, String date_delivered) {
		this.setId(id);
		this.setUserId(user);
		this.setEmployeeId(employee);
		this.setVehicleId(vehicle);
		this.setDateDelivered(date_delivered);
		this.setDateWithdrawa(date_withdrawa);
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getDateWithdrawa() {
		return date_withdrawa;
	}


	public void setDateWithdrawa(String date_withdrawa) {
		this.date_withdrawa = date_withdrawa;
	}


	public String getDateDelivered() {
		return date_delivered;
	}


	public void setDateDelivered(String date_delivered) {
		this.date_delivered = date_delivered;
	}


	public int getUserId() {
		return user_id;
	}


	public void setUserId(int user_id) {
		this.user_id = user_id;
	}


	public int getEmployeeId() {
		return employee_id;
	}


	public void setEmployeeId(int employee_id) {
		this.employee_id = employee_id;
	}


	public int getVehicleId() {
		return vehicle_id;
	}


	public void setVehicleId(int vehicle_id) {
		this.vehicle_id = vehicle_id;
	}


}
