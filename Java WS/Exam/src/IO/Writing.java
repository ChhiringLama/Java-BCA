 package IO;
import java.io.*;

public class Writing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter f=new FileWriter("D:\\IO.txt");
			try {
				f.write("Java programming is very good");
			}catch(Exception d) {}
			finally {
				f.close();
				System.out.println("The file has been closed");
			}
			System.out.println("Successfull");
			
		}catch(Exception e) {}
		
	}

}
