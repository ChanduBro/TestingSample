package test;

public class Methodoverloading
{
 //If a class has multiple methods having same name but different in parameters, it is known as Method Overloading.

// If we have to perform only one operation, having same name of the methods increases the readability of the program

/*
Method overloading increases the readability of the program.

Different ways to overload the method
There are two ways to overload the method in java

By changing number of arguments
By changing the data type
*/
	
	public int add()
	{
	       System.out.println("executed 1st one");
		return 0;          	
	}
	public int add(int a,int b)
	{
		
		int c=a+b;
	    System.out.println(+c);          	
        return c;
	}	
	
	
	public static void main(String[] args)
	{
		Methodoverloading test=new Methodoverloading();
		test.add();
		test.add(10,30);
	}

}
