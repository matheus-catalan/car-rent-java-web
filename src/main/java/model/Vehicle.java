package model;

public class Vehicle extends Model{
	private int id;
	private String identification;
	private String manufacturer;
	private String model;
	private String year;
	private String fuel;
	private String status;
	
	public Vehicle() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getIdentification() {
		return identification;
	}
	public void setIdentification(String identification) {
		this.identification = identification;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getFuel() {
		return fuel;
	}
	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
//	public String getCreatedAt() {
//		return created_at;
//	}
//
//	public void setCreatedAt(String created_at) {
//		this.created_at = created_at;
//	}
//
//	public java.sql.Timestamp getUpdatedAt() {
//		return updated_at;
//	}
}



