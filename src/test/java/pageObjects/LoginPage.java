package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	@FindBy(name = "txtUsername")
	public WebElement campoUsername;

	@FindBy(name = "txtPassword")
	public WebElement campoPassword;

	@FindBy(name = "Submit")
	public WebElement botaoLogin;
	

	public void informarCampoUsername(String username) {
		campoUsername.sendKeys(username);
	}

	public void informarCampoPassword(String password) {
		campoPassword.sendKeys(password);
	}

	public void clicarBotaoLogin() {
		botaoLogin.click();
	}
	
	public void fazerLogin(String username, String password) {
		campoUsername.sendKeys(username);
		campoPassword.sendKeys(password);
		botaoLogin.click();
	}

}
