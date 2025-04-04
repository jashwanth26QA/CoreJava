package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HandlePopUp extends BrowserDefinition {

    public HandlePopUp() {
        super("https://omayo.blogspot.com/");
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//input[@id='confirm']")
    WebElement popUPButton;

    public void handleMyPopUp(){
        scroll(popUPButton);
        clickOnElement(popUPButton);
        localWait(1500);
        clickOnPopUp();
    }

    public static void main(String[] args) {
        HandlePopUp hp=new HandlePopUp();
        hp.handleMyPopUp();
    }
    
}
