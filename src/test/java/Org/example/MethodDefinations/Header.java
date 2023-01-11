package Org.example.MethodDefinations;

import Org.example.Bage.PageInstance;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Header extends PageInstance {

    @FindBy(xpath="//div[@class='bm-burger-button']")
    WebElement menu;

    @FindBy(xpath="//div[@class='app_logo']")
    WebElement logo;

    @FindBy(xpath="//a[@class='shopping_cart_link']")
    WebElement cart;

    public Header(){
        PageFactory.initElements(driver,this);
    }

    public boolean verifyMenuIcon() {
        return menu.isDisplayed();
    }

    public boolean verifyHeaderLogo() {
        return logo.isDisplayed();
    }

    public boolean verifyCartIcon() {
        return cart.isDisplayed();
    }

    public void clickOnCartButton() {
        cart.click();
    }
}
