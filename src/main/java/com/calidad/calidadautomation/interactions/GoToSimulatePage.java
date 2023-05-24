package com.calidad.calidadautomation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.*;

public class GoToSimulatePage implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BUTTON_CONTINUAR)
        );
    }

    public static GoToSimulatePage go(){
        return Tasks.instrumented(GoToSimulatePage.class);
    }
}
