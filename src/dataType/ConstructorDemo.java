package dataType;

public class ConstructorDemo {
	
	
	int a;
	int b;
	
	
	
	// create a constructor
	
	ConstructorDemo()  // non parameter constructor or default constructor //1
	{
		// to initialize the variables
		
		this(20,30);
		a=10;
		b=20;
		
		System.out.println(a+b);
		
	}
	
	ConstructorDemo(int a, int b)  // non parameter constructor or default constructor
	{
		this(30,30.4f);
		System.out.println(a-b);
		
	}
	
	ConstructorDemo(int a, float b)  // non parameter constructor or default constructor
	{
		this(30.4f,30);
		System.out.println(a*b);
		
	}
	ConstructorDemo(float a, int b)  // non parameter constructor or default constructor
	{
		System.out.println(a/b);
		
	}
	
	public static void main(String[] args) {
		
		
		ConstructorDemo c = new ConstructorDemo();// default constructor
//		ConstructorDemo c1 = new ConstructorDemo(20, 30);
//		ConstructorDemo c2 = new ConstructorDemo(10, 30.4f);
//		ConstructorDemo c3 = new ConstructorDemo(40.34f, 30);
		
		
	}

}
