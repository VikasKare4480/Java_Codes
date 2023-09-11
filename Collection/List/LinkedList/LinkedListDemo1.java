
import java.util.LinkedList;

class LinkedListDemo {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.add("Raj");
        ll.add("Vikas");
        ll.add("Laxman");
        ll.add("Kare"); 

        System.out.println(ll);
        
        ll.add(2,"Sanket");
        ll.add(0,"Ramayan");

        LinkedList ll2 = new LinkedList();
        ll2.add("Rahul");
        ll2.add("Amol");
        
        ll.addAll(ll2);

        ll.addAll(0,ll2);
        
        System.out.println(ll);

        ll.addFirst("Ramesh");
        ll.addLast("Mahesh");
        System.out.println(ll);



        

    }
    
}
