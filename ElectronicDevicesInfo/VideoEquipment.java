public class VideoEquipment extends Electronics {
    String category;

    public VideoEquipment(String manufacturer, double cost, int datePurchased, String serialNumber, String category) {
        super(manufacturer, cost, datePurchased, serialNumber);
        this.category = category;
    }

    public void printDetails() {
        super.printDetails();
        System.out.println("Video Category : " + category);
    }
}
