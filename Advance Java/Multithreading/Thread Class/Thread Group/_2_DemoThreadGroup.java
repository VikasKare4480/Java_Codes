class MyThread extends Thread {

    MyThread(ThreadGroup tg, String str) {
        super(tg, str);
    }

    public void run() {
        System.out.println(getName());
        System.out.println(getThreadGroup().getName());
    }
}

class ThreadGroupDemo {

    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("Core2Web");

        MyThread obj1 = new MyThread(threadGroup, "AI");
        MyThread obj2 = new MyThread(threadGroup, "ML");

        obj1.start();
        obj2.start();
    }
}
