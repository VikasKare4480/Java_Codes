
import java.util.Scanner;

class MyClass {

    public int fibinacciSeries(int n) {

        if (n == 0) {

            return 0;

        }

        int fnum = 0, snum = 1;

        int tnum = 0;
        for (int i = 2; i <= n; i++) {

            tnum = fnum + snum;
            fnum = snum;
            snum = tnum;
        }

        return tnum;
    }
}

class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        MyClass obj = new MyClass();

        System.out.println("Enter nth number to find fibonacci Number : ");
        int num = sc.nextInt();

        Object nthnum = obj.fibinacciSeries(num);

        System.out.println(nthnum);

    }
}
