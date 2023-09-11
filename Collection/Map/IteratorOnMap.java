import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeMap;
import java.util.Set;


class IteratorOnMapDemo {

    public static void main(String[] args) {
        

        TreeMap tm  = new TreeMap<>();

        tm.put("IND", "India");
        tm.put("AUS", "Australia");
        tm.put("PAK", "Pakistan");
        tm.put("SL", "Shri Lanka");
        tm.put("BAN", "Bangladesh");

        System.out.println(tm);

        Set data = tm.entrySet();

        Iterator itr = data.iterator();

        while(itr.hasNext()) {

            System.out.println(itr.next());
            
        }

        
    }
}