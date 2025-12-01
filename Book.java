package library;

public class Book extends Content {
    private String title;
    private String author;
    private int year;
    private String genre;
    private String type;

    public Book(int id, String title, String author, int year, String genre, String type) {
        super(id);
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.type = type;
    }

    @Override
    public void showDetails() {
        System.out.println("Book: " + title + " (" + author + ")");
    }

    @Override
    public void process() {
        System.out.println("Читання книги: " + title);
    }

    @Override
    public String getType() {
        return "Book";
    }
}
