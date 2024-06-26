package projeto.teste.ui.tricents.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/resources/Features",
glue = "projeto.teste.ui.tricents.steps",
tags = "@caminhofeliz",
dryRun = false,
monochrome = true,
snippets = SnippetType.CAMELCASE,
plugin = {"pretty","html:target/cucumber-report.html"}
		
		)

public class Executa {

}
