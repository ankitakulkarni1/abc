package com.abc.magento;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Magento {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\KULKARNI\\Documents\\projects\\HybridFramework\\src\\com\\abc\\utilities\\Hybrid.properties");
		Properties p = new Properties();
		p.load(fis);
		
		String url = p.getProperty("urldata");
		String email = p.getProperty("emaildata");
		String pass = p.getProperty("passdata");
		
		String myacct = p.getProperty("myacctlocator");
		String email1 = p.getProperty("emaillocator");
		String pass1 = p.getProperty("passlocator");
		String login = p.getProperty("loginlocator");
		String logout = p.getProperty("logoutlocator");
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get(url);
		driver.findElement(By.xpath(myacct)).click();
		driver.findElement(By.xpath(email1)).sendKeys(email);
		driver.findElement(By.xpath(pass1)).sendKeys(pass);
		driver.findElement(By.xpath(login)).click();
		driver.findElement(By.xpath(logout)).click();
		driver.quit();
		
		
	}

}
