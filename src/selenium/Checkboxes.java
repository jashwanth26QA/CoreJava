package selenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkboxes extends BrowserDefinition {

    public Checkboxes() {
        super("https://the-internet.herokuapp.com/checkboxes");
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//form[@id='checkboxes']/child::input[1]")
    WebElement firstCheckBox;

    @FindBy(xpath="//form[@id='checkboxes']/child::input[2]")
    WebElement secondCheckBox;

    public void handleCheckbox(){
        localWait(1500);
        /*
        First Checkbox will be checked since it is unchecked when the browser is launched.
         */
        clickOnElement(firstCheckBox);
        localWait(1500);
        /*
        Second checkbox is checked by default and this time it will be unchecked.
         */
        clickOnElement(secondCheckBox);
    }

    public static void main(String[] args) {
        Checkboxes cb=new Checkboxes();
        cb.handleCheckbox();
    }
}
