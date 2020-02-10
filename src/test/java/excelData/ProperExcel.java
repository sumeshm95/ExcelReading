package excelData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utility.ExcelReader;

public class ProperExcel {
	

	@Test(dataProvider = "giveData")
	public void TestData(String firstName,String lastName, String country) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\smohandass\\eclipse-workspace\\ExcelReading\\src\\test\\resources\\dirver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://demoqa.com/html-contact-form/");
	driver.findElement(By.xpath("//input[@placeholder='Your name..']")).sendKeys("firstName");
	driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("lastName");
	driver.findElement(By.xpath("//input[@placeholder='Enter your Country']")).sendKeys("country");	
	}

@DataProvider(name = "giveData")	
public Object[][] getData(){
	ExcelReader ex= new ExcelReader("C:\\Users\\smohandass\\eclipse-workspace\\ExcelReading\\src\\test\\resources\\Testdata\\Testing.xlsx");
String	sheetName="SignIn";
	int rowCount = ex.getRowCount(sheetName);
	int columnCount = ex.getColumnCount(sheetName);
Object[][] tools= new Object[rowCount-1][3];
for (int i=1;i<rowCount;i++)
{
	for(int j=0;j<columnCount;j++) {
		tools[i][j]=ex.getCellData(sheetName, j, i);
	}
}
	
	
	return tools;
	

}
}