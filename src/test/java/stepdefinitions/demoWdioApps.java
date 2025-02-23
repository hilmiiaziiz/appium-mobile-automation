package stepdefinitions;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AutomationName;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class demoWdioApps {

    static AppiumDriver driver;

    @Given("User open the Apps")
    public void openApps() throws InterruptedException, MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();

        options.setPlatformName("Android");
        options.setAutomationName(AutomationName.ANDROID_UIAUTOMATOR2);
        options.setDeviceName("sdk_gphone64_arm64");
        options.setApp(System.getProperty("user.dir") + "/apps/android.wdio.native.app.v1.0.8.apk");
        URL url = new URL("http://127.0.0.1:4723/");
        driver = new AppiumDriver((url), options);
        Thread.sleep(1000);

    }

    @When("^User click (.*) button$")
    public void clickButton(String button) throws InterruptedException {
        driver.findElement(AppiumBy.accessibilityId(button)).click();
        Thread.sleep(2000);
    }

    @And("^User on (.*) input (.*)")
    public void inputUsername(String element, String uname) throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(AppiumBy.accessibilityId(element)).sendKeys(uname);

    }

    @Then("^Verify (.*) text appears$")
    public void verifyText(String value) {
        driver.findElement(AppiumBy.xpath("//*[contains(@text, '" + value + "')]")).isDisplayed();

    }

    @Then("^User click element with (.*) text$")
    public void clickText(String value) {
        driver.findElement(AppiumBy.xpath("//*[contains(@text, '" + value + "')]")).click();

    }

    @And("^User wait (.*) seconds$")
    public void waitElement(int value) {
        driver.manage().timeouts().implicitlyWait(value, TimeUnit.SECONDS);

    }
}