package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class RebusCountHolidays extends BrowserDefinition {

    public RebusCountHolidays() {
        super("https://www.redbus.in/");
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath="//*[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']/div[2]")
    public WebElement dateName;

    @FindBy(xpath="//*[@id='onwardCal']/div/div/span")
    public WebElement dateField;

    @FindBy(xpath="//*[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']/div[3]")
    public WebElement dateMover;

    @FindBy(xpath="//*[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 bwoYtA']")
    public WebElement incompleteWeekEnds;

    /*
    This method only takes 3 letter month code with first letter in capital , year(yyyy) format as a parameter
    example : Jan 2026
     */
    public void countMyHolidays_weekEnds_monthWise(String month) {
        clickOnElement(dateField);
        List<WebElement> listOfIncompleteWeekEnds = null;
        while (true) {
            WebElement dateNames = driver.findElement(By.xpath("//*[@class='DayNavigator__CalendarHeader-qj8jdz-1 fxvMrr']/div[2]"));
            String myDate[] = getElementText(dateName).split("\n");
            try {
                if (!myDate[0].equals(month)) {
                    System.out.println("The month is " + myDate[0]);
                    System.out.println("The number of holidays are: " + myDate[1]);
                    System.out.println("The Weekend Dates are :");
                    listOfIncompleteWeekEnds = driver.findElements(By.xpath("//*[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 bwoYtA']"));
                    for (WebElement weekEndList : listOfIncompleteWeekEnds) {
                        System.out.println(weekEndList.getText());
                    }
                    System.out.println("***********************");
                } else {
                    break;
                }
            } catch (Exception ae) {
                System.out.println("The number of holidays are 0");
                listOfIncompleteWeekEnds = driver.findElements(By.xpath("//*[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 bwoYtA']"));
                for (WebElement weekEndList : listOfIncompleteWeekEnds) {
                    System.out.println(weekEndList.getText());
                }
                System.out.println("***********************");
            }
                clickOnElement(dateMover);
        }
    }
        public static void main(String[] args) {
            RebusCountHolidays rdc=new RebusCountHolidays();
            String endMonth="Jan 2026";
            rdc.countMyHolidays_weekEnds_monthWise(endMonth);
        }
    }
