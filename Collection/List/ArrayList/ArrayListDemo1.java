import java.util.*;

class ArrayListDemo {


    public static void main(String[] args) {
        
        ArrayList<String> al = new ArrayList<>();
        al.add("Mango");
        al.add("Apple");
        al.add("Banana");
        al.add("Grapes");

        Collections.sort(al);

        // System.out.println("sorted Collection : " + al);

        // for(int i =0; i < al.size(); i++) {

        //     System.out.print(al.get(i) + " ");

        // }

        // System.out.println();

        // for(String str : al) {

        //     System.out.print(str + " ");

        // }

        // System.out.println();
        // Iterator itr = al.iterator();

        // while(itr.hasNext()) {

        //     System.out.println(itr.next());
        // }

        // ListIterator litr = al.listIterator();

        // while(litr.hasNext()) {

        //     System.out.println(" " + litr.next());

        // }

        // 

        System.out.println("forEach() method");

        al.forEach(a ->
        {

            System.out.print(a + " ");

        } 
        );

        System.out.println("Using forEachRemaining()");

        Iterator itr = al.iterator();

        itr.forEachRemaining(a -> {

            System.out.println(a);
        }

        
        );


        


    }
}