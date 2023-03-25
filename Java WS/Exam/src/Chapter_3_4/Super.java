package Chapter_3_4;

public class Super {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c=new Car();
		System.out.println(c.speed);
		c.setspeed();
		c.vroom();
	}

}

class Car extends vehicle{
	int speed=100;
	
	public void setspeed() {
		//Super variable
		System.out.println(super.speed);
	}
	public void vroom() {
		//Super method
		super.vroom();
	}
	
	Car(){
		System.out.println("I am from the Car's Constructor");
	}
}

class vehicle{
	int speed=120;
	
	vehicle(){
		System.out.println("I am from vehicle Constructor");
	}
	public void vroom() {
		System.out.println("KKKKKK");
	}
}
