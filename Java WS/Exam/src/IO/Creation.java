package IO;

import java.io.*;

public class Creation {
		
	public static void main(String[] args) {
		File f=new File("D:\\IO.txt");
		try {
			if(f.createNewFile()) {
				System.out.println("Succefully created");
			}else {
				System.out.println("File exist");
			}
		}catch(Exception e){
			System.out.println("Exception found");
		}
		
	}
}
