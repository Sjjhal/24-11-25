package library;

public class Admin extends Person {

    public Admin(int id, String name) {
        super(id, name, "");
    }

    @Override
    public void showInfo() {
        System.out.println("Admin: " + firstName);
    }

    @Override
    public void action() {
        System.out.println("Admin діє: керує каталогом");
    }

    @Override
    public String getRole() {
        return "Адміністратор";
    }
}
