package NopCommerce_BDD;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

public class BrowserSelector extends Utils{
    LoadProp props = new LoadProp();


    public void setUpBrowser(){
        String browser= props.getProperty("browser");//Storing the value of browser of config file in a string

        if(browser.equalsIgnoreCase("chrome")){
            System.setProperty("webdriver.chrome.driver", "src\\test\\java\\Resources\\Webdriver\\chromedriver.exe");//calling the chromedriver path
            ChromeOptions options= new ChromeOptions();
            //options.addArguments("disable-infobars");
            //options.addArguments("--disable-extensions");
            //options.addArguments("--disable-setUpBrowser-side-navigation");
            //options.addArguments("incognito");
            //options.addArguments("--disable-blink-features=BlockCredentialedSubresources");
            //driver=new ChromeDriver(options);
            driver = new ChromeDriver();//creating chrome driver object

        }
        else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver","src\\test\\java\\Resources\\Webdriver\\geckodriver.exe");
            driver= new FirefoxDriver();
            //DesiredCapabilities ff = DesiredCapabilities.firefox();
            //ff.acceptInsecureCerts();
            //ff.setAcceptInsecureCerts(true);
            //FirefoxOptions options = new FirefoxOptions();
            //options.merge(ff);

        }
        else if(browser.equalsIgnoreCase("InternetExplorer")){
            System.setProperty("webdriver.ie.driver","src\\test\\java\\Resources\\Webdriver\\IEDriverServer.exe");
            InternetExplorerOptions internetExplorerOptions=new InternetExplorerOptions();
            internetExplorerOptions.setCapability(InternetExplorerDriver.IE_SWITCHES,"-private");
            internetExplorerOptions.setCapability(InternetExplorerDriver.IE_ENSURE_CLEAN_SESSION,true);
            driver= new InternetExplorerDriver();

        }
        else{
            System.out.println("Browser name is either empty or typed wrong: " + browser );
        }


    }
















}
