import java.util.ArrayList;

class CrickPlayer {
    int jerNo = 0;
    String name = null;

    CrickPlayer(int jerNo, String name) {

        this.jerNo = jerNo;
        this.name = name;
    }

    public String toString() {

        return name + " : " + jerNo;

    }
}

class Demo {

    public static void main(String[] args) {

        ArrayList al = new ArrayList();
        al.add(new CrickPlayer(18, "Virat"));
        al.add(new CrickPlayer(7, "Mahi"));
        al.add(new CrickPlayer(45, "Rohit"));
        al.add(new CrickPlayer(25, "Vikas"));

        System.out.println(al);
    }
}