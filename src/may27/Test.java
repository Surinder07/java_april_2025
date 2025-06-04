package may27;

public class Test {
    public static void main(String[] args) {

        // Immutable - wont change the existing object
        String s1 = "Pragra";
        String myCompany = s1.concat(" Inc");
        System.out.println(s1); // ----------> // Pragra
       // System.out.println(myCompany);  // Pragra Inc

        s1 = "something";
        System.out.println(s1);

/*
        // Mutable - which will change the exiting object
        StringBuffer sb = new StringBuffer("Missis ");

        System.out.println("Before append");
        System.out.println(sb);


        StringBuffer company = sb.append(" Sauga");

        System.out.println("After append");
        System.out.println(sb);
        StringBuffer reverse = company.reverse();*/
    }
}







  /* StringBuffer stringBuffer = new StringBuffer("Pragra");
        StringBuffer reverse = stringBuffer.reverse();

        System.out.println(reverse);*/