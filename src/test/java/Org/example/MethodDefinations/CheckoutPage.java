package Org.example.MethodDefinations;

import Org.example.Bage.PageInstance;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage extends PageInstance {
    @FindBy(xpath="//div[@class='header_secondary_container']/span")
    WebElement secondaryHeaderTitle;

    @FindBy(xpath="//input[@id='continue']")
    WebElement continueButton;

    @FindBy(xpath="//button[@id='finish']")
    WebElement finishButton;

    @FindBy(xpath="//button[@id='back-to-products']")
    WebElement backHomeButton;

    @FindBy(xpath="//input[@class='input_error form_input' and @id='first-name']")
    WebElement FirstName;

    @FindBy(xpath="//input[@class='input_error form_input' and @id='last-name']")
    WebElement LastName;

    @FindBy(xpath="//input[@class='input_error form_input' and @id='postal-code']")
    WebElement Postalcode;

    @FindBy(xpath="(//div[@class='summary_value_label'])[1]")
    WebElement payment;

    @FindBy(xpath="(//div[@class='summary_value_label'])[2]")
    WebElement shipping;

    public CheckoutPage()
    {
        PageFactory.initElements(driver,this); // for @FindBy

    }

    public boolean verifyCheckoutPage(String pageNumber) {
        switch (pageNumber) {
            case "1":
                return secondaryHeaderTitle.getText().equals("Checkout: Your Information");
            case "2":
                return secondaryHeaderTitle.getText().equals("Checkout: Overview");

            case "3":
                return secondaryHeaderTitle.getText().equals("Checkout: Complete!");
            default:
                System.out.println("Invalid option");
        }

        return false;
    }

    public void clickOnContinueButton() {
        continueButton.click();
    }

    public void clickOnFinishButton() {
        finishButton.click();
    }

    public boolean isBackToHomeButtonDisplayed() {
         return backHomeButton.isDisplayed();
    }

    public void addFieldsOnCheckoutPage(String firstname, String lastname, String postalcode) {
        FirstName.sendKeys(firstname);
        FirstName.sendKeys(lastname);
        FirstName.sendKeys(postalcode);
    }

    public String verifyPayment() {
        return payment.getText();
    }

    public String verifyShipping() {
        return shipping.getText();
    }
}
