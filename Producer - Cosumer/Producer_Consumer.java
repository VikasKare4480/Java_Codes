// Poducer Cosumer Problem

// import java.util.concurrent.ArrayBlockingQueue;
import java.util.*;
// import java.util.concurrent.BlockingQueue;
import java.util.concurrent.*;

class Producer implements Runnable {

	BlockingQueue bQueue;

	Producer(BlockingQueue bQueue) {
	
		this.bQueue = bQueue;
	}

	
	public void run() {
		
		for(int i = 1; i <= 10; i++) {


			try {

				bQueue.put(i);
				System.out.println("Produce : " + i);

			}catch(InterruptedException ie) {

			}

			try {

				Thread.sleep(1000);
			
			}catch(InterruptedException ie) {



			}
		}
	}

}


class Consumer implements Runnable {
	
	BlockingQueue bQueue;

	Consumer(BlockingQueue bQueue) {
		
		this.bQueue = bQueue;
	
	}



	public void run() {
	
		for(int i = 1; i <= 10; i++) {

			try {
				bQueue.take();
				
				System.out.println("Cosumer : " + i);

			}catch(InterruptedException ie) {

				
			}

			try { 
				Thread.sleep(5000);
			
			}catch(InterruptedException ie) {

			}
		}
	}


} 

class ProducerConsumer {


	public static void main(String[] args) {

		BlockingQueue bQueue = new ArrayBlockingQueue(3);

		Producer produce = new Producer(bQueue);
		Consumer consume = new Consumer(bQueue);
		
		Thread produceThread = new Thread(produce);
		Thread consumeThread = new Thread(consume);

		produceThread.start();
		consumeThread.start();
	}
	
}
