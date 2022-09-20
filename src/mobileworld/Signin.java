package mobileworld;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;






public class Signin {
@Test(priority=1)



   public void sin1() throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:/Users/Shridhar.ashokkumar/Downloads/chromedriver_win32/chromedriver.exe");
        WebDriver driver =  new ChromeDriver();
        Landingpage landingpage = new Landingpage(driver);
        landingpage.goTo();
        landingpage.loginApplication("shridhar", "shridhar12234");
        driver.findElement(By.xpath("//a[@type='submit']")).click();
        
        



   }



@Test(priority=2)

public void sin2() throws InterruptedException {
    // TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:/Users/Shridhar.ashokkumar/Downloads/chromedriver_win32/chromedriver.exe");
    WebDriver driver =  new ChromeDriver();
    Landingpage landingpage = new Landingpage(driver);
    landingpage.goTo();
    landingpage.loginApplication("shridharshridharshridhar", "shridhar1234566");
    driver.findElement(By.xpath("//a[@type='submit']")).click();
    



}



@Test(priority=3)

public void sin3() throws InterruptedException {
    // TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:/Users/Shridhar.ashokkumar/Downloads/chromedriver_win32/chromedriver.exe");
    WebDriver driver =  new ChromeDriver();
    Landingpage landingpage = new Landingpage(driver);
    landingpage.goTo();
    landingpage.loginApplication("sh", "s1");
    driver.findElement(By.xpath("//a[@type='submit']")).click();




}
@Test(priority=4)
//without data
public void sin4() throws InterruptedException {
    // TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver", "C:/Users/Shridhar.ashokkumar/Downloads/chromedriver_win32/chromedriver.exe");
    WebDriver driver =  new ChromeDriver();
    Landingpage landingpage = new Landingpage(driver);
    landingpage.goTo();
    landingpage.loginApplication("", "");
    driver.findElement(By.xpath("//a[@type='submit']")).click();
    



}



   
            
    
}