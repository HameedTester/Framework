package dataType;

public class NormalClass implements InterfacePractice {

	public void divide () {



		System.out.println("this is divide number");


	}
	public  void add() {

		System.out.println("this is addnumbers");
	}

	public void subnumbers()
	{
		System.out.println("Sub Numbers");
	}

	public void mulnumbers()
	{
		System.out.println("Mul Numbers");	
	}
	public static void main(String[] args) {

		NormalClass n = new NormalClass ();
		n.divide();//own class
		n.add();//interface 
		n.subnumbers();//interface
		n.mulnumbers();//interface
	}

}









