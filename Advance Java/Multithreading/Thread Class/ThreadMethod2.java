class Config extends Thread {


    static Thread nmName = null;

    public void run() {

        for(int i = 0; i < 10; i++) {

            System.out.println("In run");

        }

    }
}

class Demo {

    public static void main(String[] args) throws InterruptedException {
        
        Config obj = new Config();
        obj.start();

        // obj.join();

        for(int i = 0; i < 10; i++) {

            System.out.println("In main");
        }
    }
}