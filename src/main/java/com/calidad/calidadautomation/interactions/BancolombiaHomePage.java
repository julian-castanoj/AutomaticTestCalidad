package com.calidad.calidadautomation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

//import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.INPUT_TEXT;
import java.util.Random;

import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.*;


public class BancolombiaHomePage implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CLOSE_ADS),
                Click.on(LINK_PAGE_CREDITO_CONSUMO)
        );

    }

    public static BancolombiaHomePage go(){
        return Tasks.instrumented(BancolombiaHomePage.class);
    }
}
