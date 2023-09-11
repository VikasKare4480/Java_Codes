import java.util.HashMap;
import java.util.HashSet;

class HashMapDemo1 {

    public static void main(String[] args) {



        HashSet hs = new HashSet();

        hs.add("Kanha");
        hs.add("Rahul");
        hs.add("Ashish");
        hs.add("Badhe");

        System.out.println(hs);


        HashMap hm = new HashMap();

        hm.put("Kanha", "Infosys");
        hm.put("Ashish", "Barclays");
        hm.put("Badhe", "BMC");
        hm.put("Rahul","CarPro");

        // hm.putAll(hs); Error 
        // HashSet can not be converted into the Map
        

        // adding reapeated keys into the HashMap
        // old values are get replaced with the new One Values

        hm.put("Kanha", "TCS");
        hm.put("Rahul", "Google");


        System.out.println(hm);
    }
}