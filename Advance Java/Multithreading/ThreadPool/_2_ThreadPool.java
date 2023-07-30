import java.util.concurrent.*;

class MyThread implements Runnable {

    int num;

    MyThread(int num) {

        this.num = num;

    }

    public void run() {

        System.out.println("Start of " + Thread.currentThread() + "   " + num);

        show();

        System.out.println("End of " + Thread.currentThread() + "  " + num);
    }

    void show() {

        for (int i = 0; i < 10; i++) {

            try {

                Thread.sleep(1000);
            } catch (InterruptedException obj) {

                System.out.println(obj);
            }
        }
        num++;
        // System.out.println();
    }

}

class ThreadPoolDemo {

    public static void main(String[] args) {

        // Explicit type casting

        // ThreadPoolExecutor TPE1 = (ThreadPoolExecutor)
        // Executors.newCachedThreadPool();

        ExecutorService ser1 = Executors.newFixedThreadPool(10);

        for (int i = 1; i <= 10; i++) {

            MyThread obj = new MyThread(i);
            ser1.execute(obj);

        }
        ser1.shutdown();
    }
}