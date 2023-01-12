package Org.example.StepDefinations;

import Org.example.MethodDefinations.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;
import Org.example.MethodDefinations.Footer;

public class FooterStepDef {
    
    Footer footer=new Footer();
    @And("I verify Twitter icon on the footer")
    public void iVerifyTwitterIcon() {
        Assert.assertTrue(footer.verifyTwitterIcon(),"Twitter icon not displayed");

    }

    @And("I verify Facebook icon on the footer")
    public void iVerifyFacebookIcon() {
        Assert.assertTrue(footer.verifyFacebookIcon(),"Facebook icon not displayed");
    }

    @And("I verify LinkedIn icon on the footer")
    public void iVerifyLinkedInIcon() {
        Assert.assertTrue(footer.verifyLinkedInIcon(),"LinkedIn icon not displayed");
    }


}
