import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;


class ArrayListDemo {

    public static void main(String[] args) {


        String arr[] = {"Vikas","Laxman", "Kare","mandakini", "Damini", "Sanket"};

        List<String> al = new ArrayList<>();

        
        for(String str : arr) {

            al.add(str);
        }

        System.out.println(al);

        List<String> ll = new LinkedList();

        for(String str : arr ) {

            ll.add(str);
        }

        System.out.println(ll);
        

    }
}