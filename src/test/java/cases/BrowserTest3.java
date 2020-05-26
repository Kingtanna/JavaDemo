package cases;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest3 {

    WebDriver dr;

    @Parameters({"driver","url"})
    @BeforeTest
    public void setup(String driver, String url)
    {
//        System.setProperty("webdriver.chrome.driver","/Users/jytu/Documents/selfLearning/Java/Driver/chromedriver");
//        WebDriver dr = new ChromeDriver();
        String str1 = "";
        String str2 = "";
        if(driver.equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","/Users/jytu/Documents/selfLearning/Java/Driver/chromedriver");
            dr = new ChromeDriver();
        }
        else if(driver.equals("firefox"))
        {

            System.setProperty("webdriver.gecko.driver","/Users/jytu/Documents/selfLearning/Java/Driver/geckodriver");
            dr = new FirefoxDriver();
        }
        else{
            System.out.println("浏览器不支持");
        }
        //System.setProperty("webdriver.gecko.driver","/Users/jytu/Documents/selfLearning/Java/Driver/geckodriver");
        //System.setProperty(str1,str2);


        dr.manage().window().maximize();
        dr.get(url);
    }


    @Test
    public void browser(){

        dr.findElement(By.id("kw")).clear();
        dr.findElement(By.id("kw")).sendKeys("selenium");
        dr.findElement(By.id("su")).click();
    }


    @Test(priority = 2)
    public void arowser2() throws InterruptedException{
        Thread.sleep(5000);
        dr.findElement(By.id("kw")).clear();
        dr.findElement(By.id("kw")).sendKeys("selenium");
        dr.findElement(By.id("su")).click();
    }
    public void close()
    {
        dr.quit();
    }
}
