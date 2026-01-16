package com.imt.mines.bank.bdd;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.imt.mines.bank.bdd",
        plugin = {
                "pretty"
        }
)
public class RunBankAccountCucumberTest {

}
