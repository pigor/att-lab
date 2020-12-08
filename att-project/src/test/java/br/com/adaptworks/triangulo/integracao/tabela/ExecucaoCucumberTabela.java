package br.com.adaptworks.triangulo.integracao.tabela;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty", "html:target/cucumber/tabela"},
	features={"src/test/resources/br/com/adaptworks/cucumber/integracao/tabela"})
public class ExecucaoCucumberTabela {
	
}
