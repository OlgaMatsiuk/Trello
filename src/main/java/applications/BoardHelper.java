package applications;

import models.Board;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BoardHelper extends HelperBase{
    public BoardHelper(WebDriver wd) {
        super(wd);
    }



    public void pressCreateButton() {
        click(By.xpath("(//div[@class='board-tile mod-add'])[1]"));

    }

    public void fillBoardForm(Board board) {
        type(By.xpath("//input[@type='text']"), board.getName());

    }
}
