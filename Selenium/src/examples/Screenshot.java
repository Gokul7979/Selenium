package examples;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot {

	public static void main(String[] args) throws IOException, InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\Users\\91978\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    Thread.sleep(2000);
    driver.manage().window().maximize();
    File f =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    Files.copy(f,new File("C:\\Users\\91978\\OneDrive\\Desktop\\complete.png"));
    

	}

}
