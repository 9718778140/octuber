package com.mypileline;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



		public class Test2Fire {

			
			public String baseUrl = "https://panel.izooto.com/en/login";  
			String driverPath = "/Users/vipin/Documents/seleautomation"; 
			// /Users/vipin/Documents/seleautomation/chromedriver_mac64
			public WebDriver driver ;   
			@Test             
			public void test() throws InterruptedException {      
		 
			driver = new FirefoxDriver();  
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
			driver.manage().window().maximize();  
			driver.get(baseUrl);  
			// get the current URL of the page  
			String URL= driver.getCurrentUrl();  
			System.out.print(URL);  
			//get the title of the page  
			String title = driver.getTitle();
			 //driver.find_element(By.xpath, "//form[input/@name ='search']");
			System.out.println(title);  
			Thread.sleep(2000);
			
			 driver.get("https://panel.izooto.com/");
			 driver.manage().window().maximize();
			 Thread.sleep(2000);
			 // wrong email id and wrong passowrd case test
			 Thread.sleep(2000);
			 driver.close();
		    }
		

	}



