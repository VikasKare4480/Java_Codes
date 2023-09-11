import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Iterator;



class SortedMapDemo {

    public static void main(String[] args) {
        
        SortedMap sm = new TreeMap<>();

        sm.put("AUS", "Australia");
        sm.put("BAN", "Bangladesh");
        sm.put("IND", "India");
        sm.put("PAK", "Pakistan");
        sm.put("SL", "Shri Lanka");

        System.out.println(sm);

        // subMap(fromKey, toKey)

        System.out.println(sm.subMap("AUS", "SL"));

        // headMap(key)

        System.out.println(sm.headMap("IND"));

        // tailMap()

        System.out.println(sm.tailMap("IND"));

        // lastKey()

        System.out.println(sm.lastKey()); //"SL"

        // firstKey()

        System.out.println(sm.firstKey());

        // keySet() returns list of the keys

        System.out.println(sm.keySet());

        // values() returns the list of the values

        System.out.println(sm.values());

        // entrySet()  return the set of key : value pair 

        System.out.println(sm.entrySet());

        Set s = sm.keySet();
        
        Iterator itr = s.iterator();


        while(itr.hasNext()) {

            System.out.println(itr.next());
        }



        


    }
}