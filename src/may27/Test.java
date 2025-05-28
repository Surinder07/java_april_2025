package may27;

public class Test {
    public static void main(String[] args) {

        // Immutable - wont change the existing object
        String s1 = "Pragra";
        String myCompany = s1.concat(" Inc");
        System.out.println(s1);  // Pragra
        System.out.println(myCompany);  // Pragra Inc


        // Mutable - which will change the exiting object
        StringBuffer sb = new StringBuffer("Pragra");
        StringBuffer company = sb.append(" Inc");

        System.out.println(sb); // Pragra     or Pragra Inc
        StringBuffer reverse = company.reverse();
    }
}







  /* StringBuffer stringBuffer = new StringBuffer("Pragra");
        StringBuffer reverse = stringBuffer.reverse();

        System.out.println(reverse);*/