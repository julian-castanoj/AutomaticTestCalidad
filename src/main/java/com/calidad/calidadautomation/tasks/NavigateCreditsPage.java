package com.calidad.calidadautomation.tasks;

import com.calidad.calidadautomation.interactions.CreditsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class NavigateCreditsPage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                CreditsPage.go()
        );
    }

    public static NavigateCreditsPage onPage() {
        return Tasks.instrumented(NavigateCreditsPage.class);
    }
}
