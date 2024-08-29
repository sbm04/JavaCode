package lld.lld2.builder.student;

public class StudentBuilder {

    int age;
    String name;
    String batch;
    int gradYear;
    String course;

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    public Student build(){
        return new Student(this);
    }
}
