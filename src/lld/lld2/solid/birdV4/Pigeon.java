package lld.lld2.solid.birdV4;

public class Pigeon extends BirdV4 implements Flyable {
    FlyHigh fh = new FlyHigh();
    @Override
    void makeSound() {

    }

    @Override
    public void fly() {
       fh.flyHigh();
    }
}