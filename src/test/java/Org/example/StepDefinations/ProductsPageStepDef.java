package Org.example.StepDefinations;

import Org.example.MethodDefinations.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class ProductsPageStepDef {

    ProductPage productpage=new ProductPage();
    @Then("Product page of {string} is displayed")
    public void productPageOfIsDisplayed(String productName) throws InterruptedException {
        Assert.assertTrue(productpage.isProductPageDisplayed(productName),"Products does not match");
    }

    @And("I click on add to cart button on product page")
    public void iClickOnAddToCartButtonOnProductPage() throws InterruptedException {
        Assert.assertTrue(productpage.clickOnAddToCart(),"Failed adding to cart");
    }
}
