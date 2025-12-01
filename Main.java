package library;

public class Main {
    public static void main(String[] args) {

        Person p1 = ObjectFactory.createUser("Іван", "Петренко", "ivan123", "12345");
        Person p2 = ObjectFactory.createAdmin("Олена");

        Content c1 = ObjectFactory.createBook("Кобзар", "Шевченко", 1840, "Поезія", "електронна");
        Content c2 = ObjectFactory.createCategory("Класика");
        Content c3 = ObjectFactory.createDownload((User) p1, (Book) c1, "2025-10-03");

        p1.showInfo();
        p1.action();
        System.out.println("Роль: " + p1.getRole());

        p2.showInfo();
        p2.action();
        System.out.println("Роль: " + p2.getRole());

        c1.showDetails();
        c1.process();

        c2.showDetails();
        c2.process();

        c3.showDetails();
        c3.process();

        processContent(c1);
        processContent(c2);
        processContent(c3);
    }

    public static void processContent(Content content) {
        System.out.println("\nПоліморфічна обробка: " + content.getType());
        content.showDetails();
        content.process();
    }
}
