package Org.example.TestRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/resources", glue = {"Org.example"},
        plugin={"pretty","html:target/HtmlReports/htmlreport.html","junit:target/JUnitReports/report.xml",
                "json:target/JSONReports/report.json","io.qameta.allure.cucumber6jvm.AllureCucumber6Jvm"})
public class TestRunner extends AbstractTestNGCucumberTests {




}
