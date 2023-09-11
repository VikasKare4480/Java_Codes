import java.util.ArrayList;
import java.util.Iterator;

class IteratorDemo {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(10);
        al.add(20);
        al.add(30);

        Iterator itr = al.iterator();

        // hasNext() -->> returns ture if the curr < size()

        // next() -->> go to the next position and return that position element

        // remove() -- to remove the element from the Colection

        System.out.println("class of the itr is  " + itr.getClass().getName());

        for (int i = 0; itr.hasNext(); i++) {

            System.out.print(itr.next() + " ");

        }

        System.out.println("--------------------------------------------------------");

        // while (itr.hasNext()) {

        // System.out.print(itr.next() + " ");
        // }

    }

}