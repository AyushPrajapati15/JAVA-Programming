class Book {
    private String title;
    private String author;
    private int publicationYear;
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
    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear) {        this.publicationYear = publicationYear;
    }
    public void displayInformation() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
    }
}
public class O2_BooksDetails_cls_obj {
    public static void main(String[] args) {
        Book book = new Book();
        book.setTitle("To Kill a Mockingbird");
        book.setAuthor("Harper Lee");
        book.setPublicationYear(1960);
        book.displayInformation();
    }
}
