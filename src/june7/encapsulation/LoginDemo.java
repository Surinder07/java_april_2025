package june7.encapsulation;

public class LoginDemo {

    private String userName;
    private String password;


    // fetch the previous username
    public String getUserName() {
        return userName;
    }

    // this will update the new password
    public void setPassword(String password) {
        this.password = password;
    }

    public LoginDemo(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public void loginUser(String userName, String password){
        if(userName.equalsIgnoreCase(this.userName) && password.equals(this.password) ){
            System.out.println("Login Successful");
        }else {
            System.out.println("Invalid Credentials, please check your username or password");
        }
    }

    @Override
    public String toString() {
        return "LoginDemo{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
