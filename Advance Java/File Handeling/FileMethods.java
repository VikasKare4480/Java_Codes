

import java.io.*;

class FileDemo {



	public static void main(String[] args) throws IOException {
		
		File fobj = new File("NewFile");

		// exists() 

		System.out.println(fobj.exists());
	
		// mkdir()
		//
		fobj.mkdir();

		System.out.println(fobj.exists());
		
		// crteateNewFile()

		fobj.createNewFile();
			
		// isFile() 
		
		System.out.println(fobj.isFile());

		// obj2.createNewFile();

		// canRead() 

		System.out.println("canRead() : " + fobj.canRead());

		// canWrite() 

		System.out.println("canWrite() : " + fobj.canWrite());

		// delete() 

		File obj2 = new File("NewFile.txt");
		System.out.println("delete() : " + obj2.delete());

		// getName() 

		System.out.println("getName() : " + fobj.getName());

		// getParent(); // null --> not know path 

		System.out.println("getParent() : " + fobj.getParent());

		// getAbsolutePath()

		System.out.println("getAbsolutePath : " + fobj.getAbsolutePath());

		// getPath()  

		System.out.println("getPath() : " + fobj.getPath());

		// String[] list()

		System.out.println("String[] list()");

		File obj1 = new File("/mnt/c/Users/karev/OneDrive/Desktop/Core2Web/Java/Java Learining/Advance Java/File Handeling");

		String[] files = obj1.list();

		for(String str : files) {

			System.out.print(str + " ");
		}

		System.out.println("Only Files are : ");

		for (String str : files) {

			File f = new File(str);

			if(f.isFile()) {

				System.out.println(str);
			}
			
		}

		// mkdirs()  // cretes a nested folders 

		File obj = new File("Vikas/Laxman/Kare");

		obj.mkdirs();

		// isDirectory() 

		System.out.println("Vikas/Laxman/Kare : isDirectory() " + obj.isDirectory()); // true

		System.out.println("isFile() : " + obj.isFile()); // false

		// isHidden() 

		System.out.println("isHidden() : " + obj.isHidden());

		// lastmodified() 

		System.out.println("lastModified() " + obj.lastModified());

		// int compareTo()

		File fobj1 = new File("Vikas.txt"); 
		fobj1.createNewFile();

		File fobj2 = new File("Kare.txt");
		fobj2.createNewFile();

		int data = fobj1.compareTo(fobj2);

		if(data == 0) {

			System.out.println("Both files are same");
		}else if(data > 0 || data < 0) {
			
			System.out.println("Both files are not same");
		}

		boolean camp = fobj1.getName().equals(fobj2.getName());

		if(camp == false) {

			System.out.println("Not same Name");
		}else {

			System.out.println("Having same Name");
		}
	}
}
