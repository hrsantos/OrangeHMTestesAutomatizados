package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.ConsultarFuncionarioPage;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;

import org.openqa.selenium.By;

public class ConsultarFuncionarioSteps {
	
	@Quando("eu clicar na aba admin")
	public void euClicarNaAbaAdmin() {
		NaTela(ConsultarFuncionarioPage.class).clicarNaAbaAdmin();
	}

	@Quando("eu clicar na aba pim")
	public void euClicarNaAbaPim() {
	    NaTela(ConsultarFuncionarioPage.class).clicarNaAbaPim();;
	}

	@Quando("eu clicar na no link employee list")
	public void euClicarNaNoLinkEmployeeList() {
		NaTela(ConsultarFuncionarioPage.class).clicarNoLinkEmployeeList();
	}

	@Quando("informar no campo employee name {string}")
	public void informarNoCampoEmployeeName(String employee) {
		NaTela(ConsultarFuncionarioPage.class).informarCampoEmployeeName(employee);
	}

	@Quando("clicar no botao search")
	public void clicarNoBotaoSearch() {
		NaTela(ConsultarFuncionarioPage.class).clicarNoBotaoSearch();
	}

	@Entao("o sistema ira exibir os funcionarios {string}")
	public void oSistemaIraExibirOsFuncionarios(String string) {
	    assertTrue(driver.findElement(By.linkText(string)).isDisplayed());
	}

}
