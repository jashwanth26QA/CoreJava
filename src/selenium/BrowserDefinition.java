package selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class BrowserDefinition {

    static WebDriver driver;
    WebElement element;
    WebDriverWait wait;

    BrowserDefinition(String url) {
        try {
            System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(url);
            driver.manage().window().maximize();
            driver.manage().timeouts().pageLoadTimeout(45, TimeUnit.SECONDS);
        } catch (Exception ae) {
            System.out.println(ae);
        }
    }

    JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;

    public static void clickOnElement(WebElement element) {
        try {
            element.click();
        } catch (Exception ae) {
            System.out.println(ae);
        }
    }

    public String getElementText(WebElement element){
        String getElemeText=element.getText();
        return getElemeText;
    }

    public void click(By by) {
        element = driver.findElement(by);
        element.click();
    }

    public boolean isMyElementPresent(WebElement element, String locName) {
        boolean isPresent = true;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (NoSuchElementException e) {
            isPresent = false;
        }
        return isPresent;
    }

    public void highlightFoundElement(WebElement element) {
        jsExecutor.executeScript("arguments[0].style.background='yellow'", element);
    }

    public List<WebElement> getWebElements(By by, String locatorName) {
        List<WebElement> elements = null;
        elements = driver.findElements(by);
        System.out.println("Size of List ::" + elements.size());
        return elements;
    }

    public boolean isVisible(By by, String locatorName) {
        boolean flag = false;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            element=driver.findElement(by);
            wait.until(ExpectedConditions.visibilityOf(element));
            flag = element.isDisplayed();
            System.out.println("Element: " + element + " is Visible");
            flag = true;
        } catch (Exception e) { // e.printStackTrace();
            System.out.println("Element: " + element + " is Not Visible");
        }
        return flag;
    }
    public boolean isVisible(WebElement element, String locatorName) {
        boolean flag = false;
        try {
            wait = new WebDriverWait(driver, Duration.ofSeconds(30));
            wait.until(ExpectedConditions.visibilityOf(element));
            flag = element.isDisplayed();
            System.out.println("Element: " + element + " is Visible");
            flag = true;
        } catch (Exception e) { // e.printStackTrace();
            System.out.println("Element: " + element + " is Not Visible");
        }
        return flag;
    }

    public void switchToWindow(Set<String> windowSet,String parentHandlerName){
        Set<String> multipleWindows=windowSet;
        Iterator<String> I1= multipleWindows.iterator();
        try {
            /*
            In While loop , it has got 2 windows -> Parent /Child
            If Parent Window != Child window ,it will then switch to child window
             */

            while (I1.hasNext()) {
                String child_window = I1.next();
                if (!parentHandlerName.equals(child_window)) {
                    driver.switchTo().window(child_window);
                    System.out.println(driver.switchTo().window(child_window).getTitle());
                    localWait(2500);
                    driver.close();
                }
            }
        }catch(NoSuchWindowException e){
            System.out.println("Unable to find the window: " + e.getMessage());
        }
        finally{
            /*
        It will now switch back to the parent tab;
         */
            driver.switchTo().window(parentHandlerName);
            driver.quit();
        }
    }

    public void localWait(long value) {
        try {
            Thread.sleep(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean scroll(WebElement element) {
        boolean status = false;
        try {
            Actions actions = new Actions(driver);
            actions.moveToElement(element);
            actions.build().perform();
            status = true;
        } catch (Exception e) {
            status = false;
            e.printStackTrace();
        }
        return status;
    }

    public void switchToDesiredFrame(WebElement element){
        List<WebElement> elements = driver.findElements(By.tagName("iframe"));
        int numberOfTags = elements.size();
        System.out.println("No. of Iframes on this Web Page are: " +numberOfTags);
        driver.switchTo().frame(element);

    }

    public void switchToDefaultFrame() {
        driver.switchTo().defaultContent();
        System.out.println("Switched to Frame: Parent Frame");
    }

    public void type(WebElement element, String testData, String locatorName) {
        element.clear();
        System.out.println("Cleared the existing Locator data : ");
        scroll(element);
        element.sendKeys(testData);
        System.out.println("Typed the Locator data :: " + testData);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }

    public void clickOnPopUp(){
        try{
        wait = new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
        return;
            }finally {
            System.out.println("Pop Up has been handled");
        }
    }
}

