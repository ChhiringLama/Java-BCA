package IO;
import java.io.*;

public class Printing {

	public static void main(String[] args) {
		File f=new File("D:\\IO.txt");
		if(f.exists()) {
			System.out.println("File name: "+f.getName());
			System.out.println("File address: "+f.getAbsolutePath());
			System.out.println("Writable: "+f.canRead());
			System.out.println("Readable: "+f.canWrite());
			System.out.println("Size: "+f.length() );
		}else {
			System.out.println("File doesnt exist");
		}
	}

}
