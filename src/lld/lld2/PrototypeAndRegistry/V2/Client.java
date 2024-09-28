package lld.lld2.PrototypeAndRegistry.V2;



import java.util.ArrayList;

public class Client {

    static void doSomething(Student s){
        Student st2= s.Copy();
////        IntelligentStudent copy = new IntelligentStudent();
////        Student st2 = new Student(s);
    }
    public static void fillRegistery(StudentRegistry studentRegistry){
        Student st1 = new Student();
        studentRegistry.register("Student",st1);
        IntelligentStudent st2 = new IntelligentStudent();
        studentRegistry.register("Intelligent Student", st2);
    }



    public static void main(String[] args) {
//        Student st = new Student();
//        st.batch = "Test";
//        st.name = "ScalerStudent";
       // Student st1 = new Student();
        //Student st2 = st.Copy();

       // doSomething(st1);
//
        IntelligentStudent ist = new IntelligentStudent();
        doSomething(ist);
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistery(studentRegistry);
        Student st =studentRegistry.get("Intelligent Student");
        Student st2 = studentRegistry.get("Student");

        System.out.println(st);
        System.out.println(st2);




    }
}