package com.calidad.calidadautomation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.*;

public class CreditsPage implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(LINK_PAGE_SIMULAR_CREDITO)

        );

    }
    public static CreditsPage go(){
        return Tasks.instrumented(CreditsPage.class);
    }
}
