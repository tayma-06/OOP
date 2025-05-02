public class Main {
    public static void main(String[] args) {
        Guitar g = new Guitar();
        Violin v = new Violin();
        Studio.processInstrument(g);
        Studio.processInstrument(v);
    }
}
