package dataType;

public class ControlStatements {
	
	
	
	int age=18;
	
	
	
	public void control()
	{
		
		if(age==18) //variable + relational operator // 18<=18--> 18<18--false/ 18=18, 17==18
		{

		System.out.print("Eligible to Cast Vote:"+(age)); //System.out.println

		}
		else
		{
			
			System.out.print("Not Eligible to Cast Vote");
			
		}

		
	}
	
	
	public static void main(String[] args)
	{
		
		ControlStatements c = new ControlStatements();
		c.control();
		
		
		
	}
	

}
