
package arithfun;

public class Addition {

    private static int a = 10;

    int num1 = 0, num2 = 0;

    // after calling we get initialization of the objects

    // public bacause to access from the another folder
    public Addition(int num1, int num2) {

        this.num1 = num1;
        this.num2 = num2;
    }

    protected int addition() {

        return num1 + num2;
    }
}
