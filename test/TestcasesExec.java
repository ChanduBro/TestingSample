package test;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class TestcasesExec 
{
	public static void main(String[] args) //throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\Automation code\\chromedriver_win32\\chromedriver.exe");
    	
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		
		String tit=driver.getTitle();
		
		System.out.println(tit);
		
		driver.manage().window().maximize();
		
		Alert text=driver.switchTo().alert();
		
		
		text.accept();
		text.dismiss();
		
		// driver.switchTo().alert().getText();
        // driver.switchTo().alert().sendKeys("Text");
        // Alert simpleAlert = driver.switchTo().alert();
	    // simpleAlert.accept();
		
		
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Syntax: driver.manage().timeouts().implicitlyWait(TimeOut, TimeUnit.SECONDS);
	//	--  An implicit wait is to tell WebDriver to poll the DOM for a certain amount of time 
		//when trying to find an element or elements (if) they are not immediately available. 
	//	--- The default setting is 0. Once set, the implicit wait is set for the life of the WebDriver object instance
	//	String test=driver.alert().accept();
		
	//	System.out.println("test");
		
		
		Select test=new Select(driver.findElement(By.id("")));
		test.selectByIndex(1);
		
		Select objSelect =new Select(driver.findElement(By.id("search-box")));
		objSelect.selectByVisibleText("Automation");
		objSelect.selectByValue("");
		
		
		Select objSelect1 = new Select(driver.findElement(By.id("Search-box")));
		List <WebElement> elementCount = objSelect1.getOptions();
		System.out.println(elementCount.size());
		
		objSelect1.deselectAll();
		objSelect.isMultiple();
		
		
		//We have used Explicit wait here as the driver will wait for 10 seconds to see if an alert occurs and. 
		//It will check for the alert using the try-catch block. 
		//We use Explicit wait as WebDriverWait wait = new WebDriverWait(driver,10) ; and wait.until(ExpectedCondition.alertIsPresent());
		
	//	WebDriverWait wait=new WebDriverWait(driver,10);
	//	wait.until(ExpectedCondition.alertIsPresent());
		
  /*
   * 
   * Once we declare explicit wait we have to use “ExpectedConditions” or we can configure how frequently 
   * we want to check the condition using Fluent Wait. 
   * These days while implementing we are using Thread.Sleep() generally it is not recommended to use
   *    
   *    In the below example, we are creating reference wait for “WebDriverWait” class and instantiating using “WebDriver” reference, 
   *    and we are giving a maximum time frame of 20 seconds.
		Explicit Wait syntax:
		WebDriverWait wait = new WebDriverWait(WebDriverRefrence,TimeOut);
   *    
   *    
   *    https://www.browserstack.com/guide/wait-commands-in-selenium-webdriver
   *    
   *    
   *    
   *    Fluent Wait syntax:
        Wait wait = new FluentWait(WebDriver reference)
        .withTimeout(timeout, SECONDS)
        .pollingEvery(timeout, SECONDS)
        .ignoring(Exception.class)
   *    
   *    https://www.browserstack.com/guide/wait-commands-in-selenium-webdriver
   *    
   *    
   */
		
/* In Selenium web driver there are methods through which we can handle multiple windows.

Driver.getWindowHandles();

To handle all opened windows by web driver, we can use “Driver.getWindowHandles()” and 
then we can switch window from one window to another in a web application. Its return type is Iterator<String>.

Driver.getWindowHandle();

When the site opens, we need to handle the main window by driver.getWindowHandle(). 
This will handle the current window that uniquely identifies it within this driver instance. Its return type is String.  */		
	//	https://www.browserstack.com/guide/wait-commands-in-selenium-webdriver
// https://www.guru99.com/alert-popup-handling-selenium.html -- pop up handling in selenium		
		
	
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input")).sendKeys("testB22");
		
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[2]/input")).sendKeys("Chandu22@#");
		
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[3]/input")).click();
		
	//	Thread.sleep(100);
		
		
	/// profile ka left section users belongs to whom
		
	//	String heading=driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/p")).getText();
	//	Assert.assertEquals("heading","Welcome testB22");
		
	/*	//Storing the text of the heading in a string
	 * 
    	String heading = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/p")).getText();
    	if(expectedHeading.equalsIgnoreCase(heading))
          	System.out.println("The expected heading is same as actual heading --- "+heading);
    	else
          	System.out.println("The expected heading doesn't match the actual heading --- "+heading); */
		
		
		System.out.println("text");
		
		driver.close();
		
	}

}


/*

package getText;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
 
public class TextThruHeading {
  	
  	WebDriver driver;
  	
  	@BeforeTest
  	public void setUp(){
  	System.setProperty("webdriver.chrome.driver","E:\\Softwares\\chromedriver.exe");
        	driver = new ChromeDriver();
  	}
  	
  	@Test
  	public void headingText(){
        	driver.get("https://phptravels.com/demo/");
        	driver.manage().window().maximize();
        	String expectedHeading = "APPLICATION TEST DRIVE";
        	
        	//Storing the text of the heading in a string
        	String heading = driver.findElement(By.xpath("//div[@class='text']//h2")).getText();
        	if(expectedHeading.equalsIgnoreCase(heading))
              	System.out.println("The expected heading is same as actual heading --- "+heading);
        	else
              	System.out.println("The expected heading doesn't match the actual heading --- "+heading);
  	}
  	@AfterTest
  	public void tearDown(){
        	driver.quit();
        	
        	
        	
        		String txt = driver.switchTo().alert().getText();
              	System.out.println("The text is - " +txt);
        	
        	
        //	https://demoqa.com/ ,, https://the-internet.herokuapp.com/ ,, https://formy-project.herokuapp.com/ ,, https://parabank.parasoft.com/parabank/index.htm,, 
         * http://opencart.abstracta.us/ ,, https://github.com/topics/test-automation-project
        		
        	
  	}
} */




/*  
 *  1) Wait condition how to handle
 *  2) pop up how to handle through multiple windows
 *  3) screenshot how to handle
 *  4) framework architecture
 *  5) gitlab / ci / cd tools analysis
 *  6) webdriver manager and selenium 3 /4 differneces
 *  7) testng and junit setup configuration
 *  8) xpath handling strategy
 *  9) cross browser testing - pom
 *  10) maven lifecyle
 *  11) data providers
 *  12) how to read the data from excel sheet
 *  13) https://automationtestings.com/how-select-multiple-checkbox-selenium/
 *  14) https://stackoverflow.com/questions/51970990/how-to-make-sure-only-one-checkbox-is-enabled-in-selenium
 *  15) real time implementation of oops concepts
 *  16) Postman Tool related -- All the HTTP request Parameters things.
 *  
 *  
 */


/* 
 * starts-with():
This function is used to find a web element whose value of an attribute changes on the refresh or on any other dynamic operation on the web page. 
In this, we match the starting text of the attribute to locate an element whose attribute has changed dynamically.
For Example: On the web page, ID of a particular element changes dynamically such as ‘id1’, ‘id2’, ‘id3’, etc., but the remaining text will be the same.
 *  //img[starts-with(@src,'https')]
 * 
 * 
 * contains():
It is a method used in an XPath expression. When the value of any attribute changes dynamically e.g. login information, this method comes into use. 
It can locate a web element with the available partial text. Let me show you how to use contains() method.
 * //img[contains(@src,’content’)]
 * 
 * 
 * 
 * text():
This expression is used with the text function to locate an element with exact text. Let’s see a small example to use text().
 * //*[text()='Search Google or type a URL']
 * 
 * XPATH Using Following :-
 * XPath axes come in handy when the exact element tagname or its attribute value is dynamic and cannot be used to locate an element. 
 * In such cases locating elements after traversing through child/sibling or parent becomes an easy approach.
 *  //tagname[@attribute=’value’]//following::tagname
 * 
 * 
 * XPath using Following-Sibling
As the term signifies, siblings are those nodes that share the same parent or are at the same level. 
Hence, Following-Sibling will return you the node at the same level and after the current node.

The syntax for using Following-Sibling is

 //tagname[@attribute=’value’]//following-sibiling::tagname


 * XPath using Preceding
In contrast to the Following, this method helps locate all the elements before the current node, as in the preceding element from the current node with XPath in Selenium.

Using Preceding, you can have all the elements before your current node, and by using Index or another chained XPath, you can locate the actual web element.

The syntax for using Preceding is: //tagname[@attribute=’value’]//preceding::tagname
 * 
 * 
 * 
 * XPath using Preceding-Sibling
This is a concept very similar to Following-Siblings. The only difference in functionality is that of preceding. So, here, in contrast to Following-Sibling, 
you get all the nodes that are siblings or at the same level but are before your current node.
 * 
 * //tagname[@attribute=’value’]//preceding-sibling::tagname
 * 
 * XPath using Child
As the name specifies, this approach is used to locate all the child elements of a particular node. For example, 
a basic use case of this approach could be to circulate all the data in a table through the rows.

The Syntax for using Child is: //tagname[@attribute=’value’]//child::tagname

XPath using Parent
This method is used to select the parent node of the current node.

The syntax for using Parent is:

//tagname[@attribute=’value’]/parent::tagname


XPath using Descendants
This method is used for selecting the descendants of the current node. Here, Descendants refer to the child nodes, grandchild nodes, etc.

The syntax for using Descendants is:

//tagname[@attribute=’value’]//descendants::tagname

 * 
 * XPath using Ancestors
This method is used for selecting the ancestors of the current node. Here, Ancestors refer to the parent nodes, grandparent nodes, etc.

The syntax for using Ancestors is:

//tagname[@attribute=’value’]//ancestors::tagname

 * 
 * In XPath, there are seven kinds of nodes: element, attribute, text, namespace, processing-instruction, comment, and document nodes.

XML documents are treated as trees of nodes. The topmost element of the tree is called the root element.
 * 
 * 
 * Predicates
Predicates are used to find a specific node or a node that contains a specific value.

Predicates are always embedded in square brackets.
 * 
 * 
 * Selecting Several Paths
By using the | operator in an XPath expression you can select several paths.
 * 
 * XPath Axes
An axis represents a relationship to the context (current) node, and is used to locate nodes relative to that node on the tree.

AxisName	Result
ancestor	Selects all ancestors (parent, grandparent, etc.) of the current node
ancestor-or-self	Selects all ancestors (parent, grandparent, etc.) of the current node and the current node itself
attribute	Selects all attributes of the current node
child	Selects all children of the current node
descendant	Selects all descendants (children, grandchildren, etc.) of the current node
descendant-or-self	Selects all descendants (children, grandchildren, etc.) of the current node and the current node itself
following	Selects everything in the document after the closing tag of the current node
following-sibling	Selects all siblings after the current node
namespace	Selects all namespace nodes of the current node
parent	Selects the parent of the current node
preceding	Selects all nodes that appear before the current node in the document, except ancestors, attribute nodes and namespace nodes
preceding-sibling	Selects all siblings before the current node
self	Selects the current node
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */








 
 



