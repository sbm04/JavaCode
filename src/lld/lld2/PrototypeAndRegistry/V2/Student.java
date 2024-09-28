package lld.lld2.PrototypeAndRegistry.V2;

public class Student implements ProtoType<Student> {
    int id;
    String name;
    String batch;
    Student(){

    }

    Student(Student st) {
        this.id = st.id;
        this.name = st.name;
        this.batch = st.batch;
    }

    @Override
    public Student Copy() {
        Student st = new Student(this);
        return st;

    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", batch='" + batch + '\'' +
                '}';
    }
}
