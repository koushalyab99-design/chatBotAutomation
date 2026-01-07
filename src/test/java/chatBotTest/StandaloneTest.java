package chatBotTest;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class StandaloneTest {

    public static void main(String[] args) {

    	ChromeOptions options = new ChromeOptions();
    	options.setAcceptInsecureCerts(true);
    
    	WebDriver driver = new ChromeDriver(options);

    	driver.manage().window().maximize();
    	//added comments
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    	driver.get("https://www.tvscredit.com/get-in-touch/");
    	
    	driver.findElement(By.id("ymDivBar")).click();
    	
    	driver.switchTo().frame("ymIframe");
    	
    	driver.findElement(By.xpath("//div[text()='New Customer']")).click();
    	
    	driver.findElement(By.xpath("//div[text()='Two-Wheeler Loans']")).click();
    	
    	driver.findElement(By.xpath("//div[text()='Eligibility Document']")).click();
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	
    	js.executeScript("document.querySelector('#chatBoxMain').scrollBy(0,100)");
    	


    }
}
