package co.com.choucair.certification.proyectoprueba.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchPage {

    public static final Target INPUT_SEARCH = Target.the("were do we write video name")
            .located(By.xpath("//input[@id='search']"));
    public static final Target BUTTON_SEARH = Target.the("")
            .located(By.xpath("//button[@id='search-icon-legacy']"));
    public static final Target NAV_TITLE_VIDEO = Target.the("we do we clic to watch video")
            .located(By.xpath("//a[@id='video-title']"));
    public static final Target NAME_VIDEO = Target.the("extrae name video")
            .located(By.xpath("//h1[@class='title style-scope ytd-video-primary-info-renderer']"));
}
