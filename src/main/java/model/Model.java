package model;

public class Model {
    public java.sql.Timestamp created_at;
	public java.sql.Timestamp updated_at;

    public Model() {
        java.util.Date utilDate = new java.util.Date();
	    java.sql.Timestamp date = new java.sql.Timestamp(utilDate.getTime());
		this.setCreatedAt(date);
		this.setUpdatedAt(date);
    }

    public void setCreatedAt(java.sql.Timestamp created_at) {
		this.created_at = created_at;
	}
    
    public java.util.Date getCreatedAt() {
		return created_at;
	}

	public void setUpdatedAt(java.sql.Timestamp updated_at) {
		this.updated_at = updated_at;
	}
	
	public java.sql.Timestamp getUpdatedAt() {
		return created_at;
	}
}