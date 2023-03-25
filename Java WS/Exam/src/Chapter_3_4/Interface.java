package Chapter_3_4;

public interface Interface {
	int brakerate=23;
	int topspeed=10;
	
	 void move();
	 void accelerate();
}

class details implements Interface{


	public void move() {
		System.out.println("Moving");
		
	}

	
	public void accelerate() {
		System.out.println("Accelerating");
		
	}
	
}

