

import java.util.*;
import java.io.*;

class FileDemo {

	public static void main(String[] args) throws IOException {
	
		File fobj = new File("core2web.pdf");

		// createNewFile() 

		fobj.createNewFile(); 

		// mkdir();

		File fobj2 = new File("Exception Handeling");

		fobj2.mkdir();

		// 
	}

}	
