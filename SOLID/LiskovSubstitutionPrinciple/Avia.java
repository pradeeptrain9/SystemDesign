package SOLID.LiskovSubstitutionPrinciple;

public class Avia {

    public void letBirdEat(Bird bird) {
        bird.eat();
    }
    public void letFlyingBirdFly(FlyingBird flyingBird) {
        flyingBird.fly();
    }

    public static void main(String[] args) {
        Bird penguin = new PenguinBird();
        FlyingBird parrot = new Parrot();

        Avia avia = new Avia();

        avia.letBirdEat(penguin); // Output: Penguin is eating.
        avia.letBirdEat(parrot); // Output: Parrot is eating.

        avia.letFlyingBirdFly(parrot); // Output: Parrot is flying.
    }
}
