class MyThread implements Runnable {

    public void run() {

        // System.out.println("In Run");
        System.out.println(Thread.currentThread());

        try {

            Thread.sleep(0);

        } catch (InterruptedException ie) {

            System.out.println(ie);

        }
    }
}

class ThreadGroupDemo {

    public static void main(String[] args) {

        ThreadGroup TG1 = new ThreadGroup("Defence");
        MyThread obj1 = new MyThread();
        MyThread obj2 = new MyThread();
        MyThread obj3 = new MyThread();

        Thread t1 = new Thread(TG1, obj1, "Army");
        Thread t2 = new Thread(TG1, obj2, "Navy");
        Thread t3 = new Thread(TG1, obj3, "AirForce");

        t1.start();
        t2.start();
        t3.start();
    }
}
