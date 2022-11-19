package dataType;

public class MethodType {

	int var1=10;
	int var2=3;
	
	public void addnumbers() {
		
		System.out.println(var1 + var2);//13
		
	}
	public void subtraction (int a,int b) {
		
		
	System.out.println(a-b);//50	
			
	}
	public int multiplenumbers() {
		
		return var1*var2;
		
		
	}
	public int divisiblenumbers(int var1,int var2) {
		
		return var1/var2;
		
		
	}
	
	public static void main(String[] args) {
		
	MethodType m = new MethodType ();
	m.addnumbers ();
	m.subtraction(300,250);
	System.out.println(m.multiplenumbers());
	System.out.println(m.divisiblenumbers(20, 4));	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
