package may24;

import java.util.Arrays;
import java.util.Collections;

public class LargestInArray {
    public static void main(String[] args) {
        int[] arr = {12,23,543,23,45,10001,23,1243,43,23};


        int largest = arr[0];
        for (int i = 0; i <arr.length ; i++) {

            // 12   < 23
            if(largest < arr[i]){
                largest = arr[i];
            }

        }

        // write a method which takes input as array and
        // return the largest element


    }

    public int largestElementInArray(int[] arr){


        return 0;
    }
}

//