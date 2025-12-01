package library;

public class User extends Person {
    private String login;
    private String password;
    private String role;

    public User(int id, String firstName, String lastName, String login, String password, String role) {
        super(id, firstName, lastName);
        this.login = login;
        this.password = password;
        this.role = role;
    }

    @Override
    public void showInfo() {
        System.out.println("User: " + getName());
    }

    @Override
    public void action() {
        System.out.println("User діє: читає книги, завантажує файли");
    }

    @Override
    public String getRole() {
        return role;
    }
}
