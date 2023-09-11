import java.util.LinkedList;

class LinkedListDemo {


    public static void main(String[] args) {
        

        LinkedList ll = new LinkedList();
        ll.add("Ravi");  
        ll.add("Vijay");  
        ll.add("Ajay");  
        ll.add("Anuj");  
        ll.add("Gaurav");  
        ll.add("Harsh");  
        ll.add("Virat");  
        ll.add("Gaurav");  
        ll.add("Harsh");  
        ll.add("Amit");  

        System.out.println(ll);

        ll.remove("Vijay");
        ll.remove(0);

        System.out.println(ll);

        LinkedList ll1 = new LinkedList<>();
        ll1.add("Ravi");
        ll1.add("Hanumant");
        
        ll.addAll(ll1);

        System.out.println( "Addign collection : " + ll);


        ll.removeAll(ll1);

        System.out.println("removing Collection" + ll);

        ll.removeFirst();

        System.out.println("After Removing First :" + ll);

        ll.removeLast();

        System.out.println("After removing Last : " + ll);

        ll.removeFirstOccurrence("Gaurav");

        System.out.println("Remove First Occurrence of the Gaurav : " + ll);

        ll.removeLastOccurrence("Harsh");

        System.out.println("Removing the last Occurrence of the Harsh : " + ll);

        ll.clear();

        System.out.println("Clearing the all the elements of the list :" + ll);


    }
}