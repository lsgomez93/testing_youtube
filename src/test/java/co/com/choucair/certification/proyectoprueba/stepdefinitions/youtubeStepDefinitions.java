package co.com.choucair.certification.proyectoprueba.stepdefinitions;

import co.com.choucair.certification.proyectoprueba.model.YouTubeData;
import co.com.choucair.certification.proyectoprueba.model.YouTubeSearchData;
import co.com.choucair.certification.proyectoprueba.questions.Answer;
import co.com.choucair.certification.proyectoprueba.tasks.Login;
import co.com.choucair.certification.proyectoprueba.tasks.OpenUp;
import co.com.choucair.certification.proyectoprueba.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;


public class youtubeStepDefinitions {


    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than mike wants to watch video$")
    public void thanMikeWantsToWatchVideo(List<YouTubeData> youTubeData){
        OnStage.theActorCalled("Mike").wasAbleTo(OpenUp.thePage(), Login.onThePage(youTubeData.get(0).getStrUserName(),youTubeData.get(0).getStrPassword()));
    }

    @When("^he search the$")
    public void heSearchTheVideoBeethoven(List<YouTubeSearchData> youTubeSearchData)throws Exception{
        OnStage.theActorInTheSpotlight().attemptsTo(Search.onThePage(youTubeSearchData.get(0)));
    }

    @Then("^he should see at least  listed$")
    public void heShouldSeeAtLeastVideoListed(List<YouTubeSearchData> youTubeSearchData)throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(youTubeSearchData.get(0))));

    }
}
