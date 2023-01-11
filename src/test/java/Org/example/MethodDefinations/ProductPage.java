package Org.example.MethodDefinations;

import Org.example.Bage.PageInstance;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends PageInstance {
    @FindBy(xpath ="//div[@class='inventory_details_name large_size']")
    WebElement productTitleOnProductsPage;
    @FindBy(xpath = "//button[.='Remove']")
    WebElement removeButton;
    @FindBy(xpath = "//button[.='Add to cart']")
    WebElement addToCartButton;


    public boolean isProductPageDisplayed(String productName) {
        return productTitleOnProductsPage.getText().equals(productName);

    }

    public boolean clickOnAddToCart() {
        Actions action =new Actions(driver);
        action.moveToElement(addToCartButton).click().build().perform();
        return removeButton.isDisplayed();
    }
}
