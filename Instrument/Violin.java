public class Violin extends Instrument implements Playable, Recordable {
    public Violin() {
        super("Violin");
    }

    @Override
    public void tune() {
        System.out.println("Tuning Violin...");
    }

    @Override
    public void play() {
        System.out.println("Playing Violin melody...");
    }

    @Override
    public void record() {
        System.out.println("Recording Violin performance...");
    }
}
