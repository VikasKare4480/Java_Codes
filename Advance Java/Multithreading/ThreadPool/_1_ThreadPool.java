import java.util.concurrent.*;

class MyThread implements Runnable {

    int num;

    MyThread(int num) {

        this.num = num;

    }

    public void run() {

        for (int i = 0; i < 3; i++) {

            System.out.println(Thread.currentThread() + " start Thread " + num);
            dailyTask();
            System.out.println(Thread.currentThread() + " end Thread " + num);

        }

    }

    void dailyTask() {

        try {

            Thread.sleep(3000); // 3 seconds
        } catch (InterruptedException obj) {

        }
    }
}

class ThreadPoolDemo {

    public static void main(String[] args) {

        ExecutorService ser1 = Executors.newCachedThreadPool();
        // creat as per reqirement

        // ExecutorService ser2 = Executors.newFixedThreadPool(10);
        // create as per given int num

        // ExecutorService ser3 = Executors.newSingleThreadExecutor();
        // creates only single thread at a time

        // main thread executing the for loop and other threads are taking them and then
        // executing the run method

        for (int i = 1; i < 2; i++) {

            MyThread obj = new MyThread(i);
            ser1.execute(obj);

        }
    }
}