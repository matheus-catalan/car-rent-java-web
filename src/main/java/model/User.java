package model;

public class User extends Model{
	private int id;
	private String name;
	private String phone;
	private String cpf;
	private String gender;
	private String email;
	
	public User(String name, String email, String phone, String cpf, String gender) {
		super();
		this.setName(name);
		this.setEmail(email);
		this.setPhone(phone);
		this.setCpf(cpf);
		this.setGender(gender);
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}
