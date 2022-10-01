import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mytest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\M&M\\Myworkspace\\Rajeshnew\\Drivers\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.gmail.com");
		int a = 3;
		System.out.println(a);
			int b= 34;
System.out.println(b);

int c = a + b;

System.out.println(c);
	}

}
