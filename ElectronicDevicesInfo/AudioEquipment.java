public class AudioEquipment extends Electronics {
    String type;

    public AudioEquipment(String manufacturer, double cost, int datePurchased, String serialNumber, String type) {
        super(manufacturer, cost, datePurchased, serialNumber);
        this.type = type;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Audio Type : " + type);
    }
}