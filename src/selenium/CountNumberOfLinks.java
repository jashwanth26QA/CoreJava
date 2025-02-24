package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CountNumberOfLinks extends BrowserDefinition{

    CountNumberOfLinks(){
        super("https://www.wishque.com");
    }

    WebDriver driver=super.driver;
    public static By footerLinks() {
        return By.xpath(
                "//div[@class='container pt40 pb40']/div/div/ul/li/a");
    }

    public void countNumberOfLinks(){
        getWebElements(footerLinks(),"Footer Link Size is defined");
        List<WebElement> links=driver.findElements(footerLinks());
        int count=0;
        for(WebElement link:links){
            count++;
            System.out.println(count+") "+link.getText());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        CountNumberOfLinks ctl=new CountNumberOfLinks();
        ctl.countNumberOfLinks();
    }
}
