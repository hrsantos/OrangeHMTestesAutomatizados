package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

import static utils.Utils.*;


public class Hooks {
	
	@Before()
	public void setUp() {
		acessarSistema();
	}
	//@cadastrarFuncionario and 
	@Before(value = "@consultarFuncionario")
	public void funcionalidadeConsultarFuncionario() {
		acessarSistema();
		NaTela(LoginPage.class).fazerLogin("Admin", "admin123");
	}
	
	@Before(value = "@cadastrarFuncionario")
	public void funcionalidadeCadastrarFuncionario() {
		acessarSistema();
		NaTela(LoginPage.class).fazerLogin("Admin", "admin123");
	}
	
	@After
	public void tearsDown() {
		driver.quit();
	}

}
