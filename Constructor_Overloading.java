package JavaPrograms;

public class Constructor_Overloading {

	Constructor_Overloading()
	{
		System.out.println("printing Non parameterized constructor");
	}
	Constructor_Overloading(int a )
	{
		System.out.println("printing with parameter 1");
	}
	Constructor_Overloading(int b, String a)
	{
		System.out.println("printing With parameter 2");
	}
	
	public static void main(String[]args) 
	{
		System.out.println("Program on constructor overloading");
		//Constructor_Overloading d1=new Constructor_Overloading(3);
		 new Constructor_Overloading(0);
		 new Constructor_Overloading(1, "d");
		 new Constructor_Overloading();

		
	}
}
