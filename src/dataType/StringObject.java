package dataType;

public class StringObject {

	String s1 = "oranium tech";
	String s2 = new String ("java programming");
	String s3 = "practice java";
	String s4 ="";
	
	
	public void printstring () {
		
		System.out.println(s1);//oranium tech
		System.out.println(s2);//java programming
		System.out.println(s3);
		
		System.out.println(s1.hashCode());//address
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s1.hashCode());//
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s3.contains(s3));
		
		System.out.println(s1.isEmpty());
		System.out.println(s4.isEmpty());
		
		System.out.println(s1.endsWith("ch"));
		System.out.println(s2.startsWith("pro"));
		
		
		
	
		
		
		
		
	}
	public static void main(String[] args) {
		
		 StringObject a = new  StringObject ();
		 a.printstring();
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
