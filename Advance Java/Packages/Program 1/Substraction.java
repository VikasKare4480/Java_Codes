
package arithfun;

public class Substraction {

    int num1 = 0, num2 = 0;

    // after calling we get initialization of the objects

    // public bacause to access from the another folder
    public Substraction(int num1, int num2) {

        this.num1 = num1;
        this.num2 = num2;
    }

    public int substraction() {

        return num1 - num2;
    }
}
