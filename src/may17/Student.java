package may17;

public class Student {
    int id;
    String name;

    public Student() {
        System.out.println("Within the default constructor");
    }

    public Student(int id) {
        System.out.println("withing 1 param constructor");
        this.id = id;
    }

    public Student(int id, String name) {
        this();
         // which calls the default constructor
        System.out.println("Withing 2 param const");
        this.id = id;
        this.name = name;

    }
    public void show(){
        System.out.println(id);
        System.out.println(name);
    }
}
