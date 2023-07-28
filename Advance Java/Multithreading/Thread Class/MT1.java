
class MyThread extends Thread {

    // MyThread() {
    // VM.crete();
    // }

    public void run() {

        System.out.println("run ");

        for (int i = 0; i < 10; i++) {

            System.out.println("In run");

        }
    }
}

class ThreadDemo {

    public static void main(String[] args) {

        // Create a new Thread
        // call to constructor of the MyThread() and from it to
        // to the constructor of the Thread() class having
        // method VM.create() -- >> which having the capablility of th
        MyThread obj = new MyThread(); // -->> Born Phase(1)

        obj.start(); // -->> ReadytoRun in ready Queue (2)

        for (int i = 0; i < 10; i++) {

            System.out.println("In main");

        }
    }
}