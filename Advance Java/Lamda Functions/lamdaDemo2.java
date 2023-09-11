



interface Core2Web {

	
	String lang(int numCourse);
}


class Demo {


	public static void main(String[] args) {
		
		Core2Web c2w = (xyz) -> {

		return "Bootcamp|CPP|C|OS" + " : " + xyz;

		};

		System.out.println(c2w.lang(8));
	}

}
