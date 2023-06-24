package test_intelli.test4;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
/**
 * Hello world!
 *
 */
public class App 
{
	 WebDriver driver;
     
     public void test1()
     {
     System.setProperty("webdriver.chrome.driver","C:\\");


                   driver = new ChromeDriver();

                  driver.get("http://www.facebook.com");
                  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("helloworld@gmail.com");
                  driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("helloworld123");
                  driver.findElement(By.xpath("//input[@id='u_0_2']")).click();
       }
     
     public void test2()
     {
     System.setProperty("webdriver.chrome.driver","C:\\");


                   driver = new ChromeDriver();

                  driver.get("http://www.intellipat.com");
                  driver.findElement(By.xpath("serch bar")).click();
                  driver.findElement(By.xpath("search bar")).sendKeys("");
                  driver.findElement(By.xpath("search button")).click();
                  driver.findElement(By.xpath("element you want to find")).click();
                  
                  String actual="";
                  String value= driver.findElement(By.xpath("element you want to find"));
                  Assert.assertEquals(actual, value);
                  System.out.println("Test is executing");
                  }
     
	
}
