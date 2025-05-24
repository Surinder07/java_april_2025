package may24;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size upto which you want to print array.");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the element of array");

        for (int i = 0; i <arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        ReverseArray.reverseArray(arr);
    }
}
