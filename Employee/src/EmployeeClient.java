import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {


    public void salarucelmaimic(List<Employee> arraylist) {
        int min = arraylist.get(0).getSalary();
        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i).getSalary() < min)
                min = arraylist.get(i).getSalary();
        }
        for (int i = 0; i < arraylist.size(); i++) {
            if (min == arraylist.get(i).getSalary()) {
                System.out.println("Angajatul cu cel mai mic salariu este: " + arraylist.get(i).getName());
            }
        }

    }

    public void salariucelmaimare(List<Employee> arraylist) {
        int max = arraylist.get(0).getSalary();
        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i).getSalary() > max)
                max = arraylist.get(i).getSalary();
        }
        for (int i = 0; i < arraylist.size(); i++) {
            if (max == arraylist.get(i).getSalary()) {
                System.out.println("Anagajtul cu cel mai mare salariu este: " + arraylist.get(i).getName());
            }
        }
    }


    public void salariulmediu(List<Employee> arraylist) {
        int suma = 0;
        for (int i = 0; i < arraylist.size(); i++) {
            suma = suma + arraylist.get(i).getSalary();
        }

        System.out.println("Salariu mediu al angajatilor este: " + suma / arraylist.size());

    }

    public void varstamedie(List<Employee> arraylist) {
        int suma = 0;
        for (int i = 0; i < arraylist.size(); i++) {
            suma = suma + arraylist.get(i).getAge();
        }

        System.out.println("Varsta medie a angajatilor este: " + suma / arraylist.size());
    }

    public void celmaitanar(List<Employee> arraylist) {
        int celmaitanar = arraylist.get(0).getAge();
        for (int i = 0; i < arraylist.size(); i++) {
            if (arraylist.get(i).getAge() < celmaitanar)
                celmaitanar = arraylist.get(i).getAge();
        }
        for (int i = 0; i < arraylist.size(); i++) {
            if (celmaitanar == arraylist.get(i).getAge()) {
                System.out.println("Cel mai tanar angajat este: " + arraylist.get(i).getName());
            }
        }
    }

    public void faramanager(List<Employee> arrylist) {
        for (int i = 0; i < arrylist.size(); i++) {
            if (arrylist.get(i).getManager() == null) {
                System.out.println("Angajatul fara manager este" + arrylist.get(i).getName());
            }
        }
    }


}
