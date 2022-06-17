package demo;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class samplesignin 
	{
		WebDriver driver;
		public  samplesignin  (WebDriver driver)
		{
		this.driver=driver;
		}
		By username=By.id("username");
		By password=By.id("password");
		By proceed=By.xpath("//a[@type='submit']");
		By click=By.xpath("//button[text()='SIGN IN']");
		public WebElement username()
		{
		return driver.findElement(username);
		}
		public WebElement password()
		{
		return driver.findElement(username);
		}
		public WebElement submit()
		{
		return driver.findElement(proceed);
		}
		public WebElement click()
		{
		return driver.findElement(click);
		}

		}

