package pageObjectModel;

import java.io.IOException;

public class TestActiTimeValidLogin extends BaseTest {

	public static void main(String[] args) throws IOException {
		
		BaseTest bt=new BaseTest();
		bt.openbrowser();
		LoginPage lp = new LoginPage(driver);
		Flib flib=new Flib();
		lp.ActiTimeValidLogin(flib.readpropertyFileData(PROP_PATH, "username"), flib.readpropertyFileData(PROP_PATH,"password"));

	}

}
