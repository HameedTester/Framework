package dataType;

public class LogicalOperator {


	int x=10;
	int y=20;


	public void logicalOperator()
	{
		// Using AND Operator "&&"
		//		System.out.println((x<y) && (x>y)); // 10<20 && 10>20 -->false
		//		System.out.println((x==y)&& (x<y)); // 10==20 && 10<20--> false
		//		System.out.println((x>y) && (x==y)); // 10>20 && 10==20-->false
		//		System.out.println((x>y) && (x<=y)); // 10>20 && 10<=20-->false
		//		System.out.println((x<y)&&(x<=y)); // 10<20 && 10<=20-->true


		// using OR Operator "||"
		//		System.out.println((x<y) || (x>y)); // 10<20 && 10>20 -->true
		//		System.out.println((x==y)|| (x<y)); // 10==20 && 10<20--> true
		//		System.out.println((x>y) || (x==y)); // 10>20 && 10==20-->false
		//		System.out.println((x>y) || (x<=y)); // 10>20 && 10<=20-->true
		//		System.out.println((x<y)||(x<=y)); // 10<20 && 10<=20-->true

		//using NOT Operator "!"

//		System.out.println(!(x<y)); // -->10<20--> true--> false
//		System.out.println(!(x==y)); // 10==20--> false--> true
//		System.out.println(!(x>y)); // 10>20-->false--> true
//		System.out.println(!(x>y)); // 10>20--> false--> true
//		System.out.println(!(x<y)); // 10<20--> true--> false

	}


	public static void main(String[] args) {

		LogicalOperator l = new LogicalOperator();

		l.logicalOperator();
	}
}
