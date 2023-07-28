class MyThread extends Thread {

    public void run() {

        // System.out.println("In run");
        // System.out.println("run priority before " +
        // MyThread.currentThread().getPriority());

        System.out.println("run Name Before " + MyThread.currentThread().getName());

        // MyThread.currentThread().setPriority(8);

        Thread obj = Thread.currentThread();

        obj.setName("Shahu");

        System.out.println("getState()  " + obj.getState());

        long id = obj.getId();
        System.out.println("getId () " + id);

        System.out.println("run Name After " + MyThread.currentThread().getName());

        // System.out.println("run priority after " +
        // MyThread.currentThread().getPriority());

    }

}

class ThreadDemo {

    public static void main(String[] args) {

        MyThread obj = new MyThread();
        obj.start();

        // System.out.println("Main Priority before : " +
        // MyThread.currentThread().getPriority());

        // Thread.currentThread().setPriority(10);

        // System.out.println("Main Priority after : " +
        // MyThread.currentThread().getPriority());

    }
}
