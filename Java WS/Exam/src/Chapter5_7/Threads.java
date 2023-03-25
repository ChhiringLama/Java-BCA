package Chapter5_7;

public class Threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multithread ref=new multithread();
		multithread ref2=new multithread();
		ref.start();
		ref2.start();
		

	}

}

class multithread extends Thread{
	public void run() {
		for (int i =1; i<=5; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println("Exception occured");
			}
		
		}
	}
}
