package lld.lld2.factory;

public class PizzaStore {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory = new PizzaFactory();

        Pizza pizza = pizzaFactory.createPizza("cheese");
        if (pizza != null) {
            pizza.prepare();
            pizza.bake();
            pizza.box();
        } else {
            System.out.println("Pizza type not available");
        }


        /*The Factory Pattern is a design pattern that helps in creating objects without specifying the exact class of object. Instead of the code directly creating an object using new, a Factory class does it for you. This makes it easier to manage object creation, especially when you have many different types of objects.

                Key Idea:
                * You ask the Factory for an object (e.g., a pizza),
                and the factory gives you the right type (e.g., cheese pizza, pepperoni pizza) based on your request.

                * The code that needs the object doesn’t need to worry about the details of how it’s made.

                Why Use It:
                * It simplifies the code when creating objects.
                * If new object types are added, you only change the Factory, not the entire code.





*/
    }
}
