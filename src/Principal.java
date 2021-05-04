import model.Employee;
import model.Rental;
import model.User;
import model.Vehicle;
import model.dao.EmployeeDAO;
import model.dao.RentalDAO;
import model.dao.UserDAO;
import model.dao.VehicleDAO;

public class Principal {
	 public static void main(String[] args) {
		 
		 
		 try {
			 Employee employee = new Employee(0, " Matheus Catalan", "991244528", "46873747866", "Masculino", "2021-04-12 21:13:10");
			 EmployeeDAO employeeDAO = new EmployeeDAO();
			 employeeDAO.store(employee);
			 
			 User user = new User(0, "Matheus Catalan", "991244528", "46873747866", "Masculino", "2021-04-12 21:13:10");
			 UserDAO userDAO = new UserDAO();
			 userDAO.store(user);
			 
			 Vehicle vehicle = new Vehicle(0, "ABC-1234", "VOLKSWAGEN", "GOL", "G4", "flex", "D", "2021-04-12 21:13:10");
			 VehicleDAO vehicleDAO = new VehicleDAO();
			 vehicleDAO.store(vehicle);
			 
			 Rental rental = new Rental(0, 1, 1, 1, "2021-04-12 21:13:10", "2021-04-12 21:13:10");
			 RentalDAO rentalDAO = new RentalDAO();
			 rentalDAO.store(rental);
			 
			 
		 } catch(Exception e) {
			 System.out.println(e.getMessage());
		 }
	 }
	
}
