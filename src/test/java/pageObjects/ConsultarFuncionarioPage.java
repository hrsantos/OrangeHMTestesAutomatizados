package pageObjects;

import static utils.Utils.driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class ConsultarFuncionarioPage extends BasePage{
	
		Actions acao = new Actions(driver);

		@FindBy(id = "menu_admin_viewAdminModule")
		private WebElement Adm;
		
		@FindBy(id = "menu_pim_viewEmployeeList")
		private WebElement linkEmployeeList;
		
		@FindBy(name = "empsearch[employee_name][empName]")
		private WebElement campoEmployeeName;
		
		@FindBy(name = "_search")
		private WebElement botaoSearch;		
		
		//Base page
		public void clicarNaAbaAdmin() {
			Adm.click();
		}
		
		public void clicarNaAbaPim() {
			acao.moveToElement(abaPim).click().build().perform();
		}
		
		public void clicarNoLinkEmployeeList() {
			linkEmployeeList.click();
		}
		
		public void informarCampoEmployeeName(String employee) {
			campoEmployeeName.sendKeys(employee);
		}
		
		public void clicarNoBotaoSearch() {
			botaoSearch.click();
		}
		
		
		
		
		
		
		
}
