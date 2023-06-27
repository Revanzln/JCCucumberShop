package com.juaracoding;

import com.juaracoding.pages.LoginPage;
import com.juaracoding.pages.ProductPage;
import com.juaracoding.utils.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class TestProductpage {
    static WebDriver driver;
    static ExtentTest extentTest;
    static LoginPage loginPage = new LoginPage();
    static ProductPage productPage = new ProductPage();

    public TestProductpage() {
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }
    @When("User click logo Shop")
    public void user_click_logo_shop(){
        driver.navigate().refresh();
        loginPage.login("Revan_zn","Shopqa1122");
        productPage.shopMenu();
        extentTest.log(LogStatus.PASS,"User click logo Shop");
    }

    @And("User click product one")
    public void user_click_product_one(){
        Hooks.delay(Constants.DETIK);
        Hooks.scroll(1810);
        productPage.product();
        extentTest.log(LogStatus.PASS,"User click product one");
    }

    @And("User choose product1 color")
    public void user_choose_product1_color(){
        Hooks.delay(Constants.DETIK);
        Hooks.scroll(600);
        productPage.selectColor("Red");
        extentTest.log(LogStatus.PASS,"User choose product1 color");
    }

    @And("User choose product1 size")
    public void user_choose_product1_size(){
        productPage.selectSize("L");
        extentTest.log(LogStatus.PASS,"User choose product1 size");
    }

    @Then("User click button add to cart")
    public void user_click_button_add_to_cart(){
        productPage.addtocart();
        extentTest.log(LogStatus.PASS,"User click button add to cart");
    }

    @When("User click logo to shop")
    public void user_click_logo_to_shop(){
        productPage.shopMenu();
        extentTest.log(LogStatus.PASS,"User click logo to shop");
    }

    @And("User click product two")
    public void user_click_product_two(){
        Hooks.delay(Constants.DETIK);
        Hooks.scroll(1500);
        productPage.product1();
        extentTest.log(LogStatus.PASS,"User click product two");
    }

    @And("User choose product2 color")
    public void user_choose_product2_color(){
        Hooks.delay(Constants.DETIK);
        Hooks.scroll(600);
        productPage.selectColor1("mauve");
        extentTest.log(LogStatus.PASS,"User choose product2 color");
    }

    @And("User choose product2 size")
    public void user_choose_product2_size(){
        productPage.selectSize1("large");
        extentTest.log(LogStatus.PASS,"User choose product2 size");
    }
}
