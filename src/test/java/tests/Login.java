package tests;

import models.User;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Login extends TestBase{

    @Test
    public void positiveLoginTest() {
        app.getUserHelper().openLoginForm();
        app.getUserHelper().fillLoginForm(new User().withEmail("test.matsiuk2015@gmail.com").withPassword("Aravaavara0#"));
        app.getUserHelper().pause(7000);
        Assert.assertTrue(
        app.getUserHelper().isElementPresent(By.xpath("//span[@class='DweEFaF5owOe02 V_PnoJ2AynVwLp G6CmOLx93OUZez']"))
                );
    }

    @Test
    public void negativePasswordLoginTest() {
        app.getUserHelper().openLoginForm();
        app.getUserHelper().fillLoginForm(new User().withEmail("test.matsiuk2015@gmail.com").withPassword("Aravaavara#"));
        app.getUserHelper().pause(5000);
        Assert.assertTrue(
                app.getUserHelper().isElementPresent(By.xpath("//span[class='css-xal9c7']"))
        );
    }
    @Test
    public void negativeEmailLoginTest() {
        app.getUserHelper().openLoginForm();
        app.getUserHelper().fillEmailField(new User().withEmail("test.matsiuk2015@gmail"));
        Assert.assertTrue(app.getUserHelper().isElementPresent(By.xpath("//input[@id='login']")));
//
    }

    @Test
    public void logOutTest() {
        if()
        app.getUserHelper().openLoginForm();
        app.getUserHelper().fillLoginForm(new User().withEmail("test.matsiuk2015@gmail.com").withPassword("Aravaavara0#"));
        app.getUserHelper().pause(7000);
        app.getUserHelper().openAccountForm();
        app.getUserHelper().pause(3000);
        app.getUserHelper().submitLogOut();
        app.getUserHelper().pressOkButton();
        app.getUserHelper().pause(5000);

        //Assert.assertTrue(app.getUserHelper().isElementPresent(By.cssSelector("span[class='css-178ag6o'] span")));

    }


}
