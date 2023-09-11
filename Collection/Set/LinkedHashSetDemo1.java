import java.util.LinkedHashSet;

class LinkedHashSetDemo {

    public static void main(String[] args) {

        System.out.println("Linked Hash Set Demo ");

        // order of insertion is preserved
        // No Duplicated are allowed

        LinkedHashSet lsh = new LinkedHashSet();

        System.out.println(lsh.getClass().getName()); // java.uitl.LinkedHashSet

        lsh.add("Rahul");
        lsh.add("Mayur");
        lsh.add("Omkar");
        lsh.add("Akshay");
        lsh.add("Vikas");

        // Order of insertion is maintained

        System.out.println(lsh);

    }
}