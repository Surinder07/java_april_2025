package may17;

public class Employee {
    int id;
    String name;
    String email;
    double salary;

    public Employee() {
    }

    public Employee(int id) {
        this.id = id;
    }

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Employee(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public Employee(int id, String name, String email, double salary) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

    public void display() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(email);
        System.out.println(salary);
    }
}
