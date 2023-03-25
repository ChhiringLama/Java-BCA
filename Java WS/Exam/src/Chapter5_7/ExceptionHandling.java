package Chapter5_7;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started");
		
		try {
			int a=10, b=0,c;
			c=a/b;
			System.out.println(c);	
		}
		catch(Exception e) {
			System.out.println(e);
		
		}
		finally {
			System.out.println("Do you continue?");
		}
		
		
		System.out.println("Main method ended");
	}

}
