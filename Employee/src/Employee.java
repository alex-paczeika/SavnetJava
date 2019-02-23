public class Employee {


    private String name;
    private int age;
    private int salary;
    private Employee manager;

    public Employee(String name, int age, int salary, Employee manager) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.manager = manager;

    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public Employee getManager() {
        return manager;
    }
}
