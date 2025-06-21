package june21.collections;

import june21.immutable.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeListDemo {
    public static void main(String[] args) {


        /*
        data types
        primitive : int , float, double, char, boolean
        non prim :  String,  Array, Class, Interfaces, Objects, Employee,
        Student, Computer, Test

         */

        List<Integer> list1 = new ArrayList<>();

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101, "Edward", 200_000.00));
        list.add(new Employee(102, "Dharmik", 104_000.00));
        list.add(new Employee(103, "Parminder", 300_000.00));
        list.add(new Employee(104, "Roop", 100_030.00));
        list.add(new Employee(105, "Utsav", 150_000.00));
        list.add(new Employee(106, "Sunny", 200_000.00));

        System.out.println(list);

        Employee max = list.get(0);
        /*
            for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        for(){
               list.get(i).getSalary()  > max {
                max = list.get(i).getSalary();
               }
        }

         */

        //list.get(1).getSalary()



    }
}
