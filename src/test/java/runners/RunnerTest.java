package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","html:target/cucumber-report"}, //plugin apresenta no console cada passo executado pelo cucumber
		features = "src/test/resources/features", //Caminho onde as features estão
		glue = "stepsDefinitions", //Pacote que contém os StepsDefinitions
		//tags = "@cadastrarFuncionario",
		snippets = SnippetType.CAMELCASE, //converte o nome dos métodos criados para o padrao camel case
		monochrome = true, //define a cor da fonte apresentada no console no padrão monocromático
		dryRun = false // quando True Apenas gera o teste e não o executa de fato, reduzindo o tempo de teste prévio 
		
		)

public class RunnerTest {

}
