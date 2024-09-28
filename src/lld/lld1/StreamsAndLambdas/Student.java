package lld.lld1.StreamsAndLambdas;

public class Student implements Comparable<Student>{
    public int age;
    public double psp;
    public String name;
    public double attendance;

    public Student(int age, double psp, String name, double attendance) {
        this.age = age;
        this.psp = psp;
        this.name = name;
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Student{" + '\n'+
                "age=" + age +
                ", psp=" + psp +
                ", name='" + name + '\'' +
                ", attendance=" + attendance +
                '}';
    }
    //decending order of age

//    @Override
//    public int compareTo(Student o) {
//
//        //This Object to come first return -1
//        // Other Object to come first 1
//        //else return 0
//        if(this.age>o.age){
//            return -1;
//        }
//        else if(this.age<o.age){
//            return 1;
//        }
//        else{
//            return 0;
//        }
//    }
    //asscending order
//    public int compareTo(Student o){
//        if(this.age<o.age){
//            return -1;
//        } else if (this.age>o.age) {
//            return 1;
//        }
//        else{
//            return 0;
//        }
//    }
//     //asscending order
//    public int compareTo(Student o) {
//      return this.age-o.age;
//    }

    //decending  order
//    public int compareTo(Student o) {
//        return o.age-this.age;
//    }

    public int compareTo(Student o) {
        return this.age-o.age;
    }
}
