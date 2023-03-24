package examples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Adactin {
	public static void main(String[] args) throws InterruptedException{
     System.setProperty("webdriver.edge.driver", "C:\\Users\\91978\\eclipse-workspace\\Selenium\\Driver\\msedgedriver.exe");
     WebDriver driver=new EdgeDriver();
    driver.get("https://adactinhotelapp.com/");
    driver.manage().window().maximize();
  WebElement a=driver.findElement(By.id("username"));
    a.sendKeys("Gokul7979");
  Thread.sleep(2000);
    WebElement aa=driver.findElement(By.id("password"));
    aa.sendKeys("Gokul123");
   WebElement as= driver.findElement(By.name("login"));
   as.click();
 
   Thread.sleep(2000);
   WebElement b=driver.findElement(By.id("location")); 
   b.sendKeys("London");
   
   WebElement c=driver.findElement(By.id("hotels")); 
   c.sendKeys("Hotel Sunshine");
   
   WebElement d= driver.findElement(By.id("room_type")); 
   d.sendKeys ("Super Deluxe");
   
   WebElement e= driver.findElement(By.id("room_nos")); 
   e.sendKeys ("2-Two ");
  
   WebElement f= driver.findElement(By.id("datepick_in")); 
   f.sendKeys ("23/03/2023");
  
   WebElement g= driver.findElement(By.id("datepick_out")); 
   g.sendKeys ("24/03/2023" );
    
   WebElement h= driver.findElement(By.id("adult_room")); 
   h.sendKeys ("4-Four");
   
   WebElement i= driver.findElement(By.id("child_room")); 
   i.sendKeys ("1-One");
   
   WebElement go= driver.findElement(By.name("Submit"));
   go.click();
   
   Thread.sleep(2000);
   WebElement ku= driver.findElement(By.name("radiobutton_0"));
   ku.click();
   
   WebElement lu= driver.findElement(By.name("continue"));
   lu.click();
   
   
   
   Thread.sleep(2000);
   WebElement j= driver.findElement(By.id("first_name")); 
   j.sendKeys ("Gokul");
   
   WebElement k= driver.findElement(By.id("last_name")); 
   k.sendKeys ("Sri"); 
   
   WebElement l= driver.findElement(By.id("address")); 
   l.sendKeys ("Chennai");
   
   WebElement m= driver.findElement(By.id("cc_num")); 
   m.sendKeys ("1234567812345678");
   
   WebElement N= driver.findElement(By.id("cc_type")); 
   N.sendKeys ("VISA");
   
   WebElement o= driver.findElement(By.id("cc_exp_month")); 
   o.sendKeys ("July");
   
   WebElement p= driver.findElement(By.id("cc_exp_year")); 
   p.sendKeys ("2022");
   
   WebElement q= driver.findElement(By.id("cc_cvv")); 
   q.sendKeys ("123");
   
   WebElement na= driver.findElement(By.name("book_now"));
   na.click();
   
  WebElement sg= driver.findElement(By.id("logout"));
   sg.click();
   
	}


}
