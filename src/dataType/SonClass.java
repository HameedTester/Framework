package dataType;

public class SonClass extends FatherClass {

	public void ktmBike () {
		
		
		System.out.println("this is son ktmbike");//own property
		
		
	}
	public void audicar () {
		
		System.out.println("this is son audicar");//own
		
	}
	public void porchecar() {
		
		System.out.println("this is father porchecar");
		
	}

	
	
	
	public static void main(String[] args) {
		
		SonClass s = new SonClass ();
		s .ktmBike ();//son
		s .audicar ();//father,son
		s .porchecar();//father
		
		 
		
	}
	
	
	
	
	
	
}
