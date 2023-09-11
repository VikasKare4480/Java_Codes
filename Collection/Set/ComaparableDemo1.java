import java.util.TreeSet;

class MyClass implements Comparable {

    String str = null;

    MyClass(String str) {

        this.str = str;

    }

    public int compareTo(Object obj) {

        return -(obj.toString()).compareTo(this.str);

    }

    public String toString() {

        return str;
    }
}

class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet ts = new TreeSet();

        ts.add(new MyClass("Vikas"));

        ts.add(new MyClass("Laxman"));

        ts.add(new MyClass("Kare"));

        System.out.println(ts);

    }
}