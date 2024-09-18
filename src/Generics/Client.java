package Generics;

import java.util.*;
import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
//        Pair<Integer,Integer> p1 = new Pair<>(5,4);
//        p1.setFirst(5);
//        System.out.println(p1.getFirst());
//
//        Pair<String,Integer> p2 = new Pair<>("Hello",5);
//        p2.setFirst("Hello");
//        //p2.first = 500;
//        System.out.println(p2.getFirst());
//
//                // Raw types
//        // This is allowed because of backward compatibility
//        Pair p = new Pair();
//        p.first = "India";
//        p.second = "Winner";
//
//        //p.first = 5;
//        System.out.println(p.getFirst());
//        HashMap map = new HashMap();
//        map.put("India","Winner");
//        map.put(151,"Winner");
//        //HashMap<Object,Object> map = new HashMap<>();

//        Pair.doSomthing(550.8);
//
//        Pair<Integer,String> p1 = new Pair<>();
//        p1.first = 5;
//        System.out.println(p1.doAgain(10,"Puneet",55,45));

        List<Dog> dogs = new ArrayList<>();
//        dogs.add(new Animal(""));
        dogs.add(new Dog("Tobby"));
        dogs.add(new Dog("Tommy"));
//        dogs.add(new Cat)

        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("Tom"));
        animals.add(new Dog("Tom1"));
        //
        AnimalUtility.printAnimalNames(dogs);
        AnimalUtility.printAnimalNames(animals);


    }
}
