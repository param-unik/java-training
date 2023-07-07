package comp.citibank.training_day_1.main;
import comp.citibank.training_day_1.domain.*;

public class EmployeeManagerMain {

	public static void main(String[] args) {
		System.out.println("I am in main method..");
		
		Manager manager = new Manager();
		manager.givetask();

		Employee emp = new Employee();
		int emp_cont = emp.dotask();
		
		System.out.println("employee is givng " + emp_cont + '%');
		
		System.out.println("I am exiting from main method..");	
	}

}
