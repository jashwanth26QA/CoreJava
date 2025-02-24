package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HandleMoreThan3Windows extends BrowserDefinition {

    public HandleMoreThan3Windows() {
        super("https://testrigor.com/blog/elementnotinteractableexception-in-selenium-how-to-resolve/");
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//div[contains(@class,'social')]")
    WebElement navigateToSocialLinks;

    @FindBy(xpath="//a[@href='https://www.facebook.com/testRigor/']")
    WebElement fbkLink;

    @FindBy(xpath="https://www.linkedin.com/company/testrigor/")
    WebElement linkedINLink;

    @FindBy(xpath = "//a[@href='https://twitter.com/testrigor']")
    WebElement twitterLink;

    @FindBy(xpath="//a[@href='https://www.youtube.com/c/Testrigor/featured']")
    WebElement youtubeLink;

    public void handleMultipleWindows(){
        boolean isScrollable=scroll(navigateToSocialLinks);
        if(isScrollable){
        List<WebElement> myLinks=new ArrayList<WebElement>(Arrays.asList(fbkLink,linkedINLink,twitterLink,youtubeLink));
        for(WebElement link:myLinks){
            localWait(2000);
            link.click();
            }
        }
    }

    public static void main(String[] args) {
        HandleMoreThan3Windows hw=new HandleMoreThan3Windows();
        hw.handleMultipleWindows();
    }
}
