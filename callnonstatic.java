package JavaPrograms;

public class callnonstatic {

	void add()
	{
		int a=10;
		int b=20;
	  int sum=a+b; 
	  System.out.println(sum);        //printing sum
	}
	  public static void main(String[] args)
	  {
		  callnonstatic d1= new callnonstatic();
				  d1.add();
	  }
	}
