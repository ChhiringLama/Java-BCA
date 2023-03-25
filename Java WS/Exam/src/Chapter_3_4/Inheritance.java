package Chapter_3_4;

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			cat ref=new cat();
			ref.sound();
			ref.food();
			
			
	}

}

class cat extends Animal {
	String name = "Kitty";
	String furr = "Thin";
	public void sound() {
		System.out.println("Hello I am a cat, meow.");
	}
	
	public void favourite() {
		System.out.println("I eat fish");
	}
	
	
}


class dog extends Animal{
	
	String furr = "Thick";
	public static void sound() {
		System.out.println("Hello I am a dog, Woof woof.");
	}
}

