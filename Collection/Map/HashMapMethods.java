import java.util.HashMap;
import java.util.Set;
import java.util.LinkedList;


public class HashMapMethods {


    public static void main(String[] args) {
        

        HashMap hm = new HashMap();

        // put(K,V);

        hm.put("Java", ".java");
        hm.put("Python", ".py");
        hm.put("Dart", ".dart");

        System.out.println(hm);

        // V get(K);
        
        System.out.println(hm.get("Dart")); // .dart

        // keySet()  -- return a Set of the all keys

        Set setOfkeys = hm.keySet();
        System.out.println("S is : " + setOfkeys);
        // System.out.println(hm.keySet());


        //  values  -- >> returns the Collection of the Values

        // LinkedList ll = new LinkedList<>(setOfkeys);
        // System.out.println("values() a  " + ll);
        System.out.println();
        System.out.println("Values"  + hm.values());

        // entrySet() -->> returns the set of <K,V)

        System.out.print("entrySet() : ");
        

        System.out.print(hm.entrySet()); 
        // entrySet() : [Java=.java, Python=.py, Dart=.dart]
        
        
    }
}