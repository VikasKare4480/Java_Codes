import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


class Book {

    int id  = 0, quantity = 0; 
    String name = null, auther = null, publisher = null;

    Book(int id, String name, String auther, String publisher, int quantity) {

        this.id  = id;
        this.name = name;
        this.auther = auther;
        this.publisher = publisher;
        this.quantity = quantity;
    }


}

class ArrayListDemo {

    public static void main(String[] args) {

        List<Book> list = new ArrayList<Book>();

        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 10 );
        Book b2 = new Book(101, "Data Cummunication and Networking", "Furouzan",  "MC Graw Hill", 20 );
        Book b3 = new Book(101, "Operating System", "Galvin", "Wiley", 30);

        list.add(b1);
        list.add(b2);
        list.add(b3);

        // Printing elemetns of the List 

        for(Book b : list) {

            System.out.print(b.id + " " + b.name +  " " + b.auther +  " " + b.publisher + " " + b.quantity);
        }

        Iterator itr = list.iterator();

        itr.forEachRemaining( a-> {

            System.out.println(a);
        });

    }
}