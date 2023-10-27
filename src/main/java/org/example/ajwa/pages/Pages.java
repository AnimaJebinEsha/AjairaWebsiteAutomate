package org.example.ajwa.pages;

import org.example.ajwa.driverFactory.DriverFactory;
import org.example.ajwa.utils.WaitUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Pages {
    private static final String PAGE_URL = "https://shashwata.ajaira.website/";


    //Locators
    private final By registerButton = By.cssSelector(".nav > li:nth-child(2) > a:nth-child(1)");
    private final By emailField = By.id("reg_email");
    private final By password = By.id("reg_password");

    private final By firstName = By.id("first-name");
    private final By lastName = By.id("last-name");
    private final By shopName = By.id("company-name");
    private final By shopUrl = By.id("seller-url");

    private final By phoneNumber = By.id("shop-phone");


    private final By radioButton = By.xpath("/html/body/div[2]/div/div/main/article/div/div/div/div[2]/div[2]/form/p[3]/label[2]/input");

    private final By registerSubButton = By.cssSelector("p.form-row:nth-child(7) > button:nth-child(3)");
    private final By dashboard = By.cssSelector("#menu-menu-1 > li:nth-child(6) > a:nth-child(1)");
    private final By product = By.xpath("//li[@class=\"products\"]/a");
    private final By activeProduct = By.xpath("//li[@class=\"active products\"]/a");
    private final By addNewProduct = By.cssSelector("a.dokan-btn:nth-child(1)");

    private final By productTitle = By.id("post_title");

    private final By saveProduct = By.id("publish");

    private final By hoveProduct = By.cssSelector("#dokan-product-list-table > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(3) > strong:nth-child(1) > a:nth-child(1)");

    private final By ok = By.cssSelector(".swal2-confirm");

    private final By delete = By.cssSelector("#dokan-product-list-table > tbody:nth-child(2) > tr:nth-child(2) > td:nth-child(3) > div:nth-child(2) > span:nth-child(2) > a:nth-child(1)");
    private final By letsGobutton = By.cssSelector("body > div.wc-setup-content > p.wc-setup-actions.step > a.button-primary.button.button-large.button-next.lets-go-btn.dokan-btn-theme");
    private final By anotherContinue = By.cssSelector("body > div.wc-setup-content > form > p > input.button-primary.button.button-large.button-next.payment-continue-btn.dokan-btn-theme");
    private final By continuebutton = By.cssSelector("body > div.wc-setup-content > form > p > input.button-primary.button.button-large.button-next.store-step-continue.dokan-btn-theme");
    private final By goDash = By.cssSelector("body > div.wc-setup-content > div.dokan-setup-done-content > p > a");

    //Static Methods
    public static Pages navigate() {
        DriverFactory.getDriver().get(PAGE_URL);
        return new Pages();
    }

    //Actions
    public void ClickRegisterButton() {
        DriverFactory.getDriver().findElement(registerButton).click();
        WaitUtil.implicitWaitForSeconds(20);
    }

    public void typeRadioButton() {
        DriverFactory.getDriver().findElement(radioButton).click();
        WaitUtil.implicitWaitForSeconds(20);
    }

    public void typeEmail() {
        DriverFactory.getDriver().findElement(emailField).sendKeys("adaaaaadru@gmail.com");
        WaitUtil.implicitWaitForSeconds(20);
    }

    public void typePassword() {
        DriverFactory.getDriver().findElement(password).sendKeys("animaesha@");
        WaitUtil.implicitWaitForSeconds(20);
    }

    public void typeFirstName() {
        DriverFactory.getDriver().findElement(firstName).sendKeys("animaanima");
        WaitUtil.implicitWaitForSeconds(20);
    }

    public void typeLastName() {
        DriverFactory.getDriver().findElement(lastName).sendKeys("jebin");
        WaitUtil.implicitWaitForSeconds(20);
    }

    public void TypeShopName() {
        DriverFactory.getDriver().findElement(shopName).sendKeys("eshazz");
        WaitUtil.implicitWaitForSeconds(20);
    }

    public void TypeShopUrl() {
        DriverFactory.getDriver().findElement(shopUrl).sendKeys("https://www.facebook.com/Eshartistic/");
        WaitUtil.implicitWaitForSeconds(20);
    }

    public void TypePhoneNumber() {
        DriverFactory.getDriver().findElement(phoneNumber).sendKeys("017031");
        WaitUtil.implicitWaitForSeconds(20);
    }


    public void registerSubButton() {
        DriverFactory.getDriver().findElement(registerSubButton).click();
        WaitUtil.implicitWaitForSeconds(10);
    }


    public void letsGo() {
        DriverFactory.getDriver().findElement(letsGobutton).click();
        WaitUtil.implicitWaitForSeconds(10);
    }

    public void ClickContinue() {
        DriverFactory.getDriver().findElement(continuebutton).click();
        WaitUtil.implicitWaitForSeconds(10);
    }

    public void clickanotherContinue() {
        DriverFactory.getDriver().findElement(anotherContinue).click();
        WaitUtil.implicitWaitForSeconds(10);
    }

    public void goToyourDashboard() {
        DriverFactory.getDriver().findElement(goDash).click();
        WaitUtil.implicitWaitForSeconds(20);
    }


    public void clickDashboard() {
        DriverFactory.getDriver().findElement(dashboard).click();
        WaitUtil.implicitWaitForSeconds(20);
    }

    public void clickProduct() {
        DriverFactory.getDriver().findElement(product).click();
        WaitUtil.implicitWaitForSeconds(10);
    }

    public void clickActiveProduct() {
        DriverFactory.getDriver().findElement(activeProduct).click();
        WaitUtil.implicitWaitForSeconds(10);
    }

    public void clickAddNewProduct() {
        DriverFactory.getDriver().findElement(addNewProduct).click();
        WaitUtil.implicitWaitForSeconds(10);
    }

    public void typeProductTitle() {
        DriverFactory.getDriver().findElement(productTitle).sendKeys("nshartistic12");
        WaitUtil.implicitWaitForSeconds(10);
    }

    public void clickSaveProduct() {
        DriverFactory.getDriver().findElement(saveProduct).click();
        WaitUtil.implicitWaitForSeconds(10);
    }

    public void hoverHover() {
        WebElement hoverElement = DriverFactory.getDriver().findElement(hoveProduct);
        Actions hoverAction = new Actions(DriverFactory.getDriver());
        hoverAction.moveToElement(hoverElement).perform();

    }


    public void deleteProduct() {
        DriverFactory.getDriver().findElement(delete).click();
        WaitUtil.implicitWaitForSeconds(10);
    }

    public void allertAccept() {
        DriverFactory.getDriver().findElement(ok).click();
        WaitUtil.implicitWaitForSeconds(10);
        ;
    }


}
