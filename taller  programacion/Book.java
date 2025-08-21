import java.lang.Thread.State;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.BooleanSupplier;
public class Book{
    Scanner sc = new Scanner (System.in);
    private String title,authorName,datePublication;
    private Boolean state;
   

    public Book(String title, String authorName, String datePublication,boolean state) {
        this.title = title;
        this.authorName = authorName;
        this.datePublication = datePublication;
        this.state = state;
    }
   
public void info(ArrayList<Book>listBook,Book book ){
    String validation;
    do {
   
   book = new Book("", "", "", false);

System.out.println("assig the title of the book");
book.setTitle(sc.nextLine());

System.out.println("assig the date of publication of the book");
book.setDatePublication(sc.nextLine());

System.out.println("assig the author of the book");
book.setAuthorName(sc.nextLine());

listBook.add(book);

    System.out.println("do you want to add another book ?");
    validation = sc.nextLine();
} while (validation.equals("yes"));

for (Book i : listBook){
    System.out.println(i.getTitle()+"|"+ i.getDatePublication()+"|"+i.getAuthorName());
  }
}

    public void update(ArrayList<Book>listBook,Book book ){
         System.out.println("do you want to change data of a book ?");
       String change = sc.nextLine();
if (change.equals("yes")) {
            
        
        String validation;
 
        do {
           
        System.out.println("what is the index for change?");
             int index = sc.nextInt();
              sc.nextLine();
             System.out.println("write the title");
            listBook.get(index).setTitle(sc.nextLine());
         System.out.println("write the date of publication");
    listBook.get(index).setDatePublication(sc.nextLine());
   System.out.println("write the date of author");
                listBook.get(index).setAuthorName(sc.nextLine());
   


    System.out.println("do you want to change data of another book ?");
         validation = sc.nextLine();    
        } while (validation.equals("yes"));
        for (Book i : listBook){
    System.out.println(i.getTitle()+"|"+ i.getDatePublication()+"|"+i.getAuthorName());
  }

}else {
         System.out.println("any change");
        }
    }

    //no pude hacer los extras 😓

/*   public Boolean  prestar (Book book){

          Boolean validation;
          System.out.println("do you want to lend a book ?");
    String select = sc.nextLine();
   

        if (select == "yes ") {
            do {
                System.out.println("enter the name of book for lend");

                String name = sc.nextLine();

                if (name.equals(getTitle())) {
              

System.out.println(getTitle());
                    
                }

            } while (select.equals("yes"));

            
        }
            
       
            return getState();
        }
            */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getDatePublication() {
        return datePublication;
    }

    public void setDatePublication(String datePublication) {
        this.datePublication = datePublication;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    
    
}

    

