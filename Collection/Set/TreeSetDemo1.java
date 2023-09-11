import java.util.TreeSet;

class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet ts = new TreeSet(); // Everything is get Sorted

        // all are of String and string is the type of Comparable -- >> No problem

        ts.add("Vikas");
        ts.add("Ram");
        ts.add("Laxman");
        ts.add("Janaki");
        ts.add("Ravan");
        ts.add("Aangad");

        System.out.println(ts);
        ts.add(10); // classCastException

        // class java.lang.String cannot be cast to class java.lang.Integer

        System.out.println(ts);

    }
}