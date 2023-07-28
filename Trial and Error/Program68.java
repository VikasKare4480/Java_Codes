class Demo1 {

	static void fun() {
	
		System.out.println("In Demo1 fun");
	}

}

class Demo2 extends Demo1 {

	static void fun() {
				
		System.out.println("In Demo2 fun");
	
	}

}

class Client {

	public static void main(String[] args) {
	
		Demo1 obj = new Demo2();
		obj.fun();
	}

}

