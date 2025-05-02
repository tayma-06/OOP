public class Guitar extends Instrument implements Playable, Recordable {
    public Guitar() {
        super("Guitar");
    }

    @Override
    public void tune() {
        System.out.println("Tuning Guitar...");
    }

    @Override
    public void play() {
        System.out.println("Playing Guitat strum...");
    }

    @Override
    public void record() {
        System.out.println("Recording Guitar session...");
    }
}
