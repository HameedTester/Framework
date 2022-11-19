package dataType;

public class MethodSyntax {

	int var1 = 10;
	int var2 = 3;
	
	public void addiction () {
		
		System.out.println("Addition is:"+(var1 + var2));//without returntype without
		                                                  //parameter
		
	}
	public void subtraction (int a,int b) {
		
		
		System.out.println("subtraction is:"+(a-b));//with parameter without return
		                                             // type
		
	}
	public int mulNumbers () {
		
		return var1*var2;//with returntype without parameter
		
	}
	public int divNumbers (int a,int b) {
		
		return var1/var2;//with parameter with returntype
	}
	public static void main(String[] args) {
		
		MethodSyntax m = new MethodSyntax ();
		m.addiction ();
		m.subtraction(500,300);
		System.out.println(m.mulNumbers());
		System.out.println(m.divNumbers(10,2)); 
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
