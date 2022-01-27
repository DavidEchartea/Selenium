package steps;

import io.cucumber.java.en.*;
import pages.GooglePage;


public class googleSteps {

    GooglePage google = new GooglePage();

    @Given("^Im on the google search page$")
    public void navigateToGoogle(){
       google.navigateToGoogle();
    }

    @When("^I enter the search criteria$")
    public void enterSearchCriteria(){
        
    }

    @And("^Click on the search button$")
    public void ClickSearchButton(){
        
    }

    @Then("^the results match the criteria$")
    public void validateResults(){
        
    }

}
