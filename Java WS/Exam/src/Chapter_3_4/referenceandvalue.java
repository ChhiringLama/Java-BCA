package Chapter_3_4;

public class referenceandvalue {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 42;
		display(number);
		
		int[] array= {2,4,1,2,3};
		displayarray(array);
	}
	
	//Primitive data type in the parameter = pass by value
	//Pass by value wont effect the variable "number" since num and number are in
	//different address
	public static void display(int num) {
		System.out.println("Num = "+num);
		
		// Num being in different address can hold different value without effecting "number"
		num=100;
		System.out.println("The value of num is "+num);
	}
	
	//Non primitive data works as pass by reference, 
	//Here "array" variable of array type is being passed from main to this method
	//Here the reference itself is being passed
	public static void displayarray(int[] value) {
		//Even if the parameter is named differntly both the name is poiinting to same location
		System.out.println("Inside the array first element= " +value[0]);
		
		value[0]=1;
		System.out.println("After the edit first element= "+value[0]);
	}
}
