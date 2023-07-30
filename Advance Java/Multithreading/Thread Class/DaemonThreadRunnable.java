
class MyDaemon implements Runnable {

    static int num = 1;

    public void run() {

        if (Thread.currentThread().isDaemon()) {

            System.out.println(Thread.currentThread().getName() + " is Daemon Theread " + getNum());
        } else {

            System.out.println(Thread.currentThread().getName() + " is Not Daemon Theread " + getNum());
        }

    }

    public static int getNum() {

        ++num;

        return num;

    }

    public static void main(String[] args) {

        MyDaemon obj1 = new MyDaemon();
        MyDaemon obj2 = new MyDaemon();
        MyDaemon obj3 = new MyDaemon();

        Thread t1 = new Thread(obj1, "India");
        Thread t2 = new Thread(obj2, "Pakistan");
        Thread t3 = new Thread(obj1, "Nepal");

        t1.setDaemon(true);

        t1.start();
        t2.start();
        t3.start();

    }
}