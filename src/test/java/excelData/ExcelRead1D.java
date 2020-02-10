package excelData;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelRead1D {
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
	
Object[][] tools= new Object[2][3];
tools[0][0]="sumesh";
tools[0][1]="m";
tools[0][2]="india";
tools[1][0]="sumeh";
tools[1][1]="ms";
tools[1][2]="india";

	
	
	
	return tools;
	
}





}
