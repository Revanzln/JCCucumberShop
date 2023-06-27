package com.juaracoding;

import com.juaracoding.pages.CheckOutPage;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class TestCheckout {
    static WebDriver driver;
    static ExtentTest extentTest;
    static CheckOutPage checkoutPage = new CheckOutPage();

    public TestCheckout(){
        driver = Hooks.driver;
        extentTest = Hooks.extentTest;
    }

    @When("User click button view cart")
    public void user_click_button_view_cart(){
        checkoutPage.viewCart();
        extentTest.log(LogStatus.PASS,"User click button view cart");
    }

    @And("User click button proceed to checkout")
    public void user_click_button_proceed_to_checkout(){
        Hooks.scroll(1000);
        checkoutPage.checkout();
        extentTest.log(LogStatus.PASS,"User click button proceed to checkout");
    }

    @And("User enter firstname")
    public void user_enter_firstname(){
        checkoutPage.firstName("Revan");
        extentTest.log(LogStatus.PASS,"User enter firstname");
    }

    @And("User enter lastname")
    public void user_enter_lastname(){
        checkoutPage.lastName("Shop");
        extentTest.log(LogStatus.PASS,"User enter lastname");
    }

    @And("User enter companyname")
    public void user_enter_companyname(){
        checkoutPage.companyName("Juara Coding");
        extentTest.log(LogStatus.PASS,"User enter companyname");
    }

    @And("User select country")
    public void user_select_country(){
        checkoutPage.selectCountry("ID");
        extentTest.log(LogStatus.PASS,"User select country");
    }

    @And("User enter address1")
    public void user_enter_address(){
        checkoutPage.billingAddress1("Jl Merdeka Barat");
        extentTest.log(LogStatus.PASS,"User enter address");
    }
    @And("User enter address2")
    public void user_enter_address2(){
        checkoutPage.billingAddress2("Senayan");
        extentTest.log(LogStatus.PASS,"User enter address2");
    }

    @And("User enter town")
    public void user_enter_town(){
        checkoutPage.billingCity("Jakarta");
        extentTest.log(LogStatus.PASS,"User enter town");
    }

    @And("User select province")
    public void user_select_province(){
        checkoutPage.getProvince("BT");
        extentTest.log(LogStatus.PASS, "User select province");
    }

    @And("User enter postcode")
    public void user_enter_postcode(){
        checkoutPage.postCode("3545");
        extentTest.log(LogStatus.PASS,"User enter postcode");
    }

    @And("User enter phone number")
    public void user_enter_phone_number(){
        checkoutPage.numberPhone("089867675");
        extentTest.log(LogStatus.PASS,"User enter phone number");
    }

    @And("User enter email address")
    public void user_enter_email_address(){
        checkoutPage.mailAddress("revanznr@gmail.com");
        extentTest.log(LogStatus.PASS,"User enter phone number");
    }
    @And("User enter order comments")
    public void user_enter_oreder_comments(){
        checkoutPage.orderComments("Thanks for order");
        extentTest.log(LogStatus.PASS,"User enter order comments");
    }

    @And("User click checkbox terms")
    public void user_click_checkbox_terms(){
        Hooks.scroll(-100);
        checkoutPage.checkBoxTerms();
        extentTest.log(LogStatus.PASS,"User click checkbox terms");
    }

    @And("User click button place order")
    public void user_click_button_place_order(){
        checkoutPage.orderBtn();
        extentTest.log(LogStatus.PASS,"User click button place order");
    }

    @Then("User get text success order")
    public void user_get_text_success_order(){
        Assert.assertEquals(checkoutPage.validCheck(),"Thank you. Your order has been received.");
        extentTest.log(LogStatus.PASS,"User get text success order");
    }

}
