import java.util.ArrayList;

public class Manager extends Employees implements Payable {
    private ArrayList<Employees> team;

    public Manager(String name, String ID, double salary) {
        super(name, ID, salary);
        this.team = new ArrayList<>();
    }

    public void addTeamMember(Employees e) {
        team.add(e);
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.20;
    }

    @Override
    public void display() {
        System.out.println("Manager : ");
        super.display();
        System.out.println("Employees in the team with manager");
        for (Employees e : team) {
            System.out.println("Employee : " + e.getName());
        }
    }
}
