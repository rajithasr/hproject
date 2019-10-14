package com.loginpages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class logintest {
	@Test
	public void login()
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\home\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://newtours.demoaut.com/mercurysignon.php");
	driver.findElement(By.xpath("//a[text()='SIGN-ON']")).click();
	driver.findElement(By.name("userName")).sendKeys("nanisr");
	driver.findElement(By.name("password")).sendKeys("12345");
	driver.findElement(By.name("login")).click();
}
}