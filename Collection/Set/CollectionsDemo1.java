
import java.util.ArrayList;
import java.util.Collections;

class CollectionsDemo {

    public static void main(String[] args) {

        ArrayList al = new ArrayList<>();
        al.add(19);
        al.add(44);
        al.add(56);
        al.add(16);
        al.add(33);

        System.out.println("List before sort " + al);

        Collections.sort(al);

        System.out.println("List after Sort" + al);

    }

}