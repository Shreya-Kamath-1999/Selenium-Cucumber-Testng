package Org.example.StepDefinations;

import Org.example.MethodDefinations.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class CheckoutPageStepDef {

    CheckoutPage checkout=new CheckoutPage();
    @Then("I verify checkout page {string} is displayed")
    public void iVerifyCheckoutPageIsDisplayed(String pageNumber) {
        Assert.assertTrue(checkout.verifyCheckoutPage(pageNumber),"Checkout Page is not displayed");

    }

    @And("I click on Continue button on checkout page1")
    public void iClickOnContinueButtonOnCheckoutPage() {
        checkout.clickOnContinueButton();
    }

    @And("I Click on finish on checkout page2")
    public void iClickOnFinishOnCheckoutPage() {
        checkout.clickOnFinishButton();
    }

    @Then("back home button is displayed on checkout page3")
    public void backHomeButtonIsDisplayedOnCheckoutPage() throws InterruptedException {
        Assert.assertTrue(checkout.isBackToHomeButtonDisplayed(),"Back to home page is not displayed");
    }

    @And("I add {string} {string} {string} on checkout page1")
    public void iAddOnCheckoutPage(String firstname, String lastname, String postalcode) throws InterruptedException {
        checkout.addFieldsOnCheckoutPage(firstname,lastname,postalcode);

    }

    @Then("I verify payment and shipping information section is displayed on checkout page2")
    public void iVerifyPaymentAndShippingInformationSectionIsDisplayedOnCheckoutPage() throws InterruptedException {
        Assert.assertEquals(checkout.verifyPayment(),"SauceCard #31337");
        Assert.assertEquals(checkout.verifyShipping(),"FREE PONY EXPRESS DELIVERY!");

    }
}
