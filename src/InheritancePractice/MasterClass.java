package InheritancePractice;

public class MasterClass {

	public static void main(String[] args)
	{
		AA a=new BB();
		BB b=new BB();
		System.out.println("Value of X is: "+a.x);
		
		System.out.println("Value of X is: "+b.x);
	}
	
	//----------------'branch' code new task----------------
	public void branchTest()
	{
		System.out.println("This is to test Branch");
	}
	
	
	//----------------------------------------------------
	public void branchTest2()
	{
		
		System.out.println("This ex is of branchTest-2");
	}

}
