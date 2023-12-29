package com.adactin;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {

	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\eclipse-workspace\\Maven\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.adactinhotelapp.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("sowmyarevathiraghav");

		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("BTV388");

		driver.findElement(By.xpath("//input[@value='Login']")).click();

		TakesScreenshot ts = (TakesScreenshot) driver;

		File src = ts.getScreenshotAs(OutputType.FILE);

		File des = new File("C:\\Users\\USER\\eclipse-workspace\\Maven\\Screenshot\\ADACTINLOGIN.png");

		FileUtils.copyFile(src, des);

		WebElement location = driver.findElement(By.id("location"));

		Select s = new Select(location);

		s.selectByValue("London");

		WebElement hotels = driver.findElement(By.id("hotels"));

		Select s1 = new Select(hotels);

		s1.selectByValue("Hotel Sunshine");

		WebElement roomtype = driver.findElement(By.id("room_type"));

		Select s2 = new Select(roomtype);

		s2.selectByValue("Double");

		WebElement roomno = driver.findElement(By.id("room_nos"));

		Select s3 = new Select(roomno);

		s3.selectByVisibleText("1 - One");

		WebElement checkin = driver.findElement(By.id("datepick_in"));

		checkin.clear();

		checkin.sendKeys("23/12/2023");

		WebElement checkout = driver.findElement(By.id("datepick_out"));

		checkout.clear();

		checkout.sendKeys("02/01/2024");

		WebElement adults = driver.findElement(By.xpath("//select[@id='adult_room']"));

		Select s4 = new Select(adults);

		s4.selectByValue("2");

		WebElement children = driver.findElement(By.id("child_room"));

		Select s5 = new Select(children);

		s5.selectByIndex(1);

		WebElement srchbtn = driver.findElement(By.id("Submit"));

		srchbtn.click();

		File src1 = ts.getScreenshotAs(OutputType.FILE);

		File des1 = new File("C:\\Users\\USER\\eclipse-workspace\\Maven\\Screenshot\\adactinsearchhotel.png");

		FileUtils.copyFile(src1, des1);

		WebElement radio = driver.findElement(By.xpath("//input[@id='radiobutton_0']"));

		radio.click();

		File src2 = ts.getScreenshotAs(OutputType.FILE);

		File des2 = new File("C:\\Users\\USER\\eclipse-workspace\\Maven\\Screenshot\\adactinhotelbooking.png");

		FileUtils.copyFile(src2, des2);

		WebElement contbtn = driver.findElement(By.id("continue"));

		contbtn.click();

		WebElement frstname = driver.findElement(By.xpath("//input[@name='first_name']"));

		frstname.sendKeys("Soeul");

		WebElement lastname = driver.findElement(By.xpath("//input[@name='last_name']"));

		lastname.sendKeys("C K");

		WebElement address = driver.findElement(By.id("address"));

		address.sendKeys("Chennai");

		driver.findElement(By.xpath("//input[@name='cc_num']")).sendKeys("7869458709457623");

		WebElement cc = driver.findElement(By.xpath("//select[@name='cc_type']"));

		Select s6 = new Select(cc);

		s6.selectByValue("VISA");

		WebElement expmnth = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));

		Select s7 = new Select(expmnth);

		s7.selectByVisibleText("March");

		WebElement expyr = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));

		Select s8 = new Select(expyr);

		s8.selectByVisibleText("2025");

		WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));

		cvv.sendKeys("589");

		File src3 = ts.getScreenshotAs(OutputType.FILE);

		File des3 = new File("C:\\Users\\USER\\eclipse-workspace\\Maven\\Screenshot\\bookhoteladactin.png");

		FileUtils.copyFile(src3, des3);

		driver.findElement(By.xpath("//input[@name='book_now']")).click();

		Thread.sleep(8000);

		File src4 = ts.getScreenshotAs(OutputType.FILE);

		File des4 = new File("C:\\Users\\USER\\eclipse-workspace\\Maven\\Screenshot\\bookincnfrmd.png");

		FileUtils.copyFile(src4, des4);
		
		driver.findElement(By.id("my_itinerary")).click();
		
		Thread.sleep(3000);

		File src5 = ts.getScreenshotAs(OutputType.FILE);

		File des5 = new File("C:\\Users\\USER\\eclipse-workspace\\Maven\\Screenshot\\itinerary.png");

		FileUtils.copyFile(src5, des5);
		
		driver.findElement(By.id("logout")).click();

		
		
		
		
		
		
		
		
		
	}
}
