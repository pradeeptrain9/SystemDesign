package SOLID.InterfaceSegrationPriciple;

public class Multiplayer implements Video, Audio {

    @Override
    public void playVideo() {
        System.out.println("Playing video in multiplayer mode...");
    }

    @Override
    public void playAudio() {
        System.out.println("Playing audio in multiplayer mode...");
    }

    // Additional methods specific to Multiplayer can be added here
}
