// 3 ways to import pckage in java 

// import arithfun;
import arithfun.Addition;
// import arithfun.Substraction;

import java.util.Scanner;

class Client extends Addition {

    int num1 = 0, num2 = 0;

    public Client(int num1, int num2) {

        super(num1, num2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter two numbers");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Addition add = new Addition(num1, num2);

        System.out.println(add.addition());

        // Substraction sub = new Substraction(num1, num2);

        // System.out.println(sub.substraction());

    }
}