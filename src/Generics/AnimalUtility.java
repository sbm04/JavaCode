package Generics;

import java.util.*;

public class AnimalUtility {
//    public static void printAnimalNames(List<Animal> animals) {
//        for (Animal animal : animals) {
//            System.out.println(animal.name);
//        }
//    }
    public static <T extends  Animal> void printAnimalNames(List<T> animals){

        for (Animal animal : animals) {
            System.out.println(animal.name);
        }

    }

}
