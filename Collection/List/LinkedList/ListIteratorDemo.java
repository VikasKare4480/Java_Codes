import java.util.ListIterator;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;


class ListIteratorDemo {


    public static void main(String[] args) {
        
        List ll = new LinkedList<>();
        List al = new ArrayList<>(10);

        ll.add("Amit");
        ll.add("Vijay");
        ll.add("Kumar");
        ll.add("Sachin");
        

        ListIterator litr = ll.listIterator();

        while(litr.hasNext()) {

            System.out.println(litr.next());

        }

        while(litr.hasPrevious()) {

            System.out.println(litr.previous());
        }
        
    }
}