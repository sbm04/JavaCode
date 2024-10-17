package lld.lld2.factory;

class PizzaFactory {
    public Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")) {
            return new CheesePizza();
        } else if (type.equalsIgnoreCase("pepperoni")) {
            return new PepperoniPizza();
        } else if (type.equalsIgnoreCase("veggie")) {
            return new VeggiePizza();
        }
        return null;
    }
}
