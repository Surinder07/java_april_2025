package may10.part2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        sum();
    }

    private static void sum(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number x ");
        int x = scanner.nextInt();
        System.out.println("Enter the number y ");
        int y = scanner.nextInt();

        int sum = x + y;
        System.out.println("Sum of x and y "+sum);
    }

}
