package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Arrays;
import java.util.List;

public class WaitForAnElement extends BrowserDefinition {

    public WaitForAnElement() {
        super("https://omayo.blogspot.com/");
        PageFactory.initElements(driver, this);
    }

    public static By mediaLinks(String mediaName) {
        return By.xpath(
                "//*[@id='myDropdown']/a[text()='"+mediaName+"']");
    }

    @FindBy(xpath="//*[@id='myDropdown']/../button")
    WebElement dropDownButton;

    public void handleElementToWait_untilDropDownAppears() {
        try {
            scroll(dropDownButton);
            clickOnElement(dropDownButton);
            List<String> media = Arrays.asList("Facebook","Flipkart","Gmail");
            isVisible(mediaLinks(media.get(1)),"Flipkart link");
            click(mediaLinks(media.get(1)));
        } catch (ElementClickInterceptedException ae) {
            System.out.println("The exception is "+ae);
        }
    }

    public static void main(String[] args) {
        WaitForAnElement we=new WaitForAnElement();
        we.handleElementToWait_untilDropDownAppears();
    }
}
