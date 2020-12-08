package br.com.adaptworks.triangulo.integracao.simples;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty", "html:target/cucumber/simples"},
	features={"src/test/resources/br/com/adaptworks/cucumber/integracao/simples"})
public class ExecucaoCucumberSimples {

}
