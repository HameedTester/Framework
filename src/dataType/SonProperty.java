package dataType;

public class SonProperty extends FatherProperty {

public void ktmbike() {
	
	
	System.out.println("this is son ktmbike");//own property
	
}	
public void Goldring () {
	
	System.out.println("this is son goldring");//own 
	
	
}


public static void main(String[] args) {
	
	SonProperty s = new SonProperty ();
	s .ktmbike();//son
	s.Goldring();//son
	s.audicar ();//father
	s.land();//father
	s.house();//grandfather
	s.cycle();//grandfather
	
}	
	
	
	
	
	
	
	
	
	
	
}
