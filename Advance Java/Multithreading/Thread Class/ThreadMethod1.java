class Outer extends Thread {


    public void run() {

        System.out.println(Thread.currentThread().getName());

        System.out.println( " Id Of  " + Thread.currentThread().getName() +  " is " + + Thread.currentThread().getId());
        

        // for(int i = 0; i < 10; i++) {

        //     System.out.println("in run");

        //     try {

        //     Thread.sleep(1000);

        //     }catch (InterruptedException obj) {

        //     }
        // }
 

        Thread.currentThread().setName("");
        System.out.println("new Name of " + Thread.currentThread().getName());
    } 
}


class Client {


    public static void main(String[] args)  throws InterruptedException {

        Outer obj = new Outer();
        obj.start();

        // for(int i=0; i< 10; i++) {

        //     System.out.println("In main");

        //     Thread.sleep(1000);
            
        // }

        Thread.currentThread().setName("Vikas");

        System.out.println("New Name of Main :  " + Thread.currentThread().getName());


        
    }
}