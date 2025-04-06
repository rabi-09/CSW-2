import java.util.HashMap;
import java.util.Scanner;

class Book{
    private int id;
    private String name, author;
    private int quantity;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
public class Q5 {
    public static void main(String[] args) {
        HashMap<Integer, Book> bookList = new HashMap<>();
        bookList.put(1,new Book(1,"CSW","Rabi",10));
        bookList.put(2,new Book(2,"AAD","Pratik",20));
        System.out.println(bookList);
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter Book ID to check if exists or not");
        int id = sc.nextInt();
        if(bookList.containsKey(id))
            System.out.println("Book exists");
        else
            System.out.println("Book doesn't exists");

        System.out.println("Enter Book ID to delete from list");
        int delId = sc.nextInt();
        if(bookList.containsKey(delId)){
            bookList.remove(delId);
            System.out.println("Book deleted successfully");
        }
        else
            System.out.println("Book doesn't exists");

    }
}
