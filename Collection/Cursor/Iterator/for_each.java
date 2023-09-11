import java.util.ArrayList;
import java.util.LinkedList;

class ForEachDemo {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        al.add("Vikas");
        al.add(21);
        al.add(8.76f);
        al.add(165.5);

        // print this using the for each loop

        // var -->> inroduced in the java 10 and then to java 11
        // can store any type of the data

        for (int i = 0; i < al.size(); i++) {

            System.out.print(al.get(i) + " ");

        }

        System.out.println();

        for (var x : al) {

            System.out.print(x + " ");
        }

        System.out.println();

        LinkedList ll = new LinkedList();
        ll.addAll(al);

        System.out.println("all elements of alist added to the llist");

        for (int i = 0; i < ll.size(); i++) {

            System.out.print(ll.get(i) + " ");
        }

        System.out.println();
        for (var x : ll) {

            System.out.print(x + " ");

        }

    }
}