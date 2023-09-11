import java.util.ArrayList;


class ArrayListDemo {

    public static void main(String[] args) {
        
        ArrayList al = new ArrayList<>();

        System.out.println(al.isEmpty());

        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");

        System.out.println(al.isEmpty());
        System.out.println(al.size() +  " size of al");
        System.out.println();

        ArrayList al2 = new ArrayList<>(10);

        al2.add("Hanumant");
        al2.add("Ravi");
        al2.add("Ajay");

        al.retainAll(al2); // returns common elements in the common elemets in the List

        System.out.println(al);
    }
}