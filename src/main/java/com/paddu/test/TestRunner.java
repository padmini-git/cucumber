package com.paddu.test;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features", // Path to the .feature file(s)
    glue = {"com.paddu.test"}                   // Path to the package containing step definitions
)
public class TestRunner {
}
