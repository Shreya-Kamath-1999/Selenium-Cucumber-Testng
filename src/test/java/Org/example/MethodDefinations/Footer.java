package Org.example.MethodDefinations;

import Org.example.Bage.PageInstance;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Footer extends PageInstance {

    @FindBy(xpath="//a[contains(text(),'Twitter,)]")
    WebElement twitter;

    @FindBy(xpath="//a[contains(text(),'Facebook,)]")
    WebElement facebook;

    @FindBy(xpath="//a[contains(text(),'LinkedIn,)]")
    WebElement linkedIn;

    public Footer()
    {
        PageFactory.initElements(driver,this); // for @FindBy

    }



}
