public class Company {
    public static void main(String[] args) {
        Developer dev1 = new Developer("Alice", "101", 80000, "Java");
        Developer dev2 = new Developer("Bob", "102", 75000, "Python");
        Manager mgr = new Manager("Clara", "201", 95000);
        mgr.addTeamMember(dev1);
        mgr.addTeamMember(dev2);
        dev1.display();
        dev2.display();
        mgr.display();
    }
}