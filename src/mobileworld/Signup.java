
package mobileworld;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Signup{
    WebDriver driver;
    @BeforeMethod
    public void verify( )
    {
        System.setProperty("webdriver.chrome.driver","C:/Users/Shridhar.ashokkumar/Downloads/chromedriver_win32/chromedriver.exe");
         driver = new ChromeDriver();
        
         driver.get("https://mobileworld.banyanpro.com/");
         driver.findElement(By.cssSelector("button[type='submit']")).click();
         driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();
    }
         @Test(dataProvider = "datasets")
         public void testdata(String Fname,String Lname,String Email,String passwrd,String number,String date,String bio) throws InterruptedException
         {
         driver.findElement(By.cssSelector("#myName")).sendKeys(Fname);
      
         driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys(Lname);
         driver.findElement(By.cssSelector("input[placeholder='Enter Email']")).sendKeys(Email);
         driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(passwrd);
         driver.findElement(By.cssSelector("input[placeholder='91XXXXXXXXXX']")).sendKeys(number);
        
         driver.findElement(By.xpath("//input[@type='date']")).sendKeys(date);
         driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys(bio);
         driver.findElement(By.xpath("//div[@class='col-md-2']//input[@name='gender']")).click();
         driver.findElement(By.xpath("//button[@type='submit']")).click();
         Thread.sleep(1000);
         driver.quit();
    }
         
         
         @DataProvider(name = "datasets")
         public Object[][] datasets(){
             Object[][] data = {{"shridhar","psk","shridhar@gmail.com","shridhar@123","1234567898","05/20/2022","qwertyuiopasdfghjkl"},
                                {"sa","sa","shridhar@gmail","sa","dfghggffd","05/20/2000",""},
                                {"rasdfghjkihugytrsdfgh","raqwertyuiiiiiiiiiiopppppppppo","shridhar@gmail","Raaghab243626@#$%&HRRt","shridhar@gmail.com","05/22/2000","1234567"},
                                {"shridhar","shr","shridhar@gmail.com","karthik@123","123445566666","05/20/2022","hey"},
                                {"shridhar","shr","@gmail.com","san@123","123445566666","05/20/2000","hey"},
                                {"shridhar","shr","shridhar@gmail.com","s1@","12334444555","05/20/2000","hey"},
                                {"shridhar","shr","shridhar@gmail.com","s1@wh33h","12334444555","05/20/2022","hey"},
                                    {"shridhar","shr","shridhar@gmail.com","s","12334444555","05/20/2022","hey"},
                                    {"shridhar","shr","shridhar@gmail.com","s1@aw2@!wssssjjj","12334444555","05/20/2022","hey"},
                                    {"shridhar","shr","shridhar@gmail.com","s1@","12334444555","05/20/2022","hey"},
                                    {"shridhar","shr","shridhar@gmail.com","s1@","12334444555","05/20/2021","hey"},
                                    {"shridhar","shr","shridhar@gmail.com","s1@","9870915101","05/20/2022","hey"},
                                    {"shridhar","shr","shridhar@gmail.com","s1@","12334444555123433","05/20/2022","hey"},
                                    {"shridhar","shr","shridhar@gmail.com","s1@","12334$%4555","05/20/2022","hey"}};                               
             return data;
             
         }
     }