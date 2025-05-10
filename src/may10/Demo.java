package may10;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        // print numbers from 1 - 10
        // print numbers 1- n
        // print the sum of first 'n' numbers
        // print alphabets from a - z
        //    print the multiplcation table of 5
        /*
            5 *  1 = 5;
            5 *  2 = 10;
            5 *  3 = 15;
            5 *  4 = 20;
            5 *  5 = 25;


         */



        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = scanner.nextInt();
        int x = 1;
        while (x <= limit){
            System.out.println(x);
            x++; // x = x + 1;
        }
    }
}
