package dataType;

public class TwoDimentional {

int tarr[][]=
{
		{12,43,78},
		{34,56,90},
		{79,39,21},
		
		
		
};

public void array () {
	
	for(int row=0;row<=2;row++)
	{
		for(int col=0;col<=2;col++)
		{
			System.out.print(tarr[row][col]+" ");
		}
		System.out.println();
	}
	
	
}
public static void main(String[] args) {
	TwoDimentional t = new TwoDimentional ();
	t.array();
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
}
