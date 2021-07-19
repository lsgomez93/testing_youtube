package co.com.choucair.certification.proyectoprueba.tasks;

import co.com.choucair.certification.proyectoprueba.userinterface.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Login implements Task {
    private String strUserName;
    private String strPassword;

    public Login(String strUserName, String strPassword) {
        this.strUserName = strUserName;
        this.strPassword = strPassword;
    }

    public static Login onThePage(String strUserName, String strPassword) {
        return Tasks.instrumented(Login.class, strUserName, strPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LoginPage.BUTTON_LOGIN),
                Enter.theValue(strUserName).into(LoginPage.INPUT_EMAIL),
                Click.on(LoginPage.BUTTON_NEXT_EMAIL),
                Enter.theValue(strPassword).into(LoginPage.INPUT_PASSWORD),
                Click.on(LoginPage.BUTTON_NEXT_PASS)

        );

    }
}
