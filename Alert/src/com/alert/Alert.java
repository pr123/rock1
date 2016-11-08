package com.alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver//chromedriver.exe");
		WebDriver driver=new  ChromeDriver();
		driver.get("http://demo.guru99.com/V4/");
		driver.findElement(By.name("uid")).sendKeys("mngr30127");
		driver.findElement(By.name("password")).sendKeys("EzAtAqy");
		driver.findElement(By.name("btnLogin")).click();
		


		
		

	}

}
