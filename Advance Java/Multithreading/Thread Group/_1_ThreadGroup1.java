class MyThread extends Thread {

    MyThread(String name) {

        super(name);
    }

    public void run() {


        System.out.println("In run");

        System.out.println(getName());

        System.out.println(getThreadGroup());

    }
    
}

class ThreadGroupDemo {

    public static void main(String[] args) {

        MyThread obj = new MyThread("XYZ");
        obj.start();
        
        System.out.println(obj.getThreadGroup());

    }
}