package com.calidad.calidadautomation.tasks;

import com.calidad.calidadautomation.interactions.BancolombiaHomePage;
import com.calidad.calidadautomation.interactions.CreditsPage;
import com.calidad.calidadautomation.userinterfaces.UsuarioPage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateCreditsPage implements Task {
    private final PageObject page;

    public NavigateCreditsPage(PageObject page){
        this.page = page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(CreditsPage.go());
    }
    public static NavigateCreditsPage onPage(PageObject page) {
        return Tasks.instrumented(NavigateCreditsPage.class,page);
    }
}
