package dataType;

public class NestedIfControl {
	
	
	int num =24;
	
	
	public void nestedStatement()
	{
		
		
		if(num%2==0) // variable + relational operator
		{
			
			System.out.println("24 is divisible by 2:"+(num));
			
			if(num%4==0)
			{
				
				System.out.println("24 is divisible by 4:"+(num));
				
				if(num%7==0) // program execution stops here
				{
					
					System.out.println("24 is divisible by 6:"+(num));
					if(num%8==0)
					{
						
						System.out.println("24 is divisible by 8:"+(num));
					}
				}
			}
		}
		
		
	}
	
	
	public static void main(String[] args)
	{
		
		NestedIfControl n = new NestedIfControl();
		n.nestedStatement();
		
		
	}
	

}
