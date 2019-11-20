package Jenkin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenApps {
	
	@Test
	public void openapp()
	{
		System.setProperty("webdriver.chrome.driver","D:/ChromeDriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
	}
	

}
