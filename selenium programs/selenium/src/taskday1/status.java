package taskday1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class status {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\suniljar\\chromedriver.exe");
		ChromeDriver d = new ChromeDriver();
		d.get("https://a2plcpnl0757.prod.iad2.secureserver.net:2096/logout/?locale=en");
		String s=d.getTitle();
		d.findElement(By.id("user")).sendKeys("sunilhn@htmltech.in");
		d.findElement(By.id("pass")).sendKeys("sunil@065");
		d.findElement(By.id("login_submit")).click();
		
		String s1 = d.getTitle();
		if (s.equalsIgnoreCase(s1)) {
			System.out.println("login failed");
		} else {
			System.out.println("logged in");
		}

	}

}
