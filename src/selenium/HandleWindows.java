package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HandleWindows extends BrowserDefinition {

    public HandleWindows() {
        super("https://the-internet.herokuapp.com/windows");
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[text()='Click Here']")
    WebElement clickOnTheLink;

    public void handleWindows() {
        boolean isTheElementVisible = isVisible(clickOnTheLink, "");
        String parent=driver.getWindowHandle();
        if (isTheElementVisible) {
            clickOnTheLink.click();
        }
        String parentHandler=driver.getWindowHandle();
        Set<String> setHandler=driver.getWindowHandles();
        switchToWindow(setHandler,parentHandler);

    }

    public static void main(String[] args) {
        HandleWindows hw = new HandleWindows();
        hw.handleWindows();
    }
}
