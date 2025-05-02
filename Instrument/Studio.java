public class Studio {
    public static void processInstrument(Instrument i) {
        i.tune();
        if (i instanceof Playable) {
            ((Playable) i).play();
        }
        if (i instanceof Recordable) {
            ((Recordable) i).record();
        }
    }
}
