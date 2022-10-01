import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bind.annotation.Super;

public class Mytest1 extends Mytest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M&M\\Myworkspace\\Rajeshnew\\Drivers\\chromedriver.exe");
		Mytest2 test2 = new Mytest2();
	

System.out.println("empty methods in test1");




	}

}
