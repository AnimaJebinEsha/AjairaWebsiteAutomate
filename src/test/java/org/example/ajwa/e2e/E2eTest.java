package org.example.ajwa.e2e;

import org.example.ajwa.driverFactory.DriverFactory;
import org.example.ajwa.pages.Pages;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class E2eTest {
    private Pages pagesObject;

    @BeforeClass()
    public void setup() {
        DriverFactory.initialize();
    }

    @BeforeMethod()
    public void navigate() {
        pagesObject = Pages.navigate();
    }

    @Test()
    public void test1() {

        pagesObject.ClickRegisterButton();
        pagesObject.typeRadioButton();
        pagesObject.typeEmail();
        pagesObject.typePassword();

        pagesObject.typeFirstName();
        pagesObject.typeLastName();
        pagesObject.TypeShopName();

        pagesObject.TypeShopUrl();
        pagesObject.TypePhoneNumber();
        pagesObject.registerSubButton();
       //pagesObject.popupHandeling();

        pagesObject.letsGo();
        pagesObject.ClickContinue();
        pagesObject.clickanotherContinue();
        pagesObject.goToyourDashboard();




       // pagesObject.clickDashboard();
        pagesObject.clickProduct();
        pagesObject.clickAddNewProduct();

        pagesObject.clickActiveProduct();
        pagesObject.clickSaveProduct();

        pagesObject.clickProduct();
        pagesObject.hoverHover();
        pagesObject.deleteProduct();
        pagesObject.allertAccept();

    }
}
