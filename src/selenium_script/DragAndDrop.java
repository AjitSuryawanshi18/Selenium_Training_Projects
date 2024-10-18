package selenium_script;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\AUTOMATION\\SELENIUM\\DRIVERS\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        driver.get("https://jqueryui.com/droppable/");
        
        driver.switchTo().frame(0); //switching to iframe to perform desired actions
        
        Actions action= new Actions(driver);
        
        WebElement webelement = driver.findElement(By.xpath("//*[@id='draggable']"));
        WebElement webelement1 = driver.findElement(By.xpath("//*[@id='droppable']"));
        
        action.clickAndHold(webelement).pause(Duration.ofSeconds(5))
              .moveToElement(webelement1).pause(Duration.ofSeconds(2))
              .release().build().perform();
        
        driver.quit();
	}

}
