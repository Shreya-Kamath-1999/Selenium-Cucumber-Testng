package Org.example.MethodDefinations;

import Org.example.Bage.PageInstance;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage extends PageInstance {
    @FindBy(xpath="//span[text()='Your Cart']")
    WebElement cartPageTitle;

    @FindBy(xpath="//button[@id='checkout']")
    WebElement checkoutButton;

    public CartPage(){
        PageFactory.initElements(driver,this);
    }


    public boolean isTitleDisplayed() {
        return cartPageTitle.isDisplayed();
    }

    public void clickOnCheckButton() throws InterruptedException {
        Thread.sleep(2000);
        checkoutButton.click();

    }
}
