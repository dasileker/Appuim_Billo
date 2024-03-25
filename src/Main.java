import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "13.O");
        desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Xiaomi 21081111RG");
        desiredCapabilities.setCapability("appPackage", "life.billo.app.dev");
        desiredCapabilities.setCapability("appActivity", "life.billo.app.ui.login.LoginActivity");
        desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 3600);

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        AndroidDriver driver = new AndroidDriver(remoteUrl, desiredCapabilities);

        String sessionId = driver.getSessionId().toString();
        System.out.println("Session ID: " + sessionId);


        /*
        System.out.println("Start testing login");

        driver.findElement(By.id("life.billo.app.dev:id/nextBnt")).click();
        driver.findElement(By.id("life.billo.app.dev:id/nextBnt")).click();
        driver.findElement(By.id("life.billo.app.dev:id/nextBnt")).click();
        driver.findElement(By.id("life.billo.app.dev:id/nextBnt")).click();

        System.out.println("Clicked on next button");

        // Continue with the rest of your code

        // Handle the pop-up if it appears
        WebDriverWait popUpWait = new WebDriverWait(driver, Duration.ofSeconds(55));
        By popUpLocator = By.id("life.billo.app.dev:id/ib_core_lyt_onboarding_pager_fragment");
        WebElement popUpElement = popUpWait.until(ExpectedConditions.visibilityOfElementLocated(popUpLocator));
        // Add code to handle the pop-up as needed (e.g., dismiss it)

        System.out.println("Handled pop-up");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement loginElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("life.billo.app.dev:id/login")));
        loginElement.click();

        System.out.println("Clicked on login button");

        // Billo BankId login
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(45));
        WebElement BankId = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("life.billo.app.dev:id/bankid")));
        BankId.click();

        System.out.println("Clicked on BankId button");

        WebDriverWait Cancel = new WebDriverWait(driver, Duration.ofSeconds(35));
        WebElement CancelBankId = Cancel.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.ImageButton[@content-desc=\"Revenir en haut de la page\"]")));
        CancelBankId.click();

        System.out.println("Clicked on Cancel BankId button");

        WebDriverWait SessionAborted = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement ClickSessionAborted = SessionAborted.until(ExpectedConditions.visibilityOfElementLocated(By.id("life.billo.app.dev:id/ok")));
        ClickSessionAborted.click();

        System.out.println("Clicked on Session Aborted button");

        WebDriverWait SomethingWrong = new WebDriverWait(driver, Duration.ofSeconds(25));
        WebElement CancelSomethingWrong = SomethingWrong.until(ExpectedConditions.visibilityOfElementLocated(By.id("life.billo.app.dev:id/cancel")));
        CancelSomethingWrong.click();

        System.out.println("Clicked on Cancel Something Wrong button");

        System.out.println("BankId testing login pass");


         */

        System.out.println("Start testing SSN login");

        driver.findElement(By.id("life.billo.app.dev:id/nextBnt")).click();
        driver.findElement(By.id("life.billo.app.dev:id/nextBnt")).click();
        driver.findElement(By.id("life.billo.app.dev:id/nextBnt")).click();
        driver.findElement(By.id("life.billo.app.dev:id/nextBnt")).click();

        System.out.println("Clicked on 4 next button");

        // Continue with the rest of your code

        // Handle the pop-up if it appears
        WebDriverWait popUpWait = new WebDriverWait(driver, Duration.ofSeconds(55));
        By popUpLocator = By.id("life.billo.app.dev:id/ib_core_lyt_onboarding_pager_fragment");
        WebElement popUpElement = popUpWait.until(ExpectedConditions.visibilityOfElementLocated(popUpLocator));
        // Add code to handle the pop-up as needed (e.g., dismiss it)

        System.out.println("Handled pop-up");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        WebElement loginElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("life.billo.app.dev:id/login")));
        loginElement.click();

        System.out.println("Clicked on login button");

        WebDriverWait Ssn = new WebDriverWait(driver, Duration.ofSeconds(45));
        WebElement LoginSSn = Ssn.until(ExpectedConditions.visibilityOfElementLocated(By.id("life.billo.app.dev:id/ssn")));
        LoginSSn.click();
        System.out.println("Selected on Ssn login button");

        WebDriverWait ssnWait = new WebDriverWait(driver, Duration.ofSeconds(40));
        WebElement SsnWait = ssnWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("life.billo.app.dev:id/ssn")));
        SsnWait.sendKeys("198809266953");  // Replace "123456789" with the desired input

        System.out.println("Entered the appropriate SSN ID in the input");

        WebDriverWait SsnLogin = new WebDriverWait(driver, Duration.ofSeconds(35));
        WebElement SsnLoginButton = SsnLogin.until(ExpectedConditions.visibilityOfElementLocated(By.id("life.billo.app.dev:id/login")));
        SsnLoginButton.click();

        System.out.println("Clicked on SSN login button");

        WebDriverWait NotificationPopUp = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement AllowNotificationPopup = NotificationPopUp.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.android.permissioncontroller:id/permission_allow_button")));

        if (AllowNotificationPopup.isDisplayed()) {
            AllowNotificationPopup.click();
            System.out.println("Clicked on Allow Notification popup");
        }

        WebDriverWait AuthorityMailPopup = new WebDriverWait(driver, Duration.ofSeconds(25));
        WebElement DoItLater = AuthorityMailPopup.until(ExpectedConditions.visibilityOfElementLocated(By.id("life.billo.app.dev:id/cancel")));

        if (DoItLater.isDisplayed()) {
            DoItLater.click();
            System.out.println("Clicked on Authority Mail popup (Do It Later)");
        }

        System.out.println("SSN testing pass");


/*
 // switching to the bankID app to proccess the verification pin before login
// Get the current context handles
        Set<String> contextHandles = driver.getContextHandles();

// Switch the context to the "com.bankid.bus" app
        for (String contextHandle : contextHandles) {
            if (contextHandle.contains("com.bankid.bus")) {
                driver.context(contextHandle);
                break;
            }
        }

        // checking functionalilty of the button from 1 to 12
        try {
            WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement button1 = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/com.bankid.bus.activities.widgets.BisaSlidingDrawer/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[1]")));
            button1.click();
        } catch (NoSuchElementException e) {
            System.out.println("Element not found: " + e.getMessage());
            // Handle the exception or add additional logic
        }
        try {
            WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement button1 = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/com.bankid.bus.activities.widgets.BisaSlidingDrawer/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[9]")));
            button1.click();
        } catch (NoSuchElementException e) {
            System.out.println("Element not found: " + e.getMessage());
            // Handle the exception or add additional logic
        }

        try {
            WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement button1 = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/com.bankid.bus.activities.widgets.BisaSlidingDrawer/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[9]")));
            button1.click();
        } catch (NoSuchElementException e) {
            System.out.println("Element not found: " + e.getMessage());
            // Handle the exception or add additional logic
        }try {
            WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement button1 = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/com.bankid.bus.activities.widgets.BisaSlidingDrawer/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[11]")));
            button1.click();
        } catch (NoSuchElementException e) {
            System.out.println("Element not found: " + e.getMessage());
            // Handle the exception or add additional logic
        }

        try {
            WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement button1 = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/com.bankid.bus.activities.widgets.BisaSlidingDrawer/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[11]")));
            button1.click();
        } catch (NoSuchElementException e) {
            System.out.println("Element not found: " + e.getMessage());
            // Handle the exception or add additional logic
        }try {
            WebDriverWait wait3 = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement button1 = wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/com.bankid.bus.activities.widgets.BisaSlidingDrawer/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[8]")));
            button1.click();
        } catch (NoSuchElementException e) {
            System.out.println("Element not found: " + e.getMessage());
            // Handle the exception or add additional logic
        }

        WebDriverWait wait4 = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement button1 = wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/com.bankid.bus.activities.widgets.BisaSlidingDrawer/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.GridView/android.widget.LinearLayout[12]")));
        button1.click();*/





    }
}
