import java.util.ArrayList;

import java.util.Collections;

class arraylist1 {

    public static void main(String[] args) {

        // declaration of ArrayList

        ArrayList<Integer> arrlist = new ArrayList<>();

        System.out.println(arrlist);

        // add() method

        arrlist.add(10);
        arrlist.add(20);
        arrlist.add(30);

        System.out.println("After adding elements  : " + arrlist);

        // get() method

        System.out.println("element at index 0 " + arrlist.get(0));
        System.out.println("element at index 1 " + arrlist.get(1));

        // remove() elemets

        arrlist.remove(0);

        System.out.println("arrlist after removing the elemetn at hte index 0 " + arrlist);

        // set() element at the index

        arrlist.set(0, 100);
        arrlist.set(1, 200);

        System.out.println("arrlist after set method : " + arrlist);

        // size() method

        System.out.println("size of the arrlist " + arrlist.size());

        // sorting of the arraylist using the Collection framework

        Collections.sort(arrlist);

        System.out.println("After sorting of the Arraylist : " + arrlist);

    }
}