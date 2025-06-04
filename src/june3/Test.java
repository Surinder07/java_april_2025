package june3;

public class Test {
    public static void main(String[] args) {
        Student student = new Student(101,"Sunny");
        System.out.println(student);

        student.id = 201;
        student.name = "Edward";

        System.out.println(student);



    }
}

class Student {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
