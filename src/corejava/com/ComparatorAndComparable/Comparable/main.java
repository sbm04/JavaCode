package corejava.com.ComparatorAndComparable.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class main {
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

//        Collections.sort(slist);
       // In Java, Comparator and Comparable are interfaces used to compare objects,
        // but they serve different purposes. Here's an easy explanation with examples:

         //Comparable
         // Used to define the natural ordering of objects.
         // The class whose objects needs to be compared implements the Comparable interface.
        //Overrides the compareTo() method.

//        Collections.sort(slist, new Comparator<Student>() {
//            public int compare(Student s1, Student s2) {
//                return s2.age - s1.age;
//            }
//        });
        System.out.println(slist);

    }
}
