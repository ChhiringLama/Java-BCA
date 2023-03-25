package Chapter_3_4;

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hidden ref=new hidden();
		ref.setname("Chhiring");
		System.out.println("Hello my name is "+ref.getname());
	}

}

class hidden{
	private String name;
	
	public String getname() {
		return name;
	}
	public void setname(String newname) {
		this.name=newname;
		
	}
}
