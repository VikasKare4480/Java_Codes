import java.util.IdentityHashMap;


class IdentityHashMapDemo {

    public static void main(String[] args) {
        

        // allows to have the same keys in to he map

        IdentityHashMap ihm = new IdentityHashMap<>();

        ihm.put(new Integer(10), "Vikas");
        ihm.put(new Integer(11), "Laxman");
        ihm.put(new Integer(12), "Kare");
        ihm.put(new Integer(10), "Vikas");


        System.out.println(ihm);

    }
}