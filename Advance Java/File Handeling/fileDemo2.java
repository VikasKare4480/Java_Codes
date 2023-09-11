

import java.util.*;
import java.io.*;

class FileDemo {


	public static void main(String[] args) throws IOException {
		
		File fobj = new File("Exception Handeling", "core2Web");

		// exists() 
		
		if(!(fobj.exists())) {
			
			fobj.mkdir();
		}
		
		fobj.createNewFile();
	}

}
