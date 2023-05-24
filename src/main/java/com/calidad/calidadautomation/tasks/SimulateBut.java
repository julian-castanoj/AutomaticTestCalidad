package com.calidad.calidadautomation.tasks;

import com.calidad.calidadautomation.interactions.SimulateButSection;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SimulateBut implements Task {
    private final PageObject page;

    public SimulateBut(PageObject page){
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SimulateButSection.go()
        );
    }

    public static SimulateBut onPage(PageObject page) {
        return Tasks.instrumented(SimulateBut.class,page);
    }
}
