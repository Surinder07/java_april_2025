package may24;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter the elements of array");
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = scanner.nextInt();
        }

     /*   arr[0] = 101;
        arr[1] = 102;
        arr[2] = 103;
        arr[3] = 104;*/

        System.out.println("Print all the elements ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }


      /*  int x1 = 101;
        int x2 = 102;
        int x3 = 103;
        int x4 = 104;*/
    }
}
