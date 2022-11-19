package dataType;

public class PrintTable {

	int num =1;
	
	public void evenoddcheck () {
		
		while(num<=25)
		{
			if(num%2==0)
			{
				System.out.println(num+"is an even number");
			}
			else
			{
				System.out.println(num+"ia an odd number");
			
			}
			num++;
		}
		
		
		
		
	}
	public static void main(String[] args) {
	PrintTable a = new PrintTable () ;
	a .evenoddcheck ();
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
