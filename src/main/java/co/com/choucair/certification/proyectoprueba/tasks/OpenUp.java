package co.com.choucair.certification.proyectoprueba.tasks;

import co.com.choucair.certification.proyectoprueba.userinterface.YoutubeLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private YoutubeLoginPage youtubePage;

    public static OpenUp thePage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(youtubePage));

    }
}
