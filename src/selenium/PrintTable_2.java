package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PrintTable_2 extends BrowserDefinition {

    public PrintTable_2() {
        super("https://the-internet.herokuapp.com/challenging_dom");
        PageFactory.initElements(driver, this);
    }


    public void handleTableData(){

        List<WebElement> li=driver.findElements(By.xpath("//tbody/tr"));
        int count =li.size();
        String  tableRow="//tbody/tr[";
        String tableData="]/td";
        List<WebElement> tableColumns=null;
        for(int i=1;i<=count;i++){

            String combinedXpath=tableRow+i+tableData;
            tableColumns=driver.findElements(By.xpath(combinedXpath));
            for(int j=0;j<tableColumns.size();j++){

                System.out.print(tableColumns.get(j).getText()+" ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        PrintTable_2 pt=new PrintTable_2();
        pt.handleTableData();
    }
}
