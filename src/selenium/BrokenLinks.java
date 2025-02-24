package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class BrokenLinks extends BrowserDefinition {

    public BrokenLinks() {
        super("https://the-internet.herokuapp.com/broken_images");
        PageFactory.initElements(driver, this);
    }

    public void handleBrokenLinks() throws IOException {
        List<WebElement> links=driver.findElements(By.xpath("//div[@id='content']//div/child::img"));
        int brokenImagesCount=0;
        for (int i = 0; i < links.size(); i++) {
            System.out.println(links.get(i));
            String linkURL=links.get(i).getAttribute("src");
            System.out.println(links.get(i).getText());
            URL url = new URL(linkURL);
            HttpURLConnection http = (HttpURLConnection) url.openConnection();
            http.setConnectTimeout(10000);
            http.setReadTimeout(20000);
            int statusCode=http.getResponseCode();
            if(statusCode==404||statusCode==500){
                brokenImagesCount=brokenImagesCount+1;
                System.out.println(linkURL+"and its Status codes is:"+statusCode);
            }
        }
        System.out.println("total number of broken images are: "+brokenImagesCount);
    }

    public static void main(String[] args) throws IOException {
        BrokenLinks bl=new BrokenLinks();
        bl.handleBrokenLinks();
    }
}
