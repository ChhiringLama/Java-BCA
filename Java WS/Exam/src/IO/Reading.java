package IO;
import java.io.*;
public class Reading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader f=new FileReader("D:\\IO.txt");
			try {
				int i;
				while((i=f.read())!=-1){
					System.out.print((char)i);
				}
			}catch(Exception d) {
				
			}finally {
				f.close();
			}
			
		}catch(Exception e) {
			
		}
		
	}

}
