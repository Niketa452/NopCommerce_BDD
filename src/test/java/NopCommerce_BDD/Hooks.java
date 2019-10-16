package NopCommerce_BDD;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Hooks extends BasePage {

    BrowserSelector browserSelector= new BrowserSelector();
    LoadProp props=new LoadProp();

    @Before
    public void setupBrowser() {
        browserSelector.setUpBrowser();
        driver.manage().window().fullscreen();//to maximise the web page.
        driver.manage().timeouts().implicitlyWait(30, SECONDS);//waiting time before opening teh website
        driver.get(props.getProperty("url"));
    }
    @After
    public void teardown(Scenario scenario) {
        if (scenario.isFailed()){
            Utils.takeScreenshot(driver, scenario.getName());
        }
        driver.close();
    }


}
