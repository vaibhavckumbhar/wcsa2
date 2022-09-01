package pageObjectModel;

import java.io.IOException;

public class TestActiTimeLogout extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest bt=new BaseTest();
		bt.openbrowser();
		 LoginPage lp = new LoginPage(driver);
		 Flib flib=new Flib();
		 

			lp.ActiTimeValidLogin(flib.readpropertyFileData(PROP_PATH, "username"), flib.readpropertyFileData(PROP_PATH,"password"));
		 Thread.sleep(3000);
		 HomePage hp = new HomePage(driver);
		 hp.logoutActitime();
	}

}
