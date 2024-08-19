package lld.lld2.solid.birdV5;

public class Pigeon extends BirdV5 implements Flyable {
    FlyingBehaviour fh;

    public Pigeon(FlyingBehaviour fh) {
        this.fh = fh;
    }

    @Override
    void makeSound() {

    }

    @Override
    public void fly() {
       fh.makeFly();
    }
}
