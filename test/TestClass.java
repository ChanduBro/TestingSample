package test;

import java.util.Scanner;

public class TestClass 
{

	public static void reverseUsingChar()
    {
	String data = "Zuber";
	char[] input = data.toCharArray();
	for(int i= input.length-1; i>=0;i--)
	{
		System.out.print(input[i]);
	}
	System.out.print("\n");
   }

public static void reverseUsingStringBuilder()
{
	String data = "Khan";
	StringBuilder sb = new StringBuilder();
	sb.append(data);
	sb = sb.reverse();
	System.out.print(sb + "\n");
}


public static void duplicateCharCount()
{
	System.out.println("Plerase enter a String :");
	@SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	String data = sc.nextLine();
	int count = 0;
	char[] input = data.toCharArray();
	for(int i=0; i<input.length; i++)
	{
			if(input[i] == 's')
			{
				count++;
			}
	}
	
	System.out.println("The repeated Char count is : " + count);
			
}


public static void fibonacci()
{
	int n=5, t1=0, t2=1;
	for(int i=1; i<=n; i++)
	{
		System.out.print(t1 + ", ");
		int sum = t1+t2;
		t1=t2;
		t2=sum;
	}
	System.out.print("\n");
}

public static void primeNumber()
{
	int num = 29;
	boolean flag = false;
	for(int i=2; i<=num/2;i++)
	{
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

/*----	DA0504221 , 	DA0504222 */

public static void startPattern()
{
	System.out.println("Please enter the no to print");
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	scan.close();
	for(int i=0; i<=num; i++)
	{
		for(int j=0; j<=i; j++)
		{
			System.out.print("*");
		}
		System.out.print("\n");
	}
}



public static void numberPattern()
{
	System.out.println("Please enter the no to print");
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	scan.close();
	for(int i=1; i<=num; i++)
	{
		for(int j=1; j<=i; j++)
		{
			System.out.print(j);
		}
		System.out.print("\n");
	}
}


/**
 * @param args
 */
public static void main(String[] args) 
{
	// TODO Auto-generated method stub
	reverseUsingChar();
	reverseUsingStringBuilder();
	//duplicateCharCount();
	fibonacci();
	primeNumber();
	//startPattern();
	numberPattern();

}

}




/* 

/*Java Program to find the frequency of characters in a string*/
/*public class Main  
{  
     public static void main(String[] args) 
     {  
        String str = "Study Tonight";  
        int[] freq = new int[str.length()];  
        System.out.println("The entered string is "+str);
        //Convert the given string into character array  
        char str1[] = str.toCharArray();            
        for(int i = 0; i <str.length(); i++) 
        {  
            freq[i] = 1;  
            for(int j = i+1; j <str.length(); j++) 
            {  
                if(str1[i] == str1[j])
                {  
                    freq[i]++;  
                      
                    //Set str1[j] to 0 to avoid printing visited character  
                    str1[j] = '0';  
                }  
            }  
        }            
        //Displays the characters and their corresponding frequency  
        System.out.println("Frequencies of the characters in the string are as below: "); 
        System.out.println("Characters  frequencies");  
        for(int i = 0; i <freq.length; i++) 
        {  
            if(str1[i] != ' ' && str1[i] != '0')  
                System.out.println(str1[i] + "              " + freq[i]);  
        }  
    }  
}  

* Algorithm
Start

Declare a string

Initialize it.

Use a frequency array to store the frequency of each character.

Convert the string to a character array

Use two for loops to calculate the frequency of each element.

Use the first for loop to iterate through each character of the array.

Initialize each element of the frequency array as 1.

Use another for loop to iterate through the remaining characters.

Check for the total occurrence of the element.

If the element occurs again, increment the value in the frequency array.

Set the character array to 0 to avoid counting visited characters.

Print the characters and their corresponding frequency.

Stop.
*
*
*
*  Algorithm
Define a string.
Define an array freq with the same size of the string.
Two loops will be used to count the frequency of each character. Outer loop will be used to select a character and initialize element at corresponding index in array freq with 1.
Inner loop will compare the selected character with rest of the characters present in the string.
If a match found, increment element in freq by 1 and set the duplicates of selected character by '0' to mark them as visited.
Finally, display the character and their corresponding frequencies by iterating through the array freq.
* 
*   
* public class Frequency   
{  
     public static void main(String[] args) {  
        String str = "picture perfect";  
        int[] freq = new int[str.length()];  
        int i, j;  
          
        //Converts given string into character array  
        char string[] = str.toCharArray();  
          
        for(i = 0; i <str.length(); i++) {  
            freq[i] = 1;  
            for(j = i+1; j <str.length(); j++) {  
                if(string[i] == string[j]) {  
                    freq[i]++;  
                      
                    //Set string[j] to 0 to avoid printing visited character  
                    string[j] = '0';  
                }  
            }  
        }  
          
        //Displays the each character and their corresponding frequency  
        System.out.println("Characters and their corresponding frequencies");  
        for(i = 0; i <freq.length; i++) {  
            if(string[i] != ' ' && string[i] != '0')  
                System.out.println(string[i] + "-" + freq[i]);  
        }  
    }  

* 
*
*  https://www.browserstack.com/guide/read-data-from-excel-using-selenium  ----evrything regarding the file logic and analysis will get from this places
*  https://www.codespeedy.com/fetch-data-from-excel-file-in-java/
*  https://www.guru99.com/all-about-excel-in-selenium-poi-jxl.html
*  https://stackoverflow.com/questions/18285953/fetch-data-from-excel
* https://www.geeksforgeeks.org/maven-lifecycle-and-basic-maven-commands/#:~:text=Maven%20Lifecycle%3A%20Below%20is%20a,%2C%20Verify%2C%20Install%20and%20Deploy. -- maven life cycle
* https://stackoverflow.com/questions/62451267/how-to-click-on-the-radio-button-through-the-element-id-attribute-using-selenium
* https://teachyourselftestautomation.com/dynamic-radio-button-selenium/
* https://www.toolsqa.com/selenium-webdriver/selenium-radio-buttons/ - radio buttons analysis 
* https://www.guru99.com/handling-dynamic-selenium-webdriver.html -- dynamic tables how to handle in selenium
* https://www.toolsqa.com/selenium-webdriver/handle-dynamic-webtables-in-selenium-webdriver/
* https://www.browserstack.com/guide/handle-web-tables-in-selenium
* 
* 
* Pull and rebase commands how it works --- multiple branching conflict how to resolve it
* code changes updated as records point of view
*/

