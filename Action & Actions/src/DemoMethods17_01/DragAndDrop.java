package DemoMethods17_01;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop
{
  public static void main(String[] args)
  {
	  System.setProperty("webdriver.chrome.driver", "D:\\Cjc Automation 1\\Exe file\\chrome 97\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		String title=driver.getTitle();
		System.out.println("Title is :-"+title);
		
		driver.switchTo().frame(0);
		
		WebElement source=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		
		WebElement target=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		
		Actions action=new Actions(driver);
		
		action.dragAndDrop(source, target).build().perform();
  }
}
