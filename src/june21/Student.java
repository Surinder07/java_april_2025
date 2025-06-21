package june21;

public class Student<T,R> {
    private T id;
    private R name;

    public Student(T id, R name) {
        this.id = id;
        this.name = name;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public R getName() {
        return name;
    }

    public void setName(R name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name=" + name +
                '}';
    }
}
