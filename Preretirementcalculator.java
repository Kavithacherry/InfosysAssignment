package InfosysAssesment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Preretirementcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.securian.com/insights-tools/retirement-calculator.html");
		driver.manage().window().maximize();

		WebElement currentage = driver.findElement(By.xpath("//input[@id='current-age']"));
		
		currentage.sendKeys("40");
		
        WebElement retirementage = driver.findElement(By.xpath("//input[@id='retirement-age']"));
		
        retirementage.sendKeys("68");
        
//        WebElement currentincome = driver.findElement(By.xpath("//input[@id='current-income']"));
//        String test="";
//		test = currentincome.getAttribute("placeholder");
//		System.out.println("Test Data :"+test);
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("document.getElementById('current-income').value='100000'");
		
//        currentincome.sendKeys("100000");
        
//        WebElement spouseincome = driver.findElement(By.xpath("//input[@id='spouse-income']"));
		j.executeScript("document.getElementById('spouse-income').value='75000'");
//        spouseincome.sendKeys("750000");
        
//        WebElement currenttotalsavings = driver.findElement(By.xpath("//input[@id='current-total-savings']"));
		j.executeScript("document.getElementById('current-total-savings').value='500000'");
//        currenttotalsavings.sendKeys("500000");
        
        WebElement currentannualsavings = driver.findElement(By.xpath("//input[@id='current-annual-savings']"));
		
        currentannualsavings.sendKeys("10");
        
        
        WebElement savingsincreaserate = driver.findElement(By.xpath("//input[@id='savings-increase-rate']"));
		
        savingsincreaserate.sendKeys("1");
        
        WebElement SocialSecuritybenefits = driver.findElement(By.xpath("//label[@for='yes-social-benefits']"));
        
        SocialSecuritybenefits.click();
        
        
        WebElement maritalstatus = driver.findElement(By.xpath("//label[@for='married']//preceding-sibling::input"));
        j.executeScript("arguments[0].click();",maritalstatus);
      
//        maritalstatus.click();
        
//        WebElement SocialSecurityoverride = driver.findElement(By.xpath("input[@id='social-security-override']"));
		
//        SocialSecurityoverride.sendKeys("4000");
        
        j.executeScript("document.getElementById('social-security-override').value='4000'");
        
        
        j.executeScript("arguments[0].click();",driver.findElement(By.xpath("//button[contains(@onclick,'calculateResults')]")));
	}
	
	

}
