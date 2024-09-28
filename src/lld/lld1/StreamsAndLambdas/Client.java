package lld.lld1.StreamsAndLambdas;



import java.util.*;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;




public class Client {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public  void test2(){
                System.out.println(" Hello Test2");
            }
            @Override
            public void run() {
                System.out.println(" Hello World");
            }
        };
        Thread th = new Thread(r);

//        Comparator<Integer> cmp = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return 0;
//            }
//        };

        Thread t1 = new Thread(){
            @Override
            public void run() {
                System.out.println(" Hello Thread");
            }
        };

        SampleInterface s1 = new SampleInterface() {
            @Override
            public void fun() {

            }

            @Override
            public void bun() {

            }
        };

        // Lambda Expressions are valid only in Functional Interfaces
        // () -> {}

        Runnable r1 = ()->{
            System.out.println(" Hey ");
        };
        Thread thread1 = new Thread(r1);
        thread1.start();

        Comparator<Integer> c1=(o1 , o2)->{
            return o1-o2;
        };
        Thread t3= new Thread(()->{
            System.out.println(" Hey lambda run");
        });

        Thread t4 = new Thread(()->   System.out.println(" Hey lambda run"));
        
        //Stream

        //A stream in Java is a way to process data from collections like lists or arrays.
        // It allows you to perform operations like filtering, mapping, and sorting in a clear and simple way.
        // Streams don't change the original data but provide a way to work with it efficiently,
        // and they can be used in parallel to make tasks faster.

        List<Integer> l2 = List.of(5,10,2,3,4,5,6,5,7,8,9);
        Stream<Integer> stm= l2.stream();

        
        //        Streams -> Intermediate Terminal

        // forEach is a Terminal Operation
        // As soon as you use a terminal Method that stream can't be used anymore
        //stm.forEach((elem)-> System.out.print(elem+" "));
        // below is not allowed
        //s1.limit(4);

        //There is no change in the original collection because of what we are doing in stream
//        Stream<Integer> s2 = l2.stream().limit(4);
//        s2.forEach((ele)-> System.out.println(" Hello Stream"  + ele));
//
//        l2.stream().limit(6).forEach((ele)-> System.out.println("Data " + ele));

        List<Student> list1 =new ArrayList<Student>();
        Student st1 = new Student(25 , 65.0 , "Mohit" , 10.0);
        Student st2 = new Student(21 , 78.0 , "Nishant" , 100.0);
       //st1.compareTo(st2);
        //System.out.println(" compare "+st1.compareTo(st2));

        list1.add(st1);
        list1.add(new Student(21 , 78.0 , "Nishant" , 100.0));
        list1.add(new Student(28 , 20.0 , "Rohan" , 90.0));


        //list1.stream().filter(ele->ele.psp>10).sorted((o1,o2)-> (int) (o2.psp-o1.psp)).forEach(ele-> System.out.println("  Element  psp " + ele));

        // Filter : Intermediate;
        list1.stream().filter(elem -> {
            return elem.psp>50;
        }).forEach(elem -> {
        //  System.out.println(elem.name+" "+elem.psp);
//            elem =
        });

        //System.out.println(list1);
        // Collect : Terminal
//
//        List<Student>l3 = list1.stream().filter(elem -> {
//            return elem.psp>50;
//        }).collect(Collectors.toList());//      System.out.println(l3);
        List<Integer> list = List.of(5,10,2,3,4,5,6,5,7,8,9);
        List<Integer> l4 = list.stream()
                .filter(ele->{
                    System.out.println(" Filter " + ele);
                    return ele%2==0;
                })
                .map(ele->{
                    System.out.println(" Map " + ele);
                    return ele*ele;
                })
                .sorted((o1,o2)->o2-o1)
                .collect(Collectors.toList());
        System.out.println(l4);

//                    List<Integer> l5 = List.of(5 , 10 ,2 ,1 ,16 , 3 ,8 , 1 , 2 , 2);
//            // Find First -> Terminal
//            Optional<Integer> op1 = l5.stream().
//                    filter(elem -> {
//                        System.out.println("Filtering "+elem);
//                        return (elem%2==0);
//                    }).map( (elem) -> {
//                        System.out.println("Mapping "+elem);
//                        return elem*elem;
//                    }).findFirst();
//
//            if(op1.isPresent()){
//                System.out.println(op1.get());
//            }
//        List<Integer> l6 = List.of(5 , 10 ,2 ,1 ,16 , 3 ,8 , 1 , 2 , 2);
//        int count =
//                (int) l6.stream().filter(e -> {
//                    System.out.println("Counting "+e);
//                    return e>2;}).count();
//
//        System.out.println(count);
//
        List<Integer> l6 = List.of(5 , 10 ,2 ,1 ,16 , 3 ,8 , 1 , 2 , 2);
        int count =
                (int) l6.stream().map(e -> {
                   System.out.println("Counting "+e);
                    return e*e;}).count();

        System.out.println(" count  " + count);

        //Stream<Integer> test = l5.stream().map(e -> e*e);
//         find sum of a list
//        int sum = 0;
//        for(Integer elem : l5) {
//
//            sum += elem;
//        }

//         reduce is a terminal Function
//         it tries to converge your whole stream into a single element based on some logic
//        Integer x9 = l5.stream().reduce(0,(cur_sum,elem)->{
//            cur_sum+=elem;
//            return cur_sum;
//        });
//
//        System.out.println(x9);


        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        // nested list
        System.out.println(listOfLists);

//        List<Integer> ans = listOfLists.stream().flatMap(elem -> {
//            return elem.stream();
//        }).collect(Collectors.toList());
//
//        List<Integer> ans = listOfLists.stream().flatMap(elem -> {
//            return elem.stream().map(elem1 -> elem1*elem1);
//        }).collect(Collectors.toList());
//
//        System.out.println(ans);

        //        l2.stream().filter(elem-> elem%2==0).findFirst();
//        List<Integer> l6 = List.of(4,7,2,6);
//        Stream<Integer> stnew = l6.stream();
//        stnew = stnew.distinct();
//        stnew = stnew.filter(elem ->{
//            System.out.println("Print Hello World");
//            return elem%2==0;
//        });
//
//        Optional<Integer> test2 = stnew.findFirst();
//        System.out.println(test2);










    }
}
