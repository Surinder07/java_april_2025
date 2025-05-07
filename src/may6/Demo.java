package may6;


import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        // scanner object
        // int      x   = 10;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value for x ");
        int x = scanner.nextInt();

        System.out.println("Enter the value for Y : ");
        int y = scanner.nextInt();

         System.out.println("Enter the value for Z :");
        int z = scanner.nextInt();

        if(x > y && x > z ){
            System.out.println("X is greater");
            if(x == 90){
                System.out.println(" x is 90 ");
            }else{
                System.out.println(" x is not 90 ");
            }
        }
        else if (y > z) {
            System.out.println("Y is greater");
        }
        else {
            System.out.println("Z is greater");
        }
    }
}
// debug mode in intelliJ
// bug :
// Bread
// walmart  : did not find bread
// no frills : found bread
// costco : NO



// Problems we have done so far
// use scanner in those classes
