package com.calidad.calidadautomation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.*;

public class ContinuosToSimulatePage implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(SELECTION_SI)
        );

    }

    public static ContinuosToSimulatePage go(){
        return Tasks.instrumented(ContinuosToSimulatePage.class);
    }
}
