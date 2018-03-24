package learnJenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RediffSearch {

	@Test
	public void loginTest() throws InterruptedException {
		WindowsUtils.killByName("geckodriver.exe");
		WindowsUtils.killByName("conhost.exe");	
		System.setProperty("webdriver.gecko.driver", "D:\\selenium-drivers\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://www.rediff.com/");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		dr.findElement(By.xpath(".//*[@id='signin_info']/a[1]")).click();
		Thread.sleep(5000);
		//dr.findElement(By.xpath(".//*[@id='login1']")).sendKeys("");
		//dr.findElement(By.xpath(".//*[@id='password']")).sendKeys("");
	        Console.log("======= Github - Jenkins========")
		dr.quit();
		
		
	}
}
