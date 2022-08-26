package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastrarFuncionarioPage extends BasePage{


	@FindBy(name = "btnAdd")
	public WebElement botaoAdd;

	@FindBy(name = "firstName")
	public WebElement campoFirstName;

	@FindBy(name = "middleName")
	public WebElement campoMiddleName;

	@FindBy(name = "lastName")
	public WebElement campoLastName;

	@FindBy(id = "btnSave")
	public WebElement botaoSave;

	public void clicarNaAbaPim() {
		abaPim.click();
	}

	public void clicarNoBotaoAdd() {
		botaoAdd.click();
	}

	public void informarCampoFirstName(String firstName) {
		campoFirstName.sendKeys(firstName);
	}

	public void informarCampoMiddletName(String middletName) {
		campoMiddleName.sendKeys(middletName);
	}

	public void informarCampoLastName(String lastName) {
		campoLastName.sendKeys(lastName);
	}
	
	public void clicarNoBotaoSave() {
		botaoSave.click();
	}

}
