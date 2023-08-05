
public class GlobalVariable {
	int a=5;
	int b=10;
	static int c=15;
	
	public static void main(String[] args)
	{
		System.out.println(c);
		System.out.println("Prasad");
		System.out.println();
		
		int d= addition(10,20);
		System.out.println(d);
	}

	public static int addition(int first, int second)
	{
		return first + second;
	}
}
