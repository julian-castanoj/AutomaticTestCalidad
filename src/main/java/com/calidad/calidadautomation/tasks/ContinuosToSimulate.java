package com.calidad.calidadautomation.tasks;

import com.calidad.calidadautomation.interactions.ContinuosToSimulatePage;
import com.calidad.calidadautomation.interactions.CreditsPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ContinuosToSimulate implements Task {
    private final PageObject page;

    public ContinuosToSimulate(PageObject page){
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ContinuosToSimulatePage.go()
        );
    }

    public static ContinuosToSimulate onPage(PageObject page) {
        return Tasks.instrumented(ContinuosToSimulate.class,page);
    }
}
