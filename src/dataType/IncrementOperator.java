package dataType;

public class IncrementOperator {
	
	
	int a =10;
	
	
	public void incrementOperator()
	{
		System.out.println(a++); // 10
		System.out.println(a);// 11
		
		System.out.println(++a); //12
		
		System.out.println(a);//12
		
		System.out.println(a--);//12
		System.out.println(a);//11
		
		System.out.println(--a);//10
		System.out.println(a);//10
		
		
	}

	
	public static void main(String[] args) {
		
		
		IncrementOperator i =  new IncrementOperator();
		i.incrementOperator();
		
	}
}
