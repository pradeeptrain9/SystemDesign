package SOLID.singularity.LiskovSubstitutionPrinciple;

public class PenguinBird implements Bird {

    @Override
    public void eat() {
        System.out.println("Penguin is eating.");
    }
}
