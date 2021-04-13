package model;

public class User {
	private int id;
	private String name;
	private String phone;
	private String cpf;
	private String gender;
	private String created_at;

	
	public User(int id, String name, String phone, String cpf, String gender, String created_at) {
		this.setId(id);
		this.setName(name);
		this.setPhone(phone);
		this.setCpf(cpf);
		this.setGender(gender);
		this.setCreatedAt(created_at);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String getCreatedAt() {
		return created_at;
	}

	public void setCreatedAt(String created_at) {
		this.created_at = created_at;
	}
}
