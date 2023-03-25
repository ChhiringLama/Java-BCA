package Chapter5_7;

public class Strings {

	public static void main(String[] args) {
	
	//String creation using Stringbuilder class and a object
	StringBuilder sb=new StringBuilder();
	sb.append("Hello");
	sb.append("World");
	System.out.println(sb);
	sb.insert(5, " ");
	System.out.println(sb);
	
	//Concatenation
		String str1=sb.toString();
		//or 
		String str2="Hi";
		String str3="Hello";
		String str4=str2+str3;
		
		System.out.println(str4);
		
		//Conversion
				String str5="213124";
				int num=Integer.parseInt(str5);
				System.out.println(num);
				
	//Changing case 
			
		String str6= str4.toUpperCase();
		System.out.println(str6);
	
	//Character extraction 
		System.out.println("String 1 and String 2 are equal = "+str1.equals(str6));
		
	//
	}
	
	
	
	
	
}
