
public class String_demo {

	
	
	public static void main(String[] args)
	{
		String s="maadam";
		String t="";
		
		
		
		for(int i=s.length()-1;i>=0;i--)
		{
			
			t= t+s.charAt(i);
			
		}
		
		System.out.println(t);
		
		if(t.equals(s))
		{
			
			System.out.println("Yes its palindrome");
			
		}	
		else
		{
			
			
		}
	}
	
}
