package DemoMethods17_01;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoMethods
{
  public static void main(String[] args)
  {
	    System.setProperty("webdriver.chrome.driver", "D:\\Cjc Automation 1\\Exe file\\chrome 97\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println("Title is :-"+title);
		
		List<WebElement> list=driver.findElements(By.tagName("a"));
		int count=list.size();
		System.out.println("Total hyperlink is :-"+count);
		
		//Double click
		WebElement doubleclik=driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
		Actions actions=new Actions(driver);
		actions.doubleClick(doubleclik).build().perform();
		
		//return back
		driver.navigate().back();
		
		//right click
		WebElement rightclick=driver.findElement(By.linkText("Home & Kitchen"));
		Actions actions1=new Actions(driver);
		actions1.contextClick(rightclick).build().perform();
		
		System.out.println("Sucess");
  }
}
