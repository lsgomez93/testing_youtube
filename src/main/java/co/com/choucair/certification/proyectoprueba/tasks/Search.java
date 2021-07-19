package co.com.choucair.certification.proyectoprueba.tasks;


import co.com.choucair.certification.proyectoprueba.model.YouTubeSearchData;
import co.com.choucair.certification.proyectoprueba.userinterface.SearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Search implements Task {
    private YouTubeSearchData youTubeSearchData;

    public Search(YouTubeSearchData youTubeSearchData) {
        this.youTubeSearchData = youTubeSearchData;
    }

    public static Search onThePage(YouTubeSearchData youTubeSearchData) {
    return Tasks.instrumented(Search.class,youTubeSearchData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println(youTubeSearchData.getStrNameVideo());
        actor.attemptsTo(Enter.theValue(youTubeSearchData.getStrNameVideo()).into(SearchPage.INPUT_SEARCH),
                Click.on(SearchPage.BUTTON_SEARH),
                Click.on(SearchPage.NAV_TITLE_VIDEO)
        );
    }
}
