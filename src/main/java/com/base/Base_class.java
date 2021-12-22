package com.base;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Base_class {
	
		public static WebDriver driver;
		
		public static String value;
		
	public static WebDriver browserLaunch(String value) {
		if(value.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
	    driver = new ChromeDriver();
		}
		else if(value.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
		    driver = new FirefoxDriver();
			}
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    return driver;
	}
	public static void get(String url) {
		 driver.get(url);
	}
	public static void getCurrentUrl() {
		  String currentUrl = driver.getCurrentUrl();
		  System.out.println(currentUrl);
	}
	public static void getTitle() {
		String title = driver.getTitle();
	    System.out.println(title);
	}
	
	public static String read_Particular_Data(String path, int row_index, int cell_index) throws Throwable {
		File f = new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(row_index);
		Cell cell = row.getCell(cell_index);
		CellType cellType = cell.getCellType();
		if(cellType.equals(CellType.STRING)) {
		value = cell.getStringCellValue();
		}
		else if (cellType.equals(CellType.NUMERIC)) {
		double value1 = cell.getNumericCellValue();
		int a = (int) value1;
		value = String.valueOf(a);
	}
		return value;
		
	}
	
	public static void getText(WebElement element) {
		String text = element.getText();
		System.out.println(text);
	}
	public static void ElementSendKeys(WebElement element, String keys) {
		element.sendKeys(keys);
	}
	public static void ElementClick(WebElement element) {
		element.click();
	}
	public static void ElementClear(WebElement element) {
		element.clear();
	}
	public static void printAttribute(WebElement element) {
		String attribute = element.getAttribute("value");
		System.out.println(attribute);
	}
	public static List<WebElement> findElementsTagname(String tagname) {
		List<WebElement> list = driver.findElements(By.tagName(tagname));
		return list;
	}
	public static WebElement listGet(List<WebElement> list, int i) {
		WebElement ele = list.get(i);
		return ele;
	}
	
	public static void dropdown(String type, WebElement element, String value) {
		Select s = new Select(element);
		if(type.equalsIgnoreCase("index")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}
		else if (type.equalsIgnoreCase("value")) {
			s.selectByValue(value);
		}
		else if (type.equalsIgnoreCase("text")) {
			s.selectByVisibleText(value);
		}
	}
	
	public static void dropdownOption(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String text = firstSelectedOption.getText();
		System.out.println(text);
	}
	
	public static void dropdownIsMultiple(WebElement element) {
		Select s = new Select(element);
		boolean b = s.isMultiple();
		System.out.println(b);
	}
	 
	 public static void thread(long millis) throws InterruptedException {
		 Thread.sleep(millis);
		 
		}
	 
	public static void takesScreenShot(String path) throws IOException {
		 TakesScreenshot ts = (TakesScreenshot) driver;
		    File g = ts.getScreenshotAs(OutputType.FILE);
		    File h = new File(path);
		    FileHandler.copy(g, h);
		}
	
	public static WebElement findElement(WebElement element) {
			 WebElement ele = element;
			 return ele;
		}
	public static void clear(WebElement ele) {
		ele.clear();
	}
	public static void sendKeys(WebElement ele, String value) {
			ele.sendKeys(value);
		}

	public static void xpathSendKeys(String value, String keys) {
		driver.findElement(By.xpath(value)).sendKeys(keys);
	}
	public static void cssClick(String value) {
		driver.findElement(By.cssSelector(value)).click();
	}
	
	public static int listSize(List<WebElement> l) {
		int size = l.size();
		return size;
	}
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}
	public static void navigateBack() {
		driver.navigate().back();
	}
	public static void navigateForward() {
		driver.navigate().forward();
	}
	public static void navigateRefresh() {
		driver.navigate().refresh();
	}
	public static void alert() {
		driver.switchTo().alert();
	}
	public static void frames(WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}
	public static void robot() {
		
	}
	
}

