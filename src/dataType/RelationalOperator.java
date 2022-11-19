package dataType;

public class RelationalOperator {
	
	
	int a =20;
	
	int b =30;
	
	
	public void relationalOperator()
	{
		
		
	System.out.println(a<b);  // 20<30--> true
	System.out.println(a>b); //20>30--> false
	System.out.println(a<=b); // 20<=30--> true
	System.out.println(a>=b); //20>=30-->false
	System.out.println(a==b);//20==30-->false
	System.out.println(a!=b);//20!=30--> true
		
		
	}
	
	
	public static void main(String[] args) {
		
		RelationalOperator r = new RelationalOperator();
		r.relationalOperator();
		
	}
	
	
	

}
