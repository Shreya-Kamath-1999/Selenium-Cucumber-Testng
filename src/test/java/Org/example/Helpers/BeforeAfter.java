package Org.example.Helpers;

import Org.example.Bage.PageInstance;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import Org.example.Helpers.ConfigReader;
import Org.example.Helpers.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BeforeAfter extends PageInstance {
    //   Stating point
    @Before
    public void beforescenarios() {
        try{
            Driver.setWebDriver();
            PageInstance.driver=Driver.getDriver();
            PageInstance.driver.manage().window().maximize();
            PageInstance.driver.get(ConfigReader.URL);

            WebElement username = driver.findElement(By.xpath("//input[@type='text' and @id='user-name']"));
            WebElement password = driver.findElement(By.xpath("//input[@type='password' and @id='password']"));
            WebElement login = driver.findElement(By.xpath("//input[@type='submit' and @id='login-button']"));

            System.out.println("Typing Username");
            username.sendKeys(ConfigReader.USERNAME);

            System.out.println("Typing password");
            password.sendKeys(ConfigReader.PASSWORD);

            System.out.println("Clicking login button");
            login.click();

            Thread.sleep(5000);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

    }
    @After
    public void afterscenarios()
    {
        PageInstance.driver.quit();
    }

}
