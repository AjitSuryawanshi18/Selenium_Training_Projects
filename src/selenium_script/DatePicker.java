package selenium_script;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DatePicker {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\Software Testing\\AUTOMATION\\SELENIUM\\DRIVERS\\chromedriver.exe");
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(co);
        
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        
        
        driver.switchTo().frame(0);
        Thread.sleep(2000);
        
        driver.findElement(By.xpath("//input[@id='datepicker']")).click();
        
        //expected date picker
        String Expected_Date="18";
        String Expected_Month="July";
        String Expected_Year="1999";
        
        
//        Actual date 
        boolean run=true;
        while(run) {
        String calender_month=driver.findElement(By.xpath("//*[@class=\"ui-datepicker-month\"]")).getText();
        String calender_year=driver.findElement(By.xpath("//*[@class=\"ui-datepicker-year\"]")).getText();
        
        System.out.println("Month : "+calender_month +" --> "+" Year "+ calender_year);
        
        if(calender_month.equalsIgnoreCase(Expected_Month) & calender_year.equalsIgnoreCase(Expected_Year))
        {
        	driver.findElement(By.xpath("//a[@data-date='18']")).click();
        	run=false;
        	
        }else {
        	driver.findElement(By.xpath("//*[@class=\"ui-icon ui-icon-circle-triangle-w\"]")).click();

        }
        
        }
        
        driver.quit();
	}
}
