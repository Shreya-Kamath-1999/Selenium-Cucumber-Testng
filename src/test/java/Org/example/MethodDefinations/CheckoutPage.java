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
                return secondaryHeaderTitle.getText().equals("CHECKOUT: YOUR INFORMATION");
            case "2":
                return secondaryHeaderTitle.getText().equals("CHECKOUT: OVERVIEW");

            case "3":
                return secondaryHeaderTitle.getText().equals("CHECKOUT: COMPLETE!");
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

    public boolean isBackToHomeButtonDisplayed() throws InterruptedException {
        Thread.sleep(2000);
        return backHomeButton.isDisplayed();
    }

    public void addFieldsOnCheckoutPage(String firstname, String lastname, String postalcode) throws InterruptedException {
        FirstName.sendKeys(firstname);
        Thread.sleep(2000);
        LastName.sendKeys(lastname);
        Thread.sleep(2000);
        Postalcode.sendKeys(postalcode);
        Thread.sleep(2000);
    }

    public String verifyPayment() throws InterruptedException {
        Thread.sleep(2000);
        return payment.getText();
    }

    public String verifyShipping() {
        return shipping.getText();
    }
}
