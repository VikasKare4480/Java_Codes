import java.util.*;

class ListDemo {


    public static void main(String[] args) {
        
        List<String> list1 = new LinkedList();

        list1.add("Mango");
        list1.add("Banana");
        list1.add("Apple");
        list1.add("PineApple");

        Collections.sort(list1);

        System.out.println("After Sorting list " + list1);

        Iterator itr = list1.iterator();

        System.out.println("'''''''''''''''''''''");

        itr.forEachRemaining(a -> {

            System.out.println(a);
        });

        System.out.println("--------------------------");

        

        String ListToArary[] = list1.toArray(new String[list1.size()]);

        System.out.println(list1);

        String[] arr = new String[list1.size()];

        for(int i = 0; i < arr.length; i++) {

            arr[i] = (String) list1.get(i);

        }

        System.out.println(list1);
    }
}