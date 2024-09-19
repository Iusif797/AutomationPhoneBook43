package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class AuthenticationScreen extends BaseScreen {
    @FindBy(xpath = "//*[@resource-id='com.sheygam.contactapp:id/action_bar']/android.widget.TextView")
    MobileElement titleText;
    @FindBy(id = "com.sheygam.contactapp:id/inputEmail")
    MobileElement inputEmailField;
    @FindBy(id = "com.sheygam.contactapp:id/inputPassword")
    MobileElement inputPasswordField;
    @FindBy(id = "com.sheygam.contactapp:id/regBtn")
    MobileElement registrationButton;
    @FindBy(id = "com.sheygam.contactapp:id/loginBtn")
    MobileElement loginButton;


    public AuthenticationScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    public AuthenticationScreen fillEmailField(String email){
        waitForAnElement(inputEmailField);
        inputEmailField.sendKeys(email);
        return this;
    }
    public AuthenticationScreen fillPasswordField(String password){
        inputPasswordField.sendKeys(password);
        return this;
    }
    // Task
    public <T extends BaseScreen> T clickLoginButton(){

    }
}