package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckOutPage {
    private WebDriver driver;
    public CheckOutPage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//i[@class='icon_bag_alt']")
    WebElement viewCartBtn;
    @FindBy(xpath = "//a[@class='checkout-button button alt wc-forward wp-element-button']")
    WebElement checkoutBtn;

    @FindBy(id = "billing_first_name")
    WebElement firstName;
    @FindBy(id = "billing_last_name")
    WebElement lastName;
    @FindBy(id = "billing_company")
    WebElement companyName;
    @FindBy(id = "billing_country")
    WebElement countrySelect;
    @FindBy(id = "billing_address_1")
    WebElement billingAddress1;
    @FindBy(id = "billing_address_2")
    WebElement billingAddress2;
    @FindBy(id = "billing_city")
    WebElement billingCity;
    @FindBy(id = "billing_state")
    WebElement province;
    @FindBy(id = "billing_postcode")
    WebElement postCode;
    @FindBy(id = "billing_phone")
    WebElement phoneNumber;
    @FindBy(id = "billing_email")
    WebElement email;
    @FindBy(xpath = "//textarea[@id='order_comments']")
    WebElement orderComments;
    @FindBy(xpath = "//*[@id=\"terms\"]")
    WebElement btnTerms;
    @FindBy(id = "place_order")
    WebElement btnOrder;
    @FindBy(xpath = "//*[@id=\"post-7\"]/div/div/div/p[1]")
    WebElement validCheckout;


    public void viewCart(){
        viewCartBtn.click();
    }

    public void checkout(){
        checkoutBtn.click();
    }

    public void firstName(String firstname){
        firstName.clear();
        firstName.sendKeys(firstname);
    }
    public void lastName(String lastname){
        lastName.clear();
        lastName.sendKeys(lastname);
    }
    public void companyName(String companyname){
        companyName.clear();
        companyName.sendKeys(companyname);
    }

    public void selectCountry(String country){
        Select select = new Select(countrySelect);
        select.selectByValue(country);
    }

    public void billingAddress1(String address1){
        billingAddress1.clear();
        billingAddress1.sendKeys(address1);
    }

    public void billingAddress2(String address2){
        billingAddress2.clear();
        billingAddress2.sendKeys(address2);
    }

    public void billingCity(String city) {
        billingCity.clear();
        billingCity.sendKeys(city);
    }

    public void getProvince(String selectProvince){
        Select select = new Select(province);
        select.selectByValue(selectProvince);
    }

    public void postCode(String postcode){
        postCode.clear();
        postCode.sendKeys(postcode);
    }

    public void numberPhone(String phone){
        phoneNumber.clear();
        phoneNumber.sendKeys(phone);
    }

    public void mailAddress(String mail){
        email.clear();
        email.sendKeys(mail);
    }
    public void orderComments(String comment){
        orderComments.clear();
        orderComments.sendKeys(comment);
    }

    public void checkBoxTerms(){
        btnTerms.click();
    }

    public void orderBtn(){
        btnOrder.click();
    }
    public String validCheck(){
        return validCheckout.getText();
    }
}