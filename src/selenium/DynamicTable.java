package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DynamicTable extends BrowserDefinition {

    public DynamicTable() {
        super("https://practice.expandtesting.com/dynamic-table");
        PageFactory.initElements(driver, this);
    }

    public void handleDynamicTable(String value) {

        List<WebElement> li = driver.findElements(By.xpath("//tbody/tr"));
        int count = li.size();
        String tableRow = "//tbody/tr[";
        String tableData = "]/td";
        List<WebElement> tableColumns = null;
        for (int i = 1; i <= count; i++) {
            String combinedXpath = tableRow + i + tableData;
            String fireFox = driver.findElement(By.xpath(combinedXpath)).getText();
            if (fireFox.equals(value)) {
                tableColumns = driver.findElements(By.xpath(combinedXpath));
                for (int j = 0; j < tableColumns.size(); j++) {
                    String myCPUData = tableColumns.get(j).getText();
                    if (myCPUData.endsWith("%")) {
                        System.out.println("The CPU data for FireFox : " +myCPUData);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        DynamicTable dt=new DynamicTable();
        dt.handleDynamicTable("Firefox");
    }
}
