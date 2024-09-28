package lld.lld2.PrototypeAndRegistry.V1;

public class Student implements ProtoType<Student> {
    int id;
    String name;
    String batch;

    @Override
    public Student Copy() {
        Student st = new Student();
        st.id = this.id;
        st.name = this.name;
        st.batch = this.batch;
        return st;

    }
}
