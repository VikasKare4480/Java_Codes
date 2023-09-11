import java.util.*;

class CrickPlayer  {

    String pName = null;
    int jerNo = 0;

    CrickPlayer(String pName, int jerNo) {

        this.pName = pName;
        this.jerNo = jerNo;

    }

    public String toString() {

        return pName + " : " + jerNo;
    }
}

class LinkedHashSetDemo {

    public static void main(String[] args) {

        LinkedHashSet lsh = new LinkedHashSet();

        // HashSet lsh = new HashSet<>();

        lsh.add(new CrickPlayer("Rohit", 45));
        lsh.add(new CrickPlayer("Mahi", 7));
        lsh.add(new CrickPlayer("Virat", 18));
        lsh.add(new CrickPlayer("Vikas", 25));
        lsh.add(new CrickPlayer("Vikas", 25));

        System.out.println(lsh);

    }
}