package Collection;

import java.util.Comparator;

public class StudentPSPComparator implements Comparator<Student> {

    //accending order
//    @Override
//    public int compare(Student o1, Student o2) {
//        if(o1.age< o2.age){
//            return -1;
//        } else if (o1.age>o2.age) {
//            return 1;
//        }
//        else{
//            return 0;
//        }
//    }
    //decending order
    @Override
    public int compare(Student o1, Student o2) {
        if(o1.age> o2.age){
            return -1;
        } else if (o1.age<o2.age) {
            return 1;
        }
        else{
            return 0;
        }
    }
}
