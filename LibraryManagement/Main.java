public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Java Basics", "James Gosling", "123-456-789", "2000", "TechBooks");
        Book book2 = new Book("OOP in Java", "Robert Martin", "987-654-321", "2015", "CodePress");
        Member member1 = new Member(135, "Tayma", "Bangladesh");
        System.out.println();
        System.out.println("Library Inventory : ");
        System.out.println();
        book1.display();
        System.out.println();
        book2.display();
        System.out.println();
        System.out.println("Member Info : ");
        member1.display();
        System.out.println();
        book1.borrowBook();
        System.out.println();
        book1.borrowBook();
        System.out.println();
        book1.display();
        System.out.println();
        book1.returnBook();
        System.out.println();
        book1.display();
        System.out.println();
    }
}
