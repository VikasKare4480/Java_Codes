import java.util.Scanner;

class Demo {

    static void pritnReverse(int n) {

        if(n == 1) {

            System.out.println(n);
        }
        System.out.println(n);
        pritnReverse(n - 1);
    
    }


    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter number n : ");
    int n = sc.nextInt();

    pritnReverse(n);
    }
}