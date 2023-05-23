package com.calidad.calidadautomation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

//import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.INPUT_TEXT;
import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.LINK_PAGE_CREDITO_CONSUMO;
import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.CLOSE_ADS;
import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.LINK_PAGE_SIMULAR_CREDITO;
import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.BUTTON_CONTINUAR;
import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.SELECTION_SI;





public class UdeaHomePage implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        //actor.attemptsTo(Enter.theValue("Bancolombia personas").into(INPUT_TEXT).thenHit(Keys.RETURN));
        actor.attemptsTo(Click.on(CLOSE_ADS));
        actor.attemptsTo(Click.on(LINK_PAGE_CREDITO_CONSUMO));
        actor.attemptsTo(Click.on(LINK_PAGE_SIMULAR_CREDITO));
        actor.attemptsTo(Click.on(BUTTON_CONTINUAR));
        actor.attemptsTo(Click.on(SELECTION_SI));

    }


    public static UdeaHomePage go(){
        return Tasks.instrumented(UdeaHomePage.class);
    }
}
