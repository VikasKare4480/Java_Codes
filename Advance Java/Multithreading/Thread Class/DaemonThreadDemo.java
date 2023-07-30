class MyDaemon extends Thread {

    MyDaemon(String name) {

        super(name);

    }

    public void run() {

        try {

            Thread.sleep(10000);

        } catch (InterruptedException obj) {

            System.out.println();
        }

        if (isDaemon()) {

            System.out.println("Daemon Thread " + getName());
        } else {
            System.out.println("Non Daemon Thread " + getName());
        }
    }

    public static void main(String[] args) {

        MyDaemon t1 = new MyDaemon("Pakistan");
        MyDaemon t2 = new MyDaemon("Russia");
        MyDaemon t3 = new MyDaemon("India");

        t1.setDaemon(true); // now t1 is Daemon thread

        t1.start();
        t2.start();
        t3.start();
    }
}