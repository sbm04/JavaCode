package lld.lld2.solid.birdV5;

public class Egle extends BirdV5 implements Flyable {
    FlyingBehaviour fh;

    public Egle(FlyingBehaviour fh) {
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
