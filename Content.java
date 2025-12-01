package library;

public abstract class Content {
    protected int id;

    public Content(int id) {
        this.id = id;
    }

    public abstract void showDetails();
    public abstract void process();
    public abstract String getType();
}
