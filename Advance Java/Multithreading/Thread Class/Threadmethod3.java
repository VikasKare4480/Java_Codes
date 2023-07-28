class MyThread extends Thread {


    static Thread nmThread = null;

    public void run() {

        try {

            nmThread.join();

        }catch(InterruptedException obj) {
        
        }
    }
}


class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        

        MyThread.nmThread = Thread.currentThread();

        MyThread obj = new MyThread();
        obj.start();

        obj.join();

        for(int i = 0; i < 10; i++) {

            System.out.println("In main");
        }


    }
}