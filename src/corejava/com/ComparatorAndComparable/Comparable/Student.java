package corejava.com.ComparatorAndComparable.Comparable;

public class Student implements Comparable<Student>{
    String name;
    int age;
     Student(String name, int age){
         this.name = name;
         this.age = age;
     }
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
