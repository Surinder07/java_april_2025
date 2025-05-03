package may3;
public class LogicalOp {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int a = 15;
        int b = 25;
                        // F      &&      F
        boolean result1 = !((x <= y ) || (x > b));  //
        System.out.println(result1);
        boolean result2 = ((x > y ) && (a > 348));  // false
        boolean result3 = !((x >= y ) || (x > a)); // true
        boolean result4 = ((x > y ) && (a > 18)); // false
        boolean result5 = !((a >= y ) || (x > 8)); // false
        boolean result6 = !((x > y ) || (x > 23)); // true
        boolean result7 = ((b > y ) && (x > 8)); // true
        boolean result8 = ((x >= y ) || (x <= 10)); // true
        boolean result9 = ((x > y ) && (x > a)); // false
        boolean result10 = !((x == y ) || (x <= 8)); // true
    }
}
