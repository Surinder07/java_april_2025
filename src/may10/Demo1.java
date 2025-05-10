package may10;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the limit");

        int limit = scanner.nextInt();

        int x = 1;
       do{
           System.out.println(x);
           x++;
       }while (x <= limit);  // 1 > 10
    }
    /*
      Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the limit");
        int limit = scanner.nextInt();
        int x = 1;
        while (x <= limit){
            System.out.println(x);
            x++; // x = x + 1;
        }
     */


}
/*
 // print numbers from 1 - 10
        // print numbers 1- n
        // print the sum of first 'n' numbers
        // print alphabets from a - z
        //    print the multiplcation table of 5

 */
