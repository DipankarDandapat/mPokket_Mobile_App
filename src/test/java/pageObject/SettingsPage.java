package pageObject;

import pageObject.screen.ScreenActions;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public final class SettingsPage extends ScreenActions {

    @AndroidFindBy(accessibility = "test-LOGOUT")
    private static MobileElement logOutButton;

    public LoginPage pressLogOutButton() {
        click(logOutButton, "Logout");
        return new LoginPage();
    }
}
