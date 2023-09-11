import java.util.LinkedList;

class Book {

    int id;
    String author;
    String publisher;
    int quantity;
    String name;

    Book(int id, String name, String author, String publisher, int quantity) {

        this.id = id;
        this.name = name;
        this.author= author;
        this.quantity= quantity;
        this.publisher = publisher;
    }
}

class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList<Book> ll = new LinkedList<>();
        ll.add(new Book(101,"Let us C","Yashwant Kanetkar","BPB",8));  
        ll.add(new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4));
        ll.add(new Book(103,"Operating System","Galvin","Wiley",6));
        


        System.out.println(ll);

        for(Book b : ll) {

            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }


    }
}