package may10.part2;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        String finalGreeting = greeting(" Varun ");
        System.out.println(finalGreeting);

        Test.show();

    }

    public static String greeting(String name){
        String greet = "Hello" + name;
        return greet;
    }

    public static void show(){
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

    accessmodifier returnType name(parameters) {

       // method body

      return statement
    }


     */


}
