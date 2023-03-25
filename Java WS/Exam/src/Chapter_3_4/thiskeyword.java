package Chapter_3_4;

public class thiskeyword {
	
	int a;
	int b;
	
	//This keyword is a reference for current instance of an object ,or
	//it can be used to access the member of the current object or class such as 
	// variables and methods from within the object
	public void data(int a,int b) {
		this.a=a;
		this.b=b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		thiskeyword ref=new thiskeyword();
		ref.data(1,2);
		
		System.out.println(ref.a  +" "+ ref.b);
	}

}
