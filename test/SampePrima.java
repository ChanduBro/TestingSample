package test;

public class SampePrima {

public static void primeNumber()
{
	int num = 29;

	boolean flag = false;
	
	// Note: 0 and 1 are not prime numbers. 
	// The 2 is the only even prime number because all the other even numbers can be divided by 2.
	for(int i=2; i<=num/2;i++)
	{   //// condition for nonprime number

		if(num%i == 0)
		{
			flag = true;
			break;
		}
	}
	if(!flag)
	{
		System.out.println("The number is Prime");
	}
	else
	{
		System.out.print("Number is not prime");
	}
}
public static void main(String args[])
{    	
	primeNumber();
}

}
