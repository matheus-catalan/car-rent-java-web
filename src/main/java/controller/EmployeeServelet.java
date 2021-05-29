package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Employee;
import model.dao.EmployeeDAO;



@WebServlet("/employees")
public class EmployeeServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher rd = request.getRequestDispatcher("employee/create.jsp");
		rd.forward(request, response);
	}
	
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String cpf = request.getParameter("cpf");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String gender = request.getParameter("gender");
		
		Employee employee = new Employee(name, email, phone, cpf, gender);
	
		
		EmployeeDAO employeeDAO = new EmployeeDAO();
		
		employeeDAO.store(employee);
		
		RequestDispatcher rd = request.getRequestDispatcher("employee/list.jsp");
		rd.forward(request, response);
	}
	

}
