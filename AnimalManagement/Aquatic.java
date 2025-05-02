public class Aquatic extends Animal {
    private int finLength;
    private String boneType;
    private String waterType;
    private String foodType;

    public Aquatic(String name, String species, int age, int finLength, String boneType, String waterType,
            String foodType) {
        super(name, species, age);
        this.finLength = finLength;
        this.boneType = boneType;
        this.waterType = waterType;
        this.foodType = foodType;
    }

    public void swim() {
        System.out.println(getName() + " is Swimming.");
    }

    public int getFinLength() {
        return finLength;
    }

    public String boneType() {
        return boneType;
    }

    public String getWaterType() {
        return waterType;
    }

    public String getFoodType() {
        return foodType;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Fin Length : " + finLength);
        System.out.println("Bone Type : " + boneType);
    }
}
