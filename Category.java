package library;

public class Category extends Content {
    private String name;

    public Category(int id, String name) {
        super(id);
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("Category: " + name);
    }

    @Override
    public void process() {
        System.out.println("Відкриття категорії: " + name);
    }

    @Override
    public String getType() {
        return "Category";
    }
}
