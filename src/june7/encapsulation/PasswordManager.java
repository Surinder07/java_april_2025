package june7.encapsulation;

public class PasswordManager {
    public static void main(String[] args) {

        LoginDemo loginDemo = new LoginDemo("user123", "pass123");

        // object here
        System.out.println("Initial creds");
        System.out.println(loginDemo);

        loginDemo.loginUser("User123", "pass123");

        //
        System.out.println(loginDemo.getUserName());
        loginDemo.setPassword("NewUpdatedPaswword.....");


        System.out.println("Creds after someone hacked into ");
        System.out.println(loginDemo);



    }
}
