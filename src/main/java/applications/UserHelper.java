package applications;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase {
    public UserHelper(WebDriver wd) {
        super(wd);
    }

    public void openLoginForm() {
        click(By.xpath("(//a[@class='Buttonsstyles__Button-sc-1jwidxo-0 kTwZBr'])[1]"));
        pause(3000);
    }

    public void fillLoginForm(User user) {
        type(By.xpath("(//input[@id='user'])[1]"), user.getEmail());
        click(By.xpath("//input[@id='login']"));
        pause(3000);
        type(By.xpath("(//input[@id='password'])[1]"), user.getPassword());
        click(By.xpath("(//span[@class='css-178ag6o'])[1]"));
        //pause(5000);

    }

    public void fillEmailField(User user) {
        type(By.xpath("//input[@id='user']"), user.getEmail());
        click(By.xpath("//input[@id='login']"));
        //pause(2000);
        //click(By.xpath("//input[@id='login']"));
    }

    public void openAccountForm() {
        click(By.xpath("//span[@class='DweEFaF5owOe02 V_PnoJ2AynVwLp G6CmOLx93OUZez']"));

    }

    public void submitLogOut() {
        //click(By.xpath("//button[.#'Log out']"));
        click(By.cssSelector("button[data-testid='account-menu-logout'] span[class='BmRHtH7FIX0jcL']"));
    }
    public void pressOkButton() {
        click(By.xpath("//span[@class='css-178ag6o']"));
    }

    public void submitCreate() {
        click(By.);
    }
}
