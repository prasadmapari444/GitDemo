package Arrays;

public class SingleDimensionArray {
	
	
	
	public static void main(String[] args)
	{
		int a[]=new int[3];
				
				a[0]=1;
				a[1]=2;
				a[2]=3;
				
				//System.out.println(a[0]);
				
				for(int i=0;i<a.length;i++)
				{
					
					System.out.print(" "+a[i]);
				}
				System.out.println("");
	//----------------------------------------------------------
				int b[]= {1,2,3};
				
				for(int i=0;i<b.length;i++)
				{
					
					System.out.print(" "+b[i]);
				}
	//-------------------------------------------------------------
				
				int m[][]=new int[2][2];
				
				m[0][0]=1;
				m[0][1]=2;
				m[1][0]=3;
				m[1][1]=4;
				System.out.println("---------");
				System.out.println(" "+m[0][1]);
				
	//-------------------------------------------------------------
				
				int md[][]= {{1,2},{3,4}};
				
				
				
				System.out.println(md[0][1]);
	
				for (int i = 0; i < md.length; i++) {
				    for (int j = 0; j < md[i].length; j++) {
				        System.out.print(md[i][j]);
				    }
				    System.out.println("");
				}
	}

}
