import java.util.TreeMap;

class TreeMapDemo {

    public static void main(String[] args) {
        
        TreeMap tm = new TreeMap<>(); // already in sorting order

        tm.put("IND", "India");
        tm.put("AUS", "Australia");
        tm.put("PAK", "Pakistan");
        tm.put("SL", "Shri Lanka");
        tm.put("BAN", "Bangladesh");

        System.out.println(tm);
    }
}