package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HandleDisappearingElements extends BrowserDefinition {

    public HandleDisappearingElements() {
        super("https://www.flipkart.com/");
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//input[contains(@title,'Search')]")
    WebElement searchBox;

    @FindBy(xpath="//ul[@class='_1sFryS _2x2Mmc _3ofZy1']/li/div/a/div/..//div[text()='shoes for women']")
    WebElement shoesFromList;

    public void handleDisappearingEles(){
        type(searchBox,"Shoes","SearchBox On Home Page");
        localWait(2000);
        clickOnElement(shoesFromList);
    }

    public static void main(String[] args) {
        HandleDisappearingElements hde=new HandleDisappearingElements();
        hde.handleDisappearingEles();
    }
}
