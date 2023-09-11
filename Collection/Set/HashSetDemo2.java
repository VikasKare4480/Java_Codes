import java.util.HashSet;

class HashSetDemo {

    public static void main(String[] args) {

        HashSet hs = new HashSet<>();

        hs.add(10); // added
        hs.add(new Integer(10)); // not added and deprocated method

        hs.add(20); // add
        hs.add(new Integer(20)); // same like above

        System.out.println(hs);
    }
}