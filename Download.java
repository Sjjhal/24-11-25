package library;

public class Download extends Content {
    private User user;
    private Book book;
    private String date;

    public Download(int id, User user, Book book, String date) {
        super(id);
        this.user = user;
        this.book = book;
        this.date = date;
    }

    @Override
    public void showDetails() {
        System.out.println("Download: " + book + " by " + user.getName());
    }

    @Override
    public void process() {
        System.out.println("Завантаження файлу...");
    }

    @Override
    public String getType() {
        return "Download";
    }
}
