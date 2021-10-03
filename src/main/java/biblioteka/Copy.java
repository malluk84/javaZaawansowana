package biblioteka;

public abstract class Copy {
    protected Author author;
    protected String title;

    public Copy(Author author, String title) {
        this.author = author;
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Copy{" +
                "author=" + author +
                ", title='" + title + '\'' +
                '}';
    }
}
