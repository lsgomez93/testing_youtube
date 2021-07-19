package co.com.choucair.certification.proyectoprueba.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    public static final Target BUTTON_LOGIN = Target.the("button show form login")
            .located(By.xpath("//tp-yt-paper-button[@id='button']//yt-formatted-string[contains(text(), 'Acceder')]"));
    public static final Target ITEM_OTRA_CUENTA = Target.the("were do we clic other account")
            .located(By.xpath("//div[@class='BHzsHc']//div[contains(text(), 'Usar otra cuenta')]"));
    public static final Target INPUT_EMAIL = Target.the("were do we write email")
            .located(By.xpath("//input[@id='identifierId']"));
    public static final Target BUTTON_NEXT_EMAIL = Target.the("button send data")
            .located(By.xpath("//span[contains(text(), 'Siguiente')]"));
    public static final Target INPUT_PASSWORD = Target.the("were do we write password")
            .located(By.xpath("//input[@name='password']"));
    public static final Target BUTTON_NEXT_PASS = Target.the("button send data")
            .located(By.xpath("//span[contains(text(), 'Siguiente')]"));
}
