package lld.lld2.solid.birdV5;

public class Penguin extends BirdV5 implements Flyable {
    FlyingBehaviour fl;

    public Penguin(FlyingBehaviour fl) {
        this.fl = fl;
    }

    @Override
    void makeSound() {

    }

    @Override
    public void fly() {
        fl.makeFly();
    }
}
