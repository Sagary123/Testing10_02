package TaskBall;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ball 
{
   public static void main(String[] args)
   {

	   System.setProperty("webdriver.chrome.driver", "D:\\Cjc Automation 1\\Exe file\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://javascript.info/mouse-drag-and-drop");
		
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		List<WebElement> frame=driver.findElements(By.tagName("iframe"));
		System.out.println("Total frame is :-" +frame.size());
		
		WebElement fr=driver.findElement(By.className("code-tabs__result"));
		driver.switchTo().frame(fr);
		
		WebElement source=driver.findElement(By.xpath("//*[@id=\"ball\"]"));
		
		WebElement target=driver.findElement(By.xpath("//*[@id=\"gate\"]"));
		
		Actions action=new Actions(driver);
		
		action.dragAndDrop(source, target).build().perform();
   }
}
