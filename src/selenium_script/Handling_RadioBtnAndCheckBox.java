package selenium_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Handling_RadioBtnAndCheckBox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\AUTOMATION\\SELENIUM\\DRIVERS\\chromedriver.exe");
        ChromeOptions co=new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver =new ChromeDriver(co);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        
        driver.get("https://www.letskodeit.com/practice");
        
       WebElement bmwRadio= driver.findElement(By.xpath("//input[@id='bmwradio']"));
       bmwRadio.click();
       boolean bmwRadioStatus=bmwRadio.isSelected();
       System.out.println(bmwRadioStatus);
       
       Thread.sleep(2000);
       
       WebElement benzRadio= driver.findElement(By.xpath("//input[@id='benzradio']"));
       benzRadio.click();
       boolean benzRadioStatus=benzRadio.isSelected();
       System.out.println(benzRadioStatus);
       
       Thread.sleep(2000);
       
       WebElement bmwcheck= driver.findElement(By.xpath("//input[@id='bmwcheck']"));
       bmwcheck.click();
       boolean bmwcheckStatus=benzRadio.isSelected();
       System.out.println(bmwcheckStatus);
       
       Thread.sleep(3000);
       WebElement hondacheck= driver.findElement(By.xpath("//input[@id=\"hondacheck\"]"));
       hondacheck.click();
       boolean hondacheckStatus=benzRadio.isSelected();
       System.out.println(hondacheckStatus);
       
       Thread.sleep(3000);
       
       
       driver.quit();
       
	}

}
