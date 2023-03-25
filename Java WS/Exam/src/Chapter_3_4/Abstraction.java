package Chapter_3_4;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gupphy d= new Gupphy();
		d.voice("Gold");
		d.eat();
	}

}


abstract class Fish {
	String breed;
	
	//voice method can be called with subclass since superclass has the details
	public void voice(String breed) {
		this.breed=breed;
		System.out.println("I am a Fish and my breed is "+breed);
	}
	
	//eat method cannot be called without it having been described in the subclass
	public abstract void eat();
}

class Gupphy extends Fish {
	
	//eat is abstract method, which needs its details in it's subclass
	public void eat() {
		System.out.println("I eat fish food");
	}
	

}