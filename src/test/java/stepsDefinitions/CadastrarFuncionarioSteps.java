package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarFuncionarioPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class CadastrarFuncionarioSteps {

	@Quando("eu clicar na aba PIM")
	public void euClicarNaAbaPIM() {
	    NaTela(CadastrarFuncionarioPage.class).clicarNaAbaPim();
	}

	@Quando("eu clicar no botao add")
	public void euClicarNoBotaoAdd() {
	    NaTela(CadastrarFuncionarioPage.class).clicarNoBotaoAdd();
	}

	@Quando("informar no campo first name {string}")
	public void informarNoCampoFirstName(String nome) {
	   NaTela(CadastrarFuncionarioPage.class).informarCampoFirstName(nome);
	}

	@Quando("informar no campo middle name {string}")
	public void informarNoCampoMiddleName(String middletName) {
	    NaTela(CadastrarFuncionarioPage.class).informarCampoMiddletName(middletName);
	}

	@Quando("informar no campo last name {string}")
	public void informarNoCampoLastName(String lastName) {
	    NaTela(CadastrarFuncionarioPage.class).informarCampoLastName(lastName);
	}

	@Quando("clicar no botao save")
	public void clicarNoBotaoSave() {
	    NaTela(CadastrarFuncionarioPage.class).clicarNoBotaoSave();
	}

	@Entao("o sistema cadastra o usuario {string}")
	public void oSistemaCadastraOUsuario(String usuario) {
	    assertTrue(driver.findElement(By.xpath("//h1[contains(text(),'"+ usuario +"')]")).isDisplayed());
	}
}
