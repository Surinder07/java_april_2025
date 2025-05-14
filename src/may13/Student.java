package may13;

public class Student {
    int id;
    String name;

   /* // default constructor
    Student(){
        id = 101;
        name = "Edward";
    }*/

    // parameterized

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Student(int id) {
        this.id = id;
    }

    public void show(){
        System.out.println(id);
        System.out.println(name);
    }
}
