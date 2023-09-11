import java.util.LinkedHashMap;


class LinkedHashMapDemo {

    public static void main(String[] args) {
        
        // In LinkedHashMap Order of insertion 
        // is maintained in the order

        LinkedHashMap lhm = new LinkedHashMap();
        
        lhm.put("Damini", "Laxman");
        lhm.put("Sanket", "Laxman");
        lhm.put("Vikas", "Laxman");
      

        System.out.println(lhm);
    }
}