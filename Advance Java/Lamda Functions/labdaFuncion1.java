



interface Core2Web {

	void lang();
}



class LambdaDemo {

	
	public static void main(String[] args) {


		Core2Web c2w = () -> {
			
			System.out.println("Bootcamp|Java|C|CPP");

		};
	
		c2w.lang();
	
	}
	
}
