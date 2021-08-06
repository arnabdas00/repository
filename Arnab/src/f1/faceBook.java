package f1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class faceBook {
	public static void main(String[] args) {
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com");
		d.findElement(By.name("email")).sendKeys("aranyadas888@gmail.com");
		d.findElement(By.name("pass")).sendKeys("ahsgssgsshs");
		d.findElement(By.name("login")).click();
		String x = d.findElement(By.xpath("//div[@class='_9ay7']")).getText();
		System.out.println(x);
		d.close();
	}
}
