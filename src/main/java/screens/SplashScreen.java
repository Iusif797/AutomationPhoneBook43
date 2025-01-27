package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class SplashScreen extends BaseScreen{
    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/version_text']")
    MobileElement text;

    public SplashScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    public String getTextVersion(){
        return text.getText();
    }
    public AuthenticationScreen switchToAuthenticationScreen(){return new AuthenticationScreen(driver);}


}
