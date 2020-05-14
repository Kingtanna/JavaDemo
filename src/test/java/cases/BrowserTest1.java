package cases;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest1 {
    @Test
    public void browser(){
//        System.setProperty("webdriver.chrome.driver","/Users/jytu/Documents/selfLearning/Java/Driver/chromedriver");
//        WebDriver dr = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver","/Users/jytu/Documents/selfLearning/Java/Driver/geckodriver");
        WebDriver dr = new FirefoxDriver();

        dr.manage().window().maximize();

        dr.get("");
        dr.findElement(By.id("kw")).clear();
        dr.findElement(By.id("kw")).sendKeys("selenium");
        dr.findElement(By.id("su")).click();
        dr.quit();

    }
}
