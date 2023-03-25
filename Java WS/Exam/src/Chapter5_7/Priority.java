package Chapter5_7;

public class Priority {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multithreading ref=new Multithreading();
		Multithreading ref2=new Multithreading();
		Multithreading ref3=new Multithreading();
		ref.start();
		ref.setPriority(10);
		ref2.start();
		ref2.setPriority(1);
		ref3.start();
		ref3.setPriority(5);
	}

}

class Multithreading extends Thread{
	public void run() {
		System.out.println("Thread priority is "+ Thread.currentThread());
	}
}
