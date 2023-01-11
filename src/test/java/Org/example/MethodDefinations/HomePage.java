package Org.example.MethodDefinations;

import Org.example.Bage.PageInstance;
import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static java.util.stream.Collectors.toList;

public class HomePage extends PageInstance {

    @FindBy(xpath="//div[@class='inventory_item_name']")
    List<WebElement> productsOnHomePage;

    @FindBy(xpath="//div[@class='inventory_item_price']")
    List<WebElement> productsPriceOnHomePage;

    @FindBy(xpath="//div[@id='inventory_container']")
    WebElement inventoryContainer;

    @FindBy(xpath = "//span[@class='active_option']")
    WebElement activeSortOption;

    @FindBy(xpath = "//span[@class='title']")
    WebElement title;

    private static String XPATH_FOR_PRODUCTSONHOMEPAGE="//div[@class='inventory_item_name' and . ='%s']";

    public HomePage()
    {
        PageFactory.initElements(driver,this); // for @FindBy

    }


    public List<String> memoriseProductsOnHomePage(){
        return productsOnHomePage.stream().map(WebElement::getText).collect((toList()));
    }

    public boolean isHomePageDisplayed() {
        return inventoryContainer.isDisplayed();
    }

    public boolean chooseSortOption(String sortOption) throws InterruptedException {
        Select select;
        select = new Select(driver.findElement(By.className("product_sort_container")));
        select.selectByVisibleText(sortOption);
        Thread.sleep(2000);
        System.out.println(sortOption);
        System.out.println(activeSortOption.getText());
        return activeSortOption.getText().equalsIgnoreCase(sortOption);
    }
    public boolean isSortedAscending(List<String> products){
        boolean result=false;
        for(int i=0;i<(products.size())-1;i++)
        {
            if(products.get(i).compareToIgnoreCase(products.get(i+1))<0)
            {
                result=true;
            }
        }
        return result;
    }
    public boolean isSortedAscending1(List<String> products){
        boolean result=false;
        for(int i=0;i<(products.size())-1;i++)
        {
            if(products.get(i).compareToIgnoreCase(products.get(i+1))<0)
            {
                result=true;
            }
        }
        return result;
    }
    public boolean verifySort(String sortOption) {
        List<String> productsOnHomePageAfterSort=productsOnHomePage.stream().map(WebElement::getText).collect((toList()));
        List<String> productsPriceOnHomePageAfterSort=productsPriceOnHomePage.stream().map(WebElement::getText).collect((toList()));

        boolean result=false;
        switch (sortOption){

            case "Name (Z to A)":
                result=!isSortedAscending(productsOnHomePageAfterSort);
                System.out.println(result);
                break;
            case "Price (High to Low)":
                result=!isSortedAscending1(productsPriceOnHomePageAfterSort);
                System.out.println(result);
                break;
            case "Price (Low to High)":
                result=isSortedAscending1(productsPriceOnHomePageAfterSort);
                System.out.println(result);
                break;

            default:result=isSortedAscending(productsOnHomePageAfterSort);
        }
        return result;
    }

    public String headerTitleProducts() {
        String secondaryHeaderTitle=title.getText();
        return secondaryHeaderTitle;
    }

    public boolean headerSortButton() {
       return activeSortOption.isDisplayed();

    }

    public void clickOnProduct(String productName) {
        WebElement productToBeClicked= driver.findElement(By.xpath(String.format(XPATH_FOR_PRODUCTSONHOMEPAGE,productName)));
        JavascriptExecutor javascript=(JavascriptExecutor) driver;
        javascript.executeScript("arguments[0].click();",productToBeClicked);
    }
}
