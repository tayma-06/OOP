public class Developer extends Employees implements Payable {
    private String pl;// programming langiage

    public Developer(String name, String ID, double salary, String pl) {
        super(name, ID, salary);
        this.pl = pl;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.10;
    }

    @Override
    public void display() {
        System.out.println("Developer : ");
        super.display();
        System.out.println("Programming Language : " + pl);
    }
}
