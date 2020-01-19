package com.util;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listenter extends CommonMethods implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		System.out.println("Test started"+result.getName());
	}
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed "+result.getName());
		CommonMethods.takeScreenshot("passed/"+result.getName());
	  }
	public void onTestFailure(ITestResult result) {
		System.out.println("Test faliled"+result.getName()); 
		CommonMethods.takeScreenshot("failed/"+result.getName());
	  }
		
	}

