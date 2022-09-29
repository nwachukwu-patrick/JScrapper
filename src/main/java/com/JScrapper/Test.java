package com.JScrapper;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

public static void main(String[] args) {
	
// TODO Auto-generated method stub

//setting the driver executable
System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver/chromedriver");
//Creating an object of EdgeDriver
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();

//Deleting all the cookies
driver.manage().deleteAllCookies();

//Specifiying pageLoadTimeout and Implicit wait
driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
/*
 * 
 * instagram scraper
 */
//String url = "https://www.instagram.com/";
//driver.get(url);
//driver.findElement(By.name("username")).sendKeys("thegeorge_philips");
//driver.findElement(By.name("password")).sendKeys("Nwachukwu@06");;
//WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
//login.click();
////Javascript executor to return value
//JavascriptExecutor j = (JavascriptExecutor) driver;
//// checking condition if the URL is loaded
//if (j.executeScript("return document.readyState")
//		.toString().equals("complete")) {
//	WebElement an = driver.findElement(By.className("_acan"));
//	an.click();
//	an = driver.findElement(By.className("_a9--"));
//	an.click();
//	List <WebElement> anchor = driver.findElements(By.tagName("a"));
//	anchor.get(1).click();
//	WebElement search = driver.findElement(By.className("_ab6-"));
//	search.click();
//	search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
//	search.sendKeys("los angeles");
////	login.submit();
//	anchor = driver.findElements(By.xpath("//a[@tabindex=0]"));
//	for(int i = 0; i < anchor.size(); i++) {
//	//anchor.click();
////		anchor.get(27).click();
////		System.out.println("Current url: "+ driver.getCurrentUrl());
////		System.out.println("Current title: "+ driver.getTitle());
//		System.out.println(i + " ==>  "+ anchor.get(i).getText() +anchor.get(i).getAttribute("name"));
//	}
//}
//else {
//   System.out.println("Page did not load");
//}
//driver.quit();


//List <WebElement> anchor = driver.findElements(By.tagName("a"));
//for(int i = 0; i < anchor.size(); i++) {
////anchor.click();
////	anchor.get(27).click();
//	System.out.println("Current url: "+ driver.getCurrentUrl());
//	System.out.println("Current title: "+ driver.getTitle());
//	System.out.println(i + " ==>  "+ anchor.get(i).getText() +anchor.get(i).getAttribute("name"));
//}
/**
 
 * Google scraper
 */

String url = "https://google.com/";
String query = "Getting started with java";
driver.get(url);
WebElement search = driver.findElement(By.name("q"));
search.sendKeys(query);
search.submit();
List <WebElement> h3 = driver.findElements(By.tagName("h3"));
System.out.println("URL to Scrape: "+ driver.getCurrentUrl());
System.out.println();
//h3 query
System.out.println("All the h3 in "+query+"\n");
for(int i = 0; i < h3.size(); i++) {
//anchor.click();
//	anchor.get(27).click();
	if(h3.get(i).getText() == "") {
		
	}else {
//		System.out.println("------------------------------");
//	System.out.println(h3.get(i).getText());
	}
}
	// anchor query
	System.out.println();
	System.out.println("All the links on the WEBPAGE");
	List <WebElement> anchor = driver.findElements(By.tagName("h3"));
	for(int i = 0; i < anchor.size(); i++) {
		
		if(anchor.get(i).getText() == "") {
			
		}else {
			System.out.println("------------------------------");
		System.out.println(anchor.get(i).getText());
		}
	
}

driver.quit();
}

}