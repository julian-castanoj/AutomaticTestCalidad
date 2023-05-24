package com.calidad.calidadautomation.tasks;

import com.calidad.calidadautomation.interactions.SimulateGenerateSection;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class SimulationGenerate implements Task {
    private final PageObject page;

    public SimulationGenerate(PageObject page){
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SimulateGenerateSection.go()
        );
    }

    public static SimulationGenerate onPage(PageObject page) {
        return Tasks.instrumented(SimulationGenerate.class,page);
    }
}
