package library;

public abstract class Person {
    protected int id;
    protected String firstName;
    protected String lastName;

    public Person(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public abstract void showInfo();
    public abstract void action();
    public abstract String getRole();

    public String getName() {
        return firstName + " " + lastName;
    }
}
