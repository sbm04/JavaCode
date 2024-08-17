package lld.lld2.solid.birdV4;

public class Penguin extends BirdV4 implements Flyable {
    FlyLow fl = new FlyLow();
    @Override
    void makeSound() {

    }

    @Override
    public void fly() {
        fl.flyLow();
    }
}
