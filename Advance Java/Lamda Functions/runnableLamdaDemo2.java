


// runnble with lambda expression 
//

class RunnableDemo {


	public static void main(String[] args) {
	

		Runnable obj1 = () -> System.out.println("In run");

		Thread t1 = new Thread(obj1);
		t1.start();


	}

	
}
