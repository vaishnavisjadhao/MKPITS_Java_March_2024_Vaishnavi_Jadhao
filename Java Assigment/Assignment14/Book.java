package arraylists.lbm;

public class Book {
    private int ISBN;
    private String title;
    private String author;
    private int yearOfPublished;

    public Book(int ISBN, String title, String author, int yearOfPublished) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.yearOfPublished = yearOfPublished;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublished() {
        return yearOfPublished;
    }

    public void setYearOfPublished(int yearOfPublished) {
        this.yearOfPublished = yearOfPublished;
    }

    @Override
    public String toString() {
        return "Book{" +
                "ISBN=" + ISBN +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublished=" + yearOfPublished +
                '}';
    }
}
