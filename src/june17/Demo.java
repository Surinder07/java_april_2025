package june17;

public class Demo {
    public static void main(String[] args) {
        advancedCalculator();
        System.out.println("inside the advance Calc");
    }

    public static void advancedCalculator(){
        try {
            calculate(10,0);
        } catch (IllegalArgumentException e) {
           e.printStackTrace();
        }
    }

    public static void calculate(int a, int b) throws IllegalArgumentException{
        if(b == 0){
            throw new IllegalArgumentException("Cannot divide by Zero");
        }


        int result = a / b ;
        System.out.println("Result : "+result);
    }
}
