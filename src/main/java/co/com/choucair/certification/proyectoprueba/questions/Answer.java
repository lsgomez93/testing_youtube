package co.com.choucair.certification.proyectoprueba.questions;

import co.com.choucair.certification.proyectoprueba.model.YouTubeSearchData;
import co.com.choucair.certification.proyectoprueba.userinterface.SearchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {


    public Answer(YouTubeSearchData youTubeSearchData) {
        this.youTubeSearchData = youTubeSearchData;
    }
    private YouTubeSearchData youTubeSearchData;

    public static Answer toThe(YouTubeSearchData youTubeSearchData) {
        return new Answer(youTubeSearchData);
    }


    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;

        String nameVideo = Text.of(SearchPage.NAME_VIDEO).viewedBy(actor).asString();
        System.out.println(youTubeSearchData.getStrNameVideo());
        System.out.println(nameVideo);
        if (youTubeSearchData.getStrNameVideo().equals(nameVideo)) {
            result = true;
            System.out.println("Los nombres coinciden");
        } else {
            result = false;

        }
        return result;
    }

    @Override
    public String getSubject() {
        return null;
    }
}
