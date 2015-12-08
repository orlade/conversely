package co.conversely;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Ignore;
import org.springframework.http.HttpStatus;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@Ignore
public class StepDefs extends AbstractDefs {
    @When("^the client calls (.*)$")
    public void the_client_issues_GET_version(String path) throws Throwable {
        executeGet("http://localhost:8080" + path);
    }

    @Then("^the client receives status code of (\\d+)$")
    public void the_client_receives_status_code_of(int statusCode) throws Throwable {
        final HttpStatus currentStatusCode = latestResponse.getTheResponse().getStatusCode();
        assertThat("status code is incorrect : " + latestResponse.getBody(), currentStatusCode.value(), is(statusCode));
    }

    @And("^the client receives server version (.+)$")
    public void the_client_receives_server_version_body(String version) throws Throwable {
        assertThat(latestResponse.getBody(), is(version));
    }
}
