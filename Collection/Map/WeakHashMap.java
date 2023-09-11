import java.util.WeakHashMap;


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


class WeakHashMapDemo {

    public static void main(String[] args) {

        WeakHashMap whm = new WeakHashMap<>();
        
        Demo obj1 = new Demo("Vikas");
        Demo obj2 = new Demo("Sanket");
        Demo obj3 = new Demo("Damini");

        whm.put(obj1, 2016);
        whm.put(obj2, 2019);
        whm.put(obj3, 2022);

        obj1 = null;
        System.gc();
        System.out.println(whm);

    }
    
}
