import java.util.HashSet;
import java.util.Collections;

class HashSetDemo {

    public static void main(String[] args) {

        HashSet hs = new HashSet();

        hs.add("Kanha");
        hs.add("Rahul");
        hs.add("Shashi");
        hs.add("Badhe");
        hs.add("Ashish");

        System.out.println(hs);
        // Collections.sort(hs);
        //
        hs.add("Shashi"); // duplicate not allowed in Set

        hs.add("Kanha"); // duplicate data

        hs.add("Vikas"); // non duplicate data

        System.out.println(hs);
    }
}