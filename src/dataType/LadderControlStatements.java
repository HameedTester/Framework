package dataType;

public class LadderControlStatements {
	
	int num =24;
	
	
	public void ladderStatements()
	{
		
		
		
		if(num%5==0) //24%2==0 // 24%5==0
		{
			
			System.out.println("Number is Divisible by 2"); // 
		}
		
		else if(num%9==0)
		{
			
			System.out.println("Number is Divisible by 4"); //
		}
		
		else if(num%6==0) // program will stop executing
		{
			
			
			System.out.println("Number is Divisible by 6");
		}
		
		
		else if(num%8==0)
		{
			
			System.out.println("Number is Divisible by 8");
		}
		
	}
	
	public static void main(String[] args)
	{
		
		LadderControlStatements l = new LadderControlStatements();
		l.ladderStatements();
		
		
		
	}

}
