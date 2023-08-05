package InheritancePractice;

public class MasterClass {

	public static void main(String[] args)
	{
		AA a=new BB();
		BB b=new BB();
		System.out.println("Value of X is: "+a.x);
		
		System.out.println("Value of X is: "+b.x);
	}
}
