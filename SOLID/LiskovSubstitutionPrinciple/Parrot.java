package SOLID.LiskovSubstitutionPrinciple;

public class Parrot implements FlyingBird {

    @Override
    public void eat() {
        System.out.println("Parrot is eating.");
    }

    @Override
    public void fly() {
        System.out.println("Parrot is flying.");
    }
}
