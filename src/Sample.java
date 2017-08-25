import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Sample {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ROHIT\\Desktop\\geckodriver-v0.11.1-win64\\geckodriver.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		
		try{
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.conferr.com/web/app/home");
		driver.findElement(By.linkText("LOGIN")).click();
		driver.findElement(By.id("username")).sendKeys("ravi22@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("bcp12345");
		driver.findElement(By.cssSelector("submitLoginForm=true; loginForm.$invalid ? '': login"));

		

		Thread.sleep(1800);
	}catch(Exception e){
		
		System.out.println(e);
	}
	

  }

}
;