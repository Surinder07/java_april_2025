package may17;

public class Main {
    public static void main(String[] args) {
        //  object reference
        // int          x = 10;
        Employee employee = new Employee();
        Employee employee1 = new Employee(101); // this is how you call a constructor\
        Employee employee2 = new Employee(102, "Edward");
        Employee employee3 = new Employee(103, "Sunny", "email@gmail.com");
        Employee employee4 = new Employee(104, "Dharmik", "email@gmail.com", 120001.12);

        employee2.display();
    }
}

/*

            Stack                               Heap


 */