public class Employees {
    private String name;
    private String ID;
    private double salary;

    public Employees(String name, String ID, double salary) {
        this.name = name;
        this.ID = ID;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getID() {
        return ID;
    }

    public double getSalary() {
        return salary;
    }

    public void display() {
        System.out.println("Name : " + name);
        System.out.println("ID : " + ID);
        System.out.println("Salary : " + salary);
    }
}