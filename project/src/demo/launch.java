package demo;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class launch 
{
	@Test
	public void demmo1() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://mobileworld.azurewebsites.net/");
		samplesignup ns=new samplesignup (driver);
	ns.signin().click();
	ns.signup().click();
	ns.firstname().sendKeys("nithi");
	ns.lastname().sendKeys("N");
	ns.emailid().sendKeys("nithi@gmail.com");
	ns.password().sendKeys("nithi3460");
	ns.date().sendKeys("09/03/1999");
	ns.genderF().click();
	ns.phone().sendKeys("7259570711");
	ns.bio().sendKeys(" iam graduate engineering trainee" );
	
	ns.N().click();
	driver.switchTo().alert().accept();
	Thread.sleep(2000);
	ns.S().click();
	driver.switchTo().alert().accept();



	 samplesignin  Mw=new  samplesignin (driver);
	Mw.username().sendKeys("nithi");
	Mw.password().sendKeys("nithi@123");
	Thread.sleep(1000);
	Mw.submit().click();
	
	

	 sampleorder op=new  sampleorder(driver);
	 op.select().click();
	 op.order().click();
	Set<String> window = driver.getWindowHandles();
	List<String> list= new ArrayList<String>(window);
	driver.switchTo().window(list.get(1));
	op.firstname().sendKeys("nithi");
	op.lastname().sendKeys("n");
	op.emailid().sendKeys("nithi@gmail.com");
	op.password().sendKeys("nithi6570");
	op.gender().click();
	op.number().sendKeys("7259570711");
	op.address1().sendKeys("2nd cross");
	op.address2().sendKeys("subramanya nagar,bangaloe");
	op.city().sendKeys("tmkur");
	op.state().click();
	Select option=new Select(op.state());
	option.selectByIndex(1);
	op.zip().sendKeys("572107");
	op.apple().click();
	op.count().sendKeys("2");
	op.dropyes().click();
	op.clickNO().click();
	op.check1().click();
	op.check2().click();
	op.ordernow().click();
	op.popup().click();
}
}
