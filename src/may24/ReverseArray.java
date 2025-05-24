package may24;

public class ReverseArray {

    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;

        while (start < end){ // 0 < 4,            1<3 , 2< 2

            int temp = arr[start]; // temp = 10
            arr[start] = arr[end]; //  arr[end] = 50 , will become arr[start] = 50
            arr[end] = temp;  // arr[end]  = 10, coming from temp
            start++; // 1
            end--; // 3
        }

    }



}
