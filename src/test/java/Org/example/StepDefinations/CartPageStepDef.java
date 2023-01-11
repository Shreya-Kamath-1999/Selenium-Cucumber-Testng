package Org.example.StepDefinations;

import Org.example.MethodDefinations.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CartPageStepDef {

    CartPage cartpage=new CartPage();
    @Then("Cart page is displayed")
    public void cartPageIsDisplayed() {
        Assert.assertTrue(cartpage.isTitleDisplayed(),"Title not displayed");

    }

    @And("I click on checkout button")
    public void iClickOnCheckoutButton() {
        cartpage.clickOnCheckButton();
    }
}
