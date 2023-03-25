package Chapter5_7;

public class CustomeException_Throw {

	public static void main(String[] args) throws Agelessthanzeroexception {
		// TODO Auto-generated method stub
			age(-1);
	}
	
	public static void age(int age) throws Agelessthanzeroexception{
		if(age<0) {
			throw new Agelessthanzeroexception("Error in age");
		}
	}
}


