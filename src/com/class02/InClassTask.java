package com.class02;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import com.util.CommonMethods;
import com.util.Constants;

public class InClassTask extends CommonMethods{

	@BeforeMethod
	public void open() {
		setUp("chrome", Constants.HRMS_URL);
	}
	@Test
	public void login() {
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Add Employee")));
		driver.findElement(By.linkText("Add Employee")).click();
		
		//Adding a new emplpyee
		
		String firstName="John";
		String lastName="Smith";
		driver.findElement(By.id("firstName")).sendKeys(firstName);
		driver.findElement(By.id("lastName")).sendKeys(lastName);
		//store an employee id
		String empID = driver.findElement(By.id("employeeId")).getAttribute("value");
		System.out.println("Employee has been added. Employee ID is: "+empID);
		driver.findElement(By.id("btnSave")).click();
	}

}
