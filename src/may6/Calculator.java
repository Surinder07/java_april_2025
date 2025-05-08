package may6;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.println("************************");
        System.out.println("Welcome to My calculator");
        System.out.println("************************");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Modulus");
        System.out.println("0. Exit");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the option : ");
        int option = scanner.nextInt();

        if(option == 1 ){
            int x = 10;
            int y = 20;
            int sum = x + y;
            System.out.println(sum);
            // add
        }else if(option == 2) {
            System.out.println("option 2");

            // sub
        }else if(option == 3){
            // multiplication
            System.out.println("option 3");

        }
        else if(option == 4){
            // division
            System.out.println("option 4");
        }
        else {
            System.exit(0);
        }


        // press 1
        // enter the num1,
        // enter the num2
        // sum of num1 and num2 is result


        // press 2
        // enter the num1,
        // enter the num2
        // sub of num1 and num2 is result


        System.exit(0);




    }
}
