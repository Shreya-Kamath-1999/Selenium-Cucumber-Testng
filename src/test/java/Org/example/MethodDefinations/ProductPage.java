package Org.example.MethodDefinations;

import Org.example.Bage.PageInstance;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage extends PageInstance {
    @FindBy(xpath ="//div[@class='inventory_details_name large_size']")
    WebElement productTitleOnProductsPage;
    @FindBy(xpath = "//button[.='Remove']")
    WebElement removeButton;
    @FindBy(xpath = "//button[.='Add to cart']")
    WebElement addToCartButton;

    public ProductPage(){
        PageFactory.initElements(driver,this);
    }


    public boolean isProductPageDisplayed(String productName) throws InterruptedException {
        Thread.sleep(2000);
        return productTitleOnProductsPage.getText().equals(productName);


    }

    public boolean clickOnAddToCart() throws InterruptedException {
        Actions action =new Actions(driver);
        action.moveToElement(addToCartButton).click().build().perform();
        Thread.sleep(2000);
        return removeButton.isDisplayed();

    }
}
