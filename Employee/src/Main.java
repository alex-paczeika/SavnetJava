import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List<Employee> angajati = new ArrayList<Employee>();
		Employee manager = new Employee("Nelu", 10, 2242, null);
		Employee emp1 = new Employee("Robi", 49, 149, manager);
		Employee emp2 = new Employee("Alex", 38, 645, manager);
		Employee emp3 = new Employee("Andrei", 15, 123, manager);

		angajati.add(manager);
		angajati.add(emp1);
		angajati.add(emp2);
		angajati.add(emp3);

		EmployeeClient employeeClient = new EmployeeClient();

		employeeClient.salarucelmaimic(angajati);
		employeeClient.salariucelmaimare(angajati);
		employeeClient.salariulmediu(angajati);
		employeeClient.varstamedie(angajati);
		employeeClient.celmaitanar(angajati);
		employeeClient.faramanager(angajati);

	}

}
