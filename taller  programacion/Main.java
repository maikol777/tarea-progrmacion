import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
ArrayList<Book>listBook = new ArrayList<>();
Book book = new Book("", "", "", false);
book.info(listBook, book);
book.update(listBook, book);
//  book.prestar(book);
  sc.close();
   
 }

 
}
