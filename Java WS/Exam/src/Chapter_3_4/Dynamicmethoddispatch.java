package Chapter_3_4;

public class Dynamicmethoddispatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ref=new B();
		ref.show();
		
	}

}

class A {
	public void show() {
		System.out.println("I am from A");
	}
}

class B extends A{
	public void show() {
		System.out.println("I am from B");
	}
	
	public void display() {
		System.out.println("Dispalying");
	}
}

class C extends A {
	public void show() {
		System.out.println("I am from C");
	}
}