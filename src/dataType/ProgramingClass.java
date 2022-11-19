package dataType;

public class ProgramingClass implements InterfaceOne {

	
public void van() {
	
	
	System.out.println("it is normal class van");
	
	
}	

public void audicar() {
	
	System.out.println("this is interface audicar");
	
}

public void taxi() {
	
	System.out.println("this is interface taxi");
	
}

public void bus() {
	
	System.out.println("this is interface bus");
	
	
}

public static void main(String[] args) {
	ProgramingClass c = new ProgramingClass ();
	c.van();
	c.bus();
	c.taxi();
	c.audicar();
	
	
	
}

	
	
	
	
	
	
	
	
}
