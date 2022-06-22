package test;

public class Sample 
{
	public void palindromes()
	{
		int temp,no=151,sum = 0;
		
	// armstrong number ka strategy 
		
		int r=0;
		
		while(no>0)
		
	//	for(int i=1;i>=no;i++)
		{
			r=no%10; //1
			
			sum=sum*10+r; // 10
			
			no=no/10; //10	
		}
		System.out.println("the number is palindromes" +sum);
	}
	
	public void armstrongs()
	{
		int temp,no=153,sum = 0;
		
		// armstrong number ka strategy 
		// 1^3 + 5^3 + 3^3 =153	
		
			int r=0;
			
			while(no>0)
			{
				r=no%10; //3
				
				sum=sum+r*r*r; // 27+125+1
				
				no=no/10; //15	
			}
			System.out.println("the number is armstrong" +sum);
	}
	
	public static void main(String[] args)
	{
		Sample test=new Sample();
		test.palindromes();
	    test.armstrongs(); 
	}
}
