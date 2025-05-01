public class Main {
    public static void main(String[] args) {
        AudioEquipment audio = new AudioEquipment("Sony", 200.0, 2020, "A123", "CD");
        VideoEquipment video = new VideoEquipment("Panasonic", 500.0, 2019, "V456", "VHS");
        System.out.println("Audio Equipment Details:");
        audio.printDetails();
        System.out.println("Depreciated Value (2025): $" + audio.calculateDepreciation(2025));
        System.out.println("\nVideo Equipment Details:");
        video.printDetails();
        System.out.println("Depreciated Value (2025): $" + video.calculateDepreciation(2025));
    }
}
