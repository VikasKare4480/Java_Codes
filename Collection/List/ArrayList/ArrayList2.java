
import java.util.ArrayList;

class ArrayList2 {

    void alist() {

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);

        System.out.println(" list is : " + list);

    }

}

class Client {

    public static void main(String[] args) {

        ArrayList2 obj = new ArrayList2();
        obj.alist();

    }
}