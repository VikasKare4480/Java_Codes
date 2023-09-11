

interface method {

	void data();

}


class interfaceDemo  implements method {


	public void data() {


		System.out.println("In data");

	}

	public static void main(String[] args) {
			
			
		interfaceDemo obj = new interfaceDemo();

		obj.data();
	}
}



