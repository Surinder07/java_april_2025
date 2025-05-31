package may31;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line ");
        String input = scanner.nextLine();
        int letter = 0;
        int digit = 0;
        int special = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(Character.isLetter(c)) {
                letter++;
            }
            else if (Character.isDigit(c)){
                digit++;
            }else {

            }
        }

        System.out.println("Letter count " + letter);
        System.out.println("Letter count " + digit);
      //  Character.isWhitespace()
      //  Character.isDigit()
       // Character.is
     /*
     take out the user name from this email
        training@pragra.io

      */




    }
}
