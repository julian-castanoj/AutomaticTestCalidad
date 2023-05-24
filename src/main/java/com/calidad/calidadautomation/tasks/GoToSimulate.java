package com.calidad.calidadautomation.tasks;

import com.calidad.calidadautomation.interactions.CreditsPage;
import com.calidad.calidadautomation.interactions.GoToSimulatePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class GoToSimulate implements Task {
    private final PageObject page;

    public GoToSimulate(PageObject page){
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                GoToSimulatePage.go()
        );
    }

    public static GoToSimulate onPage(PageObject page) {
        return Tasks.instrumented(GoToSimulate.class,page);
    }
}
