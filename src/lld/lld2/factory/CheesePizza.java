package lld.lld2.factory;
class CheesePizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking Cheese Pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing Cheese Pizza");
    }
}