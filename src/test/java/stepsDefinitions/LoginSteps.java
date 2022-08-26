package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class LoginSteps {
	
	@Quando("eu informar no campo username {string}")
	public void euInformarNoCampoUsername(String username) {
	    NaTela(LoginPage.class).informarCampoUsername(username);
	}

	@Quando("eu informar no campo password {string}")
	public void euInformarNoCampoPassword(String password) {
	    NaTela(LoginPage.class).informarCampoPassword(password);
	}

	@Quando("eu clicar no botao login")
	public void euClicarNoBotaoLogin() {
		NaTela(LoginPage.class).clicarBotaoLogin();
	}

	@Entao("^o sistema apresenta o usuario logado$")
	public void oSistemaApresentaOUsuarioLogado() throws Throwable {
		assertEquals("Welcome Admin", driver.findElement(By.id("welcome")).getText());
	}

	@Entao("^o sistema apresenta a mensagem invalid credencials$")
	public void oSistemaApresentaAMensagemInvalidCredencials() throws Throwable {
		assertEquals("Invalid credentials", driver.findElement(By.id("spanMessage")).getText());
	}

}
