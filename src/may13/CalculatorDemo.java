package may13;

public class CalculatorDemo {
    public static void main(String[] args) { // JVM is calling this method

        Calculator calculator = new Calculator();
        int result = calculator.sum(10, 20);// arguments
        System.out.println("Sum of 10 and 20 is "+ result);

        int result2  = calculator.sum2(30, 40);
        System.out.println("Sum of 30 and 40 is "+ result2);

        int average = result + result2;

        System.out.println("Average of result 1 and result 2 "+ average/2);

    }
}
