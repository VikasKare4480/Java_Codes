import java.util.ArrayList;
import java.util.Iterator;

class Demo {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add("Ashish");
        al.add("Kanha");
        al.add("Rahul");
        al.add("Badhe");

        Iterator itr = al.iterator();

        while (itr.hasNext()) {

            if ("Rahul".equals(itr.next())) {

                itr.remove();
            }
            System.out.print(itr.next() + " ");
        }

        System.out.println();
        System.out.println(al);

        System.out.println("Class of the iterator is : " + itr.getClass().getName());

    }
}