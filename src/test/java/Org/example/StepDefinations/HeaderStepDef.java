package Org.example.StepDefinations;

import Org.example.MethodDefinations.Header;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;

public class HeaderStepDef {
    Header header=new Header();
    @Given("the user has logged in")
    public void theUserHasLoggedIn() {

    }

    @And("I verify menu icon")
    public void iVerifyMenuIcon() {
        Assert.assertTrue(header.verifyMenuIcon(),"Menu is not displayed");
    }

    @And("I verify header logo")
    public void iVerifyHeaderLogo() {
        Assert.assertTrue(header.verifyHeaderLogo(),"Logo is not displayed");
    }

    @And("I verify Add to Cart icon")
    public void iVerifyAddToCartIcon() {
        Assert.assertTrue(header.verifyCartIcon(),"Cart icon not displayed");

    }

    @And("I click on cart button on the header")
    public void iClickOnCartButtonOnTheHeader() {
        header.clickOnCartButton();

    }
}
