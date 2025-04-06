class Book implements Comparable<Book>{
    int bookID, price;
    String bookName;
    Book(int bookID, String bookName, int price){
        this.bookID=bookID;
        this.bookName=bookName;
        this.price=price;
    }
    @Override
    public String toString(){
            return "Book ID: "+bookID+" Name: "+bookName+" Price: "+price;
    }
    @Override
    public int compareTo(Book book){
        return Integer.compare(price, book.price);
    }
    @Override
    public boolean equals(Object b){
        if(this == b) return true;
        if((b==null) || (this.getClass()!=b.getClass())) return false;
        Book book = (Book) b;
        return this.bookID == book.bookID;
    }
}
public class Q2 {
    public static void main(String[] args) {
        Book b1 = new Book(1, "CSW", 499);
        Book b2 = new Book(2, "AAd", 560);
        Book b3 = new Book(1, "CSW", 499);
        if(b1.compareTo(b2)==1){
            System.out.println(b1.bookName+" has More price");
        }
        else{
            System.out.println(b2.bookName+" has More price");
        }
        System.out.println("Is Book 1 and 2 same: "+ b1.equals(b3));
        
        // if(compare(b1,b2)==1){
        //     System.out.println(b1.bookName+" has More price");
        // }
        // else{
        //     System.out.println(b2.bookName+" has More price");
        // }
    }
    // public static int compare(Book b1, Book b2){
    //     return Integer.compare(b1.price, b2.price);
    // }
}
