package explicitwait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		//d.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en");
		d.manage().window().maximize();
		String s1="Webmail Login";
		
		WebElement wb=d.findElement(By.id("user"));
		WebDriverWait wait=new WebDriverWait(d,10);
		wait.until(ExpectedConditions.visibilityOf(wb));
		
		wb.sendKeys("sunilhn@htmltech.in");
		WebElement wb1=d.findElement(By.id("pass"));
		wb1.sendKeys("sunil@065");
		WebElement login=d.findElement(By.id("login_submit"));
		wait.until(ExpectedConditions.elementToBeClickable(login));
		login.click();
	}

}
