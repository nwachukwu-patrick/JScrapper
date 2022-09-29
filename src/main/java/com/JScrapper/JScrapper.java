package com.JScrapper;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JScrapper {

	public String driverlocation = "";
	private String browser = "";
	private String url = "";
	WebDriver webDriver = null;
	public JScrapper(String url,String browser,String driverlocation) {
		try{
		this.driverlocation = driverlocation;
		this.browser = browser;
		this.url = url;
		if(this.url.isEmpty())System.out.println("url is empty");
		System.setProperty("webdriver."+this.browser+".driver", this.driverlocation);
		webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		webDriver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		webDriver.manage().deleteAllCookies();
		webDriver.get(this.url);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	public void getLink() {
		

	}
	public void quit() {
		this.webDriver.quit();

	}
	
	public void getAllLink() {
		List<WebElement> tag =  this.webDriver.findElements(By.tagName("a"));
		ArrayList<Integer> number = new ArrayList<>();
		for(int i = 0; i < tag.size(); i++) {
			if(tag.get(i).getText().isEmpty()) {
				
			}else {
				number.add(i);
				System.out.println(tag.get(i).getText());
			}
		}
		System.out.println("Total link is: "+ number.size());
	}
	
	public static void main(String[] args) {
		JScrapper jScrapper = new JScrapper("https://www.geeksforgeeks.org/arraylist-foreach-method-in-java/",
				"chrome","/usr/bin/chromedriver/chromedriver");
		jScrapper.getAllLink();
		jScrapper.quit();
	}
	
	
	

}
