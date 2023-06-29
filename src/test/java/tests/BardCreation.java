package tests;

import models.Board;
import models.User;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BardCreation extends TestBase {
    @BeforeMethod
    public void preconditions() {
        if(!app.getUserHelper().isElementPresent(By.xpath("//span[@class='DweEFaF5owOe02 V_PnoJ2AynVwLp G6CmOLx93OUZez']"))) {
            app.getUserHelper().openLoginForm();
            app.getUserHelper().fillLoginForm(new User().withEmail("test.matsiuk2015@gmail.com").withPassword("Aravaavara0#"));
            app.getUserHelper().pause(3000);
        }
    }
    @Test
    public void boardCreationTest() {
        String boardName = "qa19_" + System.currentTimeMillis();
        app.getBoardHelper().pressCreateButton();
        app.getBoardHelper().fillBoardForm(new Board().withName(boardName);
        app.getUserHelper().submitCreate();


    }
}
