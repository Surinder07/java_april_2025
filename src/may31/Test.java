package may31;

public class Test {
    public static void main(String[] args) {

        String s1 = "    Pragra    ";
        int input = s1.indexOf("a");
        System.out.println(input);

        System.out.println(s1.length());
        System.out.println(s1.toLowerCase());
        char[] chars = s1.toCharArray();
        System.out.println(s1.equalsIgnoreCase("pragra"));
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(2,6));


        System.out.println(s1.intern());

        System.out.println(s1.trim());

    }
}
