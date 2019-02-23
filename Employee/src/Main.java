import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> angajati = new ArrayList<Employee>();
        angajati.add(new Employee("Alex", 30, 2500, new Employee("Carmen", 50, 8599, null)));
        angajati.add(new Employee("Robi", 15, 700, new Employee("Ion", 45, 6000, null)));
        angajati.add(new Employee("Andrei", 10, 250, new Employee("Carmen", 50, 8500, null)));
        angajati.add(new Employee("Ion", 22, 360, new Employee("Carmen", 50, 8500, null)));
        angajati.add(new Employee("John", 32, 500, new Employee("Carmen", 50, 8500, null)));
        angajati.add(new Employee("Carmen", 50, 8500, null));

        EmployeeClient employeeClient = new EmployeeClient();

        employeeClient.salarucelmaimic(angajati);
        employeeClient.salariucelmaimare(angajati);
        employeeClient.salariulmediu(angajati);
        employeeClient.varstamedie(angajati);
        employeeClient.celmaitanar(angajati);
        employeeClient.faramanager(angajati);


    }

}
