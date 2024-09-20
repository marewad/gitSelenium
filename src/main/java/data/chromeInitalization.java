package data;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.epam.healenium.SelfHealingDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chromeInitalization {

	String screenValue = "cargo";
	WebDriver driver;
	// WebDriver SelfHealingDriver;

	// @BeforeClass
	public WebDriver initalization() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver delegate = new ChromeDriver();
		SelfHealingDriver driver = SelfHealingDriver.create(delegate);
		driver.manage().window().maximize();
		driver.get("https://vaadin.dev.dawinci.cloud");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("marewdny");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ko20la");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[contains(text(), 'Login')]")).click();
        
        Thread.sleep(5000);
		return driver;

		// WebDriver driver = n.k();
//		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("marewdny");
//		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("ko20la");
//		driver.findElement(By.xpath("//button[contains(text(), 'Login')]")).click();
//		Thread.sleep(5000);
//		loginPage p = new loginPage(driver);
//		p.loginTest("marewdny","ko20la");
//		CargoPage c = new CargoPage(driver);
//		c.sendCargoValue();
	}

}
//	   driver.findElement(By.xpath("//input[@id=\"input-vaadin-text-field-11\"]")).sendKeys("Cargo");
//        Thread.sleep(3000);
//		List<WebElement> name =driver.findElements(By.xpath("//vaadin-grid/vaadin-grid-cell-content/vaadin-grid-tree-toggle"));
//	
//		Actions action = new Actions(driver);
//		
//		for (WebElement element : name) {
//            String text = element.getText();
//            System.out.println("Value: " + text);
//            if(text.equalsIgnoreCase("Cargo")) {
//            	Thread.sleep(3000);
//            	
//            	action.click(element).build().perform();
//            	
//            	break;
//            	
//            }
//            
//        	
//        }
//		
//		//Create new cargo
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"nav.DN_CARGO_ID_NO\"]")).click();
//		driver.findElement(By.xpath("//*[@id=\"nav.DN_CARGO_ID_NO\"]")).sendKeys(Keys.BACK_SPACE);
//		driver.findElement(By.xpath("//*[contains(text(), 'New')]")).click();
//		Thread.sleep(3000);

//		String o= driver.findElement(By.xpath("//*[@id=\"DETAILS.details.DN_CARGO_ID_NO\"]")).getAttribute("value");;
//		System.out.print(o+"edddddddddddddddddddd");
//;		driver.findElement(By.xpath("//*[@id=\"DETAILS.details.START_LOCATION\"]")).sendKeys("BGO");
//		driver.findElement(By.xpath("//*[@id=\"DETAILS.details.END_LOCATION\"]")).sendKeys("STA");
//		
//      WebElement d=  driver.findElement(By.xpath("//*[@id=\"DETAILS.details.DESCRIPTION\"]"));
//      ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", d);
//    d.sendKeys("s");
//        driver.findElement(By.xpath("//*[@id=\"DETAILS.details.ITEM_NO_1_WEIGHT_KG\"]")).sendKeys("10");
//        driver.findElement(By.xpath("//*[contains(text(), 'Save')]")).click();

// verify on Registered
// Thread.sleep(3000);
// driver.findElement(By.xpath("//*[@id=\"nav.DN_CARGO_ID_NO\"]")).sendKeys(o);
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//*[@id=\"nav.CARGO_STATUS_POPUP\"]")).sendKeys("Registered");
//		driver.findElement(By.xpath("//*[@id=\"nav.BTN_QUERY\"]")).click();
//
//	}
