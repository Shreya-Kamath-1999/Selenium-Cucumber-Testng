package Org.example.StepDefinations;

import Org.example.MethodDefinations.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.testng.Assert;

public class HomePageStepDef {
    HomePage home=new HomePage();
    @Given("the homepage is loaded on login")
    public void theHomepageIsLoadedOnLogin() {
        Assert.assertTrue(home.isHomePageDisplayed(),"Home page not displayed");
    }

    @And("the secondary header has the title 'Products'")
    public void theSecondaryHeaderHasTheTitleProducts() {
        Assert.assertEquals(home.headerTitleProducts(),"PRODUCTS","Title Products is displayed");

    }

    @And("the secondary header has sort button")
    public void theSecondaryHeaderHasSortButton() {
        Assert.assertTrue(home.headerSortButton());

    }

    @And("I choose sort option {string}")
    public void iChooseSortOption(String sortOption) throws InterruptedException {
        Assert.assertTrue(home.chooseSortOption(sortOption),"Sort option not selected");

    }

    @And("I verify if the sort is successful for {string}")
    public void iVerifyIfTheSortIsSuccessfulFor(String sortOption) {
        Assert.assertTrue(home.verifySort(sortOption),"Products not sorted");
    }

    @And("I click on {string} item on homepage")
    public void iClickOnItemOnHomepage(String productName) {
        home.clickOnProduct(productName);


    }
}
