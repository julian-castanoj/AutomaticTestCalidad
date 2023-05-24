package com.calidad.calidadautomation.tasks;

import com.calidad.calidadautomation.interactions.SimulationPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.SELECT_DAY;
import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.SELECT_DATE;
import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.SELECT_YEAR;
import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.SELECT_MONTH;

public class SimulateCredits implements Task {
    private final PageObject page;

    public SimulateCredits(PageObject page){
        this.page = page;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SimulationPage.go()
        );
    }

    public static SimulateCredits onPage(PageObject page) {
        return Tasks.instrumented(SimulateCredits.class,page);
    }

}
