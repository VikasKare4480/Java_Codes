import java.util.ArrayList;

class Demo {

    public static void main(String[] args) {

        // don't include Generics
        ArrayList al = new ArrayList();

        // ------------------------------------------------------

        // add() method

        System.out.println("Adding Elements ");

        al.add(10);
        al.add(10.10f);
        al.add("vikas");
        al.add(10);
        al.add(10.10f);

        System.out.println(al);

        // ------------------------------------------------------

        // int size();

        System.out.println("Size of AL : " + al.size());

        // ------------------------------------------------------

        // boolean contains(Object element);

        System.out.println("AL contains " + "vikas : " + al.contains("vikas")); // true

        // ------------------------------------------------------

        // int indexOf(Object Element);

        System.out.println("Index of vikas is : " + al.indexOf("vikas"));

        // ------------------------------------------------------

        // int lastIndexOf(Object Element);

        System.out.println("Last Index of 10 is " + al.lastIndexOf(10));

        // ------------------------------------------------------

        // E get(int);
        // discrepti
    }

}