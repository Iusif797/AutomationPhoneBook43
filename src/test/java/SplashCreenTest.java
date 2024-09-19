import config.AppiumConfig;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.SplashScreen;

public class SplashCreenTest extends AppiumConfig {

    @Test
    public void firstLaunch(){
        String version = new SplashScreen(driver).getTextVersion();
        Assert.assertTrue(version.contains("1.0.0"));
    }


}
