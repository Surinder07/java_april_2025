package june21;

public class StudentMain {
    public static void main(String[] args) {
        Student<Integer, String> student1 = new Student<>(100,"Edward");
        System.out.println(student1);

        Student<String, String> student2 = new Student<>("100","Edward");
        System.out.println(student2);
    }
}

/*


Box
item1
item2

create objects with
1. String , Integer
2. Interger, String
3. Double, Integer



 */
