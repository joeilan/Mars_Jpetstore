package driver;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.chrome.ChromeOptions;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class WebDriverManagerDemo {

		public static void main(String[] args) {
			ChromeOptions chromeOptions = new ChromeOptions();
			WebDriverManager.chromedriver().setup();
		
		//	return 
			WebDriver driver = new ChromeDriver(chromeOptions);
			
			// Navigate to the demoqa website
			driver.get("https://www.demoqa.com");
			
			driver.quit();

		}

	}


