package examples;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91978\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://letcode.in/windows");
		driver.manage().window().maximize();
		driver.findElement(By.id("home")).click();
		String windowhandle=driver.getWindowHandle();
		System.out.println(windowhandle);
		Set<String> whs=driver.getWindowHandles();
		System.out.println(whs);
		List<String>list=new ArrayList<String>(whs);
		driver.switchTo().window(list.get(0));
		System.out.println(driver.getCurrentUrl());
		driver.close();
	
		
		
		
	
		
		
		

	}

}
