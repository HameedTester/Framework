package dataType;

public class SwitchCaseControl {


	String  proof ="Pan";


	public void switchDemo()
	{


		//switch case syntax

		switch(proof) // proof == Pan
		{

		case "Aadhar":
			System.out.println("This is Aadhar Car");
			break;

		case "Pan":

			System.out.println("This is Pan"); //
			

		case "Vote ID":
			System.out.println("This is Voter ID");
			

		case "Ration Card":
			System.out.println("This is My Ration Card");
			break;


		default:
			System.out.println("No Matching Proofs are Found");
			break;







		}




	}



	public static void main(String[] args)
	{

		SwitchCaseControl s = new SwitchCaseControl();
		s.switchDemo();



	}

}
