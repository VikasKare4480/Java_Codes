class MyThread extends Thread {

    public MyThread(String str) {

        super(str);
    }

    public MyThread(ThreadGroup tg, String str) {

        super(tg, str);
    }

    public void run() {

        System.out.println(currentThread());

        try {

            Thread.sleep(2000);

        } catch (InterruptedException obj) {

        }
    }
}

class ThreadGroupDemo {

    public static void main(String[] args) {

        ThreadGroup TG1 = new ThreadGroup("INDIA");

        MyThread t1 = new MyThread(TG1, "MAHARASHTRA");
        MyThread t2 = new MyThread(TG1, "GOA");

        t1.start();
        t2.start();

        ThreadGroup TG2 = new ThreadGroup(TG1, "PAKISTAN");

        MyThread t3 = new MyThread(TG2, "LAHORE");
        MyThread t4 = new MyThread(TG2, "KARACHI");

        t3.start();
        t4.start();

        ThreadGroup TG3 = new ThreadGroup(TG1, "BAGLADESH");

        MyThread t5 = new MyThread(TG3, "LAHORE");
        MyThread t6 = new MyThread(TG3, "KARACHI");

        t5.start();
        t6.start();

        TG1.interrupt();

        System.out.println(TG1.activeCount());
        System.out.println(TG1.activeGroupCount());

    }
}