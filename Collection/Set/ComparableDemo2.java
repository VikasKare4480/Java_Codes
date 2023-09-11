import java.util.TreeSet;

class Movies implements Comparable {

    String mName = null;
    int totColl = 0;

    Movies(String mName, int totColl) {

        this.totColl = totColl;
        this.mName = mName;
    }

    public int compareTo(Object obj) {

        // return mName.compareTo((obj.toString()));

        return -(mName.compareTo(obj.toString()));
    }

    public String toString() {

        return mName + ":" + totColl;
    }
}

class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet ts = new TreeSet();

        ts.add(new Movies("Pushpa", 150));
        ts.add(new Movies("Gajani", 170));
        ts.add(new Movies("Sairat", 120));
        ts.add(new Movies("OMG2", 200));
        ts.add(new Movies("Kedarnath", 250));

        System.out.println(ts);

    }
}