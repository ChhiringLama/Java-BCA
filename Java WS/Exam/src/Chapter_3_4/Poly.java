package Chapter_3_4;

public class Poly {

	public static void main(String[] args) {
	Sparrow b=new Sparrow();
	b.sing(3);
	}

}

class Bird{
	int times=2;
	public void sing(){
		System.out.println("Tweet");
	}
	
	public void sing(int times) {
		this.times=times;
		System.out.println("Tweet"+times);
	}
}

class Sparrow extends Bird {
	public void sing(int times) {
		System.out.println("Didid"+times);
	}
}