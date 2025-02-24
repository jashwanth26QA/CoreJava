package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class PrintTable extends BrowserDefinition{

    PrintTable(){
        super("https://the-internet.herokuapp.com/tables");
    }

    public void printMytable(){
        /*
        This will print only Column Headers
         */
        List<WebElement> colHeaders=driver.findElements(By.xpath("//table[@id='table1']//tr/th/span"));
        for(int i=0;i<colHeaders.size();i++){
            String name=colHeaders.get(i).getText();
            System.out.print(name+"\t");
        }
        System.out.println("");
        /*
        After printing column headers on top, the below will print the data related to the table
         */
        List<WebElement> tableRow=driver.findElements(By.xpath("//table[@id='table1']//tr"));
        int rowSize= tableRow.size();
        List<WebElement>tableColumns;

        String beforeXpath="//table[@id='table1']//tr[";
        String afterXpath="]/td";
        for(int i=1;i<rowSize;i++){
            String combinedXpath=beforeXpath+i+afterXpath;
            tableColumns=driver.findElements(By.xpath(combinedXpath));

            for(int j=0;j<tableColumns.size();j++){
                System.out.print(tableColumns.get(j).getText()+"\t");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        PrintTable printTble=new PrintTable();
        printTble.printMytable();
    }
}
