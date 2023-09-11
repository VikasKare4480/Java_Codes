import java.util.*;

class Demo {

    String str = null;

    Demo(String str) {

        this.str = str; 
    }

    public void finalize() {

        System.out.println("Notify");
    }

    public String toString() {

        return str;
    }
}


class GCDemo {

    public static void main(String[] args) {

        Demo obj1 = new Demo("Vikas");
        Demo obj2 = new Demo("Sanket");
        Demo obj3 = new Demo("Damini");

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        obj1 = null;
        obj2 =null;

        
        System.gc();


    }
}