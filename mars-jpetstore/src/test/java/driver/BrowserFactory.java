package driver;


import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {
	


    public WebDriver getBrowser() {

                 
   /* 	FirefoxOptions firefoxOptions = new FirefoxOptions();
    	WebDriverManager.firefoxdriver().setup();
    	return new FirefoxDriver(firefoxOptions);
    	
    	*/
    	
                	
                	ChromeOptions chromeOptions = new ChromeOptions();
        			WebDriverManager.chromedriver().setup();
        		        		
        			return new ChromeDriver(chromeOptions);
                	
              
            }
        
    }

    
    




