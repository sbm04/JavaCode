package lld.lld2.builder.student;

public class client {

    public static void main(String[] args) {
        //Student st = new Student();
//        StudentBuilder sb = new StudentBuilder();
//
//        sb.setAge(25);
//        sb.setBatch("Apr 23");
//        sb.setGradYear(2025);
//
//        Student st = new Student(sb);
//        StudentBuilder sb =Student.getBuilder();
//        sb.setAge(25);
//        sb.setBatch("Apr 23");
//        sb.setGradYear(2025);

        Student st = Student.getBuilder()
                .setAge(25)
                .setBatch("Apr 23")
                .setGradYear(2023 )
                .build();
        System.out.println(st);

    }

}
