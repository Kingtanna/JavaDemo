package cases;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest2 {

    WebDriver dr;

    @BeforeTest
    public void setup()
    {
//        System.setProperty("webdriver.chrome.driver","/Users/jytu/Documents/selfLearning/Java/Driver/chromedriver");
//        WebDriver dr = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver","/Users/jytu/Documents/selfLearning/Java/Driver/geckodriver");
        dr = new FirefoxDriver();

        dr.manage().window().maximize();
        dr.get("https://www.baidu.com");
    }

    @Test
    public void browser(){
        dr.findElement(By.id("kw")).clear();
        dr.findElement(By.id("kw")).sendKeys("selenium");
        dr.findElement(By.id("su")).click();
    }

    public void close()
    {
        dr.quit();
    }
}
