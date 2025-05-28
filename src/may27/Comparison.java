package may27;

public class Comparison {
    public static void main(String[] args) {

        String s1 = "Pragra";
        // array
        char[] chars = s1.toCharArray();


        String s2 = new String("Pragra");

        String s3 = new String("Pragra");

        String s4 = "Pragra";


        System.out.println();
     //   System.out.println(s1.equals(s2)); // true
        System.out.println(s2.equals(s3)); // false

       // System.out.println(s1.equals(s3));  // true
       System.out.println(s1 == s4); // True


        // ==
        // .equals()

        // racecar        , madam
        // given a string - take a user input for a string
        // check if the string is palindrome

    }
}
