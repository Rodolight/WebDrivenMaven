import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class loginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		//FOR BEST FUCNTION THE DRIVER MUST BE LOCATED ON /usr/local/bin folder 
		driver = new FirefoxDriver();
	}
	
	@Test
	public void doLogin() {
		driver.get("http://gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("rodoldo.depena@gmail.com");
		driver.findElement(By.className("zQJV3")).click();
		driver.findElement(By.name("password")).sendKeys("Dominic@na065");
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}
	

}
