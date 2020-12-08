package br.com.adaptworks.triangulo.integracao.ui;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty", "html:target/cucumber/tabela_exemplo"},
	features={"src/test/resources/br/com/adaptworks/cucumber/integracao/ui"})
public class ExecucaoCucumberUI {
	
}
