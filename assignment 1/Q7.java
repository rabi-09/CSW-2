import java.time.LocalDate;

abstract class LibraryResources{
    private String title, author;

    public LibraryResources(String title, String author) {
        this.title = title;
        this.author = author;
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

    abstract void displayDetails();
}
class Book extends LibraryResources{
    private int pageCount;

    public Book(String title, String author, int pageCount) {
        super(title, author);
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    void displayDetails(){
        System.out.println("Book Details:");
        System.out.println("Title: "+getTitle()+" Author: "+getAuthor()+" Page Count: "+getPageCount());
    }
}
class Magazine extends LibraryResources{
    private LocalDate issueDate;

    public Magazine(String title, String author, LocalDate issueDate) {
        super(title, author);
        this.issueDate = issueDate;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }
    void displayDetails(){
        System.out.println("Book Details:");
        System.out.println("Title: "+getTitle()+" Author: "+getAuthor()+" Issue Date: "+getIssueDate());
    }
}
class DVD extends LibraryResources{
    private Double duration;

    public DVD(String title, String author, Double duration) {
        super(title, author);
        this.duration = duration;
    }

    public Double getDuration() {
        return duration;
    }

    public void setDuration(Double duration) {
        this.duration = duration;
    }
    void displayDetails(){
        System.out.println("Book Details:");
        System.out.println("Title: "+getTitle()+" Author: "+getAuthor()+" Duration: "+getDuration());
    }
}
public class Q7 {
    public static void main(String[] args) {
        Book b = new Book("CSW","Rabi",352);
        Magazine m = new Magazine("Stock Market 2025","India Today", LocalDate.of(2025,02,13));
        DVD d = new DVD("Salaar","Prabhas",2.5);
        b.displayDetails();
        m.displayDetails();
        d.displayDetails();
    }
}
