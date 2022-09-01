package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	///declaration
	@FindBy(name="usersSelector.selectedUser")private WebElement enterTimeTrackDropDown;
@FindBy(xpath="//a[contains(text(),'Create new tasks')]")private WebElement createNewTaskLink;
@FindBy(id="SubmitTTButton")private WebElement savechangesButton;
@FindBy(xpath="//a[text()='Logout']")private WebElement logOutLink;

//initialization
public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}


//utilization
public WebElement getEnterTimeTrackDropDown() {
	return enterTimeTrackDropDown;
}

public WebElement getCreateNewTaskLink() {
	return createNewTaskLink;
}

public WebElement getSavechangesButton() {
	return savechangesButton;
}

public WebElement getLogOutLink() {
	return logOutLink;
}

//operational method
public void logoutActitime()
{
	logOutLink.click();
}






}
