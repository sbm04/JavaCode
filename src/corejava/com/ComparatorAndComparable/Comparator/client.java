package corejava.com.ComparatorAndComparable.Comparator;

import java.util.ArrayList;
import java.util.*;

public class client {
    public static void main(String[] args) {
        Student s1 = new Student("Shubham ", 25);
        Student s2 = new Student("Rahul ", 22);
        Student s3 = new Student("Aman ", 26);
        Student s4 = new Student("Yesh" , 29);
        ArrayList<Student> slist = new ArrayList<Student>();
        slist.add(s1);
        slist.add(s2);
        slist.add(s3);
        slist.add(s4);
        //Comparator
        // Used to define custom ordering of objects.
        // Aseparate class or lambda expresion implements the Comparator interface.
        // Override the compare() method.
        //Key Point: You can create multiple comparators for different orderings.

        Collections.sort(slist,new AgeComparator());

//        Collections.sort(slist, new Comparator<Student>() {
//            public int compare(Student s1 , Student s2) {
//
//                return s2.age - s1.age;
//            };
//        });
        System.out.println(slist);

    }
}
