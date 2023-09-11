    import java.util.HashMap;

    class HashMapDemo2 {

        public static void main(String[] args) {
            
            HashMap hm = new HashMap<>();
            hm.put(10, "Ten");
            hm.put(11, "Eleven");
            hm.put(12, "Twelve");
            hm.put(15, "Fifteen");

            System.out.println(hm);

            System.out.println();

            hm.put(100, "Ten");
            hm.put(110, "Eleven");
            hm.put(120, "Twelve");
            hm.put(150, "Fifteen");
            

            
            System.out.println(hm);
        }
    }