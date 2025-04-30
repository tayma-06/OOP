public class Member {
    int id;
    String name;
    String address;

    public Member(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void display() {
        System.out.println("Member ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Address : " + address);
    }
}
