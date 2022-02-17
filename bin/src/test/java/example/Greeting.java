package example;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import org.testng.Assert;

public class Greeting {

  public String name, res;

  @Given("Name")
  public void createName() {
     this.name = "Steve";
  }

  @When("Pass name to function")
  public void passName() {
     this.res = "Hello World, " + this.name;
  }

  @Then("Response should be Hello World, Steve")
  public void checkMessage() {
     Assert.assertEquals(this.res, "Hello World, Steve");
  }

}
