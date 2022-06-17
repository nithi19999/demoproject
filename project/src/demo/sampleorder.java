package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class sampleorder
{
	WebDriver driver;
	public  sampleorder(WebDriver driver)
	{
		this.driver=driver;
	}
		By select=By.xpath("(//a[@id='navbarDropdown'])[2]");

		By order=By.xpath("//a[text()='Order']");

		By firstname=By.xpath("(//input[@id='inputFirstName'])[1]");

		By lastname=By.xpath("(//input[@id='inputFirstName'])[2]");

		By emailid=By.xpath("//input[@id='inputEmail']");

		By password=By.xpath("//input[@id='inputPassword']");

		By gender=By.xpath("//div[@class='form-check col-md-2']");

		By number=By.xpath("//input[@type='number']");

		By address1=By.xpath("//input[@placeholder='12 Apartment or floor']");

		By address2=By.xpath("//input[@placeholder='Main St']");

		By city=By.xpath("//input[@id='inputCity']");

		By state=By.xpath("//select[@id='inputState']");

		By zip=By.xpath("//input[@id='inputZip']");

		By apple=By.xpath("//input[@rel='apple']");

		By count=By.xpath("//input[@placeholder='no of mobiles']");

		By dropyes=By.xpath("//select[@id='bought']");

		By clickNO=By.xpath("//option[@value='0']");

		By check1=By.xpath("(//input[@id='gridCheck1'])[1]");

		By check2=By.xpath("(//input[@id='gridCheck1'])[2]");

		By ordernow=By.xpath("//button[@class='btn btn-primary']");

		By popup=By.xpath("//a[@class='btn btn-secondary']");

		public WebElement select()
		{
		return driver.findElement(select);
		}
		public WebElement order()
		{
		return driver.findElement(order);
		}
		public WebElement firstname()
		{
		return driver.findElement(firstname);
		}
		public WebElement lastname()
		{
		return driver.findElement(lastname);
		}
		public WebElement emailid()
		{
		return driver.findElement(emailid);
		}
		public WebElement password()
		{
		return driver.findElement(password);
		}
		public WebElement gender()
		{
		return driver.findElement(gender);
		}
		public WebElement number()
		{
		return driver.findElement(number);
		}
		public WebElement address1()
		{
		return driver.findElement(address1);
		}
		public WebElement address2()
		{
		return driver.findElement(address2);
		}
		public WebElement city()
		{
		return driver.findElement(city);
		}
		public WebElement state()
		{
		return driver.findElement(state);
		}
		public WebElement zip()
		{
		return driver.findElement(zip);
		}
		public WebElement apple()
		{
		return driver.findElement(apple);
		}
		public WebElement count()
		{
		return driver.findElement(count);
		}
		public WebElement dropyes()
		{
		return driver.findElement(dropyes);
		}
		public WebElement clickNO()
		{
		return driver.findElement(clickNO);
		}
		public WebElement check1()
		{
		return driver.findElement(check1);
		}
		public WebElement check2()
		{
		return driver.findElement(check2);
		}
		public WebElement ordernow()
		{
		return driver.findElement(ordernow);
		}
		public WebElement popup()
		{
		return driver.findElement(popup);
		
}}