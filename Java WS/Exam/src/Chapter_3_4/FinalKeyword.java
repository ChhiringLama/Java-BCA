package Chapter_3_4;

public class FinalKeyword {
	final int a=10;
	public static void main(String[] args) {
	FinalKeyword f=new FinalKeyword();
	
	System.out.println(f.a);
	}
	
	final void show() {
		System.out.println("I am from super class");
	}
	
	Engine ref=new Engine();
	//ref.show();

}

class Engine extends FinalKeyword{
	
//	//Final keyword didnt let the show method override
//	public void show() {
//		System.out.println("I am from sub class");
//	}
}

