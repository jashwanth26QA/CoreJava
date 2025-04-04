package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frames extends BrowserDefinition {

    public Frames() {
        super("https://omayo.blogspot.com/");
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//iframe[@id='iframe1']")
    WebElement myFrame1;

    public void handleFrames(){
        switchToDesiredFrame(myFrame1);


    }

    public static void main(String[] args) {

    }
}
