
import java.util.concurrent.BlockingQueue;

import java.util.concurrent.ArrayBlockingQueue;

class BlockingQueueDemo {
	

	public static void main(String[] args) {

		
		BlockingQueue bQueue = new ArrayBlockingQueue(3);
		
		bQueue.offer(10);
		bQueue.offer(20);
		bQueue.offer(30);



		System.out.println(bQueue);

		bQueue.add(40);
		// bQueue.put(40); // Exception Here

		System.out.println(bQueue);
		System.out.println();

	}
}
