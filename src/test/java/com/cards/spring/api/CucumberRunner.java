package com.cards.spring.api;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        strict = true,
        tags = { "@Card" },
        plugin = {"html:target/cucumber-report", "json:target/cucumber-json.json" },
        features = "classpath:features",
        glue = "com.cards.spring.api.bdd"


)
public class CucumberRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }

}
