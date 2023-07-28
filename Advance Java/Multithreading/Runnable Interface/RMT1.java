class MyThread implements Runnable {

    public void run() {

        // System.out.println("in run");

        // System.out.println("runThreadName : " + Thread.currentThread().getName());
        // show();

        // for (int i = 0; i < 10; i++) {

        // System.out.println("Run " + i);

        // try {

        // Thread.sleep(1000);

        // } catch (InterruptedException obj) {

        // }
        // }

    }

    static void show() {

        System.out.println("In Show");
        System.out.println("showThreadName : " + Thread.currentThread().getName());

    }

}

class Client {

    public static void main(String[] args) {

        // System.out.println("In main");

        // System.out.println("MainThreadName : " + Thread.currentThread().getName());

        MyThread obj = new MyThread();
        Thread obj1 = new Thread(obj);
        obj1.start();
        MyThread.show();

        // for (int i = 0; i < 10; i++) {

        // System.out.println("Main " + i);

        // try {

        // Thread.sleep(1000);
        // } catch (InterruptedException obj2) {

        // }

        // }

    }
}
