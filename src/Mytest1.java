import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.implementation.bind.annotation.Super;

public class Mytest1 extends Mytest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M&M\\Myworkspace\\Rajeshnew\\Drivers\\chromedriver.exe");
		Mytest2 test2 = new Mytest2();
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.gmail.com");
		int a = 3;
		System.out.println(a);
			int b= 34;
System.out.println(b);

int c = a + b;

System.out.println(c);

System.out.println(test2.a);
System.out.println(test2.b);

System.out.println("Checking the changes in test1")

test2.newadditions();
	}

}
