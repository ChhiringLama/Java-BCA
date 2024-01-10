package Chapter_3_4;

// Constructor initializes and object in OOP

public class Constructors {
	String name;
	int age;
	public static void main(String[] args) {
	Constructors ref=new Constructors("Chhiring",42);
	ref.print();
	}
	
	Constructors(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	public void print() {
		System.out.println(name+" "+age);
	}

}


