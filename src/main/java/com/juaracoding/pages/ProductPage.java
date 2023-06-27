package com.juaracoding.pages;

import com.juaracoding.drivers.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ProductPage {
    private WebDriver driver;
    public ProductPage(){
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@class='custom-logo-link']//img[@alt='ToolsQA Demo Site']")
    WebElement shopMenu;
    @FindBy(xpath = "//div[@class='noo-product-inner noo-product-inner2']//a[normalize-space()='Tokyo Talkies']")
    WebElement chooseProduct;

    @FindBy(xpath = "//a[normalize-space()='red satin round neck backless maxi dress']")
    WebElement chooseProduct1;

    @FindBy(xpath = "//select[@id='color']")
    WebElement colorOption;

    @FindBy(xpath = "//select[@id='size']")
    WebElement sizeOption;
    @FindBy(xpath = "//select[@id='pa_color']")
    WebElement colorOption1;

    @FindBy(xpath = "//select[@id='pa_size']")
    WebElement sizeOption1;

    @FindBy(xpath = "//button[normalize-space()='Add to cart']")
    WebElement btnToCart;
    public void shopMenu() {
        shopMenu.click();
    }
    public void product() {
        chooseProduct.click();
    }
    public  void selectColor(String color) {
        Select selectColor = new Select(this.colorOption);
        selectColor.selectByValue(color);
    }
    public  void selectSize(String size) {
        Select selectSize = new Select(this.sizeOption);
        selectSize.selectByValue(size);
    }
    public void product1() {
        chooseProduct1.click();}
    public  void selectColor1(String color) {
        Select selectColor1 = new Select(this.colorOption1);
        selectColor1.selectByValue(color);}
    public  void selectSize1(String size) {
        Select selectSize1 = new Select(this.sizeOption1);
        selectSize1.selectByValue(size);
    }

       public void addtocart(){ btnToCart.click();
    }

}