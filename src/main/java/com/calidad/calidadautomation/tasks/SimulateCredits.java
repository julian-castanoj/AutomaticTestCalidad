package com.calidad.calidadautomation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.SELECT_DAY;
import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.SELECT_DATE;
import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.SELECT_YEAR;
import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.SELECT_MONTH;

public class SimulateCredits implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_DATE),
                Click.on(SELECT_YEAR),
                Click.on(SELECT_MONTH),
                Click.on(SELECT_DAY)
        );
    }

    public static SimulateCredits input() {
        return Tasks.instrumented(SimulateCredits.class);
    };


}
