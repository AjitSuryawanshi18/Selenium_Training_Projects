package selenium_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\AUTOMATION\\SELENIUM\\DRIVERS\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        
        driver.get("https://www.letskodeit.com/practice");
        
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        
        WebElement element= driver.findElement(By.cssSelector("select#carselect"));    //css selector
        
        Select dropdown = new Select(element);  // for dropdown used select class
		dropdown.selectByIndex(1);
        Thread.sleep(2000);
		dropdown.selectByValue("honda");
        Thread.sleep(2000);
		dropdown.selectByVisibleText("BMW");
        Thread.sleep(2000);

        driver.quit();
	}

}
