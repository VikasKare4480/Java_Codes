import java.util.*;

class MyException extends Exception {

    MyException(String data) {

        super(data);
    }

}

class MyThread extends Thread {

    public void run() {

        Scanner sc = new Scanner(System.in);

        System.out.println("In run");

        System.out.print("Enter priority ");
        int priority = sc.nextInt();

        if (priority >= 1 && priority <= 10) {

            MyThread.currentThread().setPriority(priority);

        } else {

            throw new Exception();

        }

        System.out.println("Run ThreadName : " + Thread.currentThread().getName());
        System.out.println("Run ThreadName priority : " + Thread.currentThread().getPriority());

    }
}

class Client {

    public static void main(String[] args) {

        MyThread obj = new MyThread();

        obj.start();

        System.out.println();

    }
}
