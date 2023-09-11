import java.util.ArrayList;
import java.util.concurrent.*;


//   public java.util.concurrent.ArrayBlockingQueue(int);
// public java.util.concurrent.ArrayBlockingQueue(int, boolean);
//  public java.util.concurrent.ArrayBlockingQueue(int, boolean, java.util.Collection<? extends E>);


class ArrayBlockingQueueDemo2 {
    
    public static void main(String[] args) throws InterruptedException {


        BlockingQueue bQueue = new ArrayBlockingQueue(3);

        bQueue.put(10);
        bQueue.put(20);
        bQueue.put(30);
        bQueue.put(40);
        bQueue.put(50);
        bQueue.put(60);

        System.out.println(bQueue);

        // bQueue.offer(40,5,TimeUnit.SECONDS);

        // wait for the 5 seconds
        // cant add 40 bcoz Queue is full

        System.out.println(bQueue);

        bQueue.take(); // delete the 10 

        System.out.println( "Queue " + bQueue); // [20,30]

        //drainTO();

        ArrayList al = new ArrayList<>();
        System.out.println("al " + al);

        bQueue.drainTo(al); 
        // adds all the elements from queue to arraylist

        bQueue.addAll(al);

        bQueue.drainTo(al, 3);

        System.out.println(bQueue);
        System.out.println("Al " + al);

        

    }   
}
