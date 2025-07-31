package SOLID.singularity.InterfaceSegrationPriciple;

public class AudioPlayer implements Audio {

    @Override
    public void playAudio() {
        System.out.println("Playing audio...");
    }

    // Additional methods specific to AudioPlayer can be added here
}
