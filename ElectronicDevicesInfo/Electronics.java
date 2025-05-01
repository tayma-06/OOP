public class Electronics {
    String manufacturer;
    double cost;
    int datePurchased;
    String serialNumber;

    public Electronics(String manufacturer, double cost, int datePurchased, String serialNumber) {
        this.manufacturer = manufacturer;
        this.cost = cost;
        this.datePurchased = datePurchased;
        this.serialNumber = serialNumber;
    }

    public double calculateDepreciation(int currentDate) {
        int age = currentDate - datePurchased;
        double depreciation = cost;
        for (int i = 0; i < age; i++) {
            depreciation *= 0.8;
        }
        return depreciation;
    }

    public void printDetails() {
        System.out.println("Manufacturer : " + manufacturer);
        System.out.println("Cost : $" + cost);
        System.out.println("Year Purchased : " + datePurchased);
        System.out.println("Serial Number : " + serialNumber);
    }
}