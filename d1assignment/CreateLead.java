package week2.d1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Anuradha");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Kumar");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("CSK");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Selenium Automation");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Verify the create lead link");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anu.kumar.venkatesan@gmail.com");
		WebElement statedd = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select ny =new Select(statedd);
        ny.selectByVisibleText("New York");
        driver.findElement(By.name("submitButton")).click();
        String title = driver.getTitle();
        System.out.println(title);
        if(title.contains("View Lead")){
          System.out.println("Title is correct");
	    }else {
		System.out.println("Title is wrong");
        driver.close();

}
}
}