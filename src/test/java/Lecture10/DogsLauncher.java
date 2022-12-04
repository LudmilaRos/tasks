package Lecture10;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(plugin = "pretty",
            features = {"src/test/resources/features"},
            glue = {"lecture10/steps"},
            tags = "@Dogs")
    public class DogsLauncher {
    }


