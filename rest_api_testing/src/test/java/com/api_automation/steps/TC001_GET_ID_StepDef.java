package com.api_automation.steps;

import io.cucumber.java.en.*;

public class TC001_GET_ID_StepDef {

    @Given("Open GET Request")
    public void Open_GET_Request() {
        System.out.println("kc Open GET Request");
    }

    @When("check the response")
    public void check_the_response() {
        System.out.println("kc check the response");
    }

    @Then("print response")
    public void print_response() {
        System.out.println("kc print response");
    }
}