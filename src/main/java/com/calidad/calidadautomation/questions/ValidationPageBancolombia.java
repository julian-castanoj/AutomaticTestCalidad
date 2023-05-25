package com.calidad.calidadautomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.TEXT_VALIDATION_BANCOLOMBIA;

public class ValidationPageBancolombia implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        String stringTemporal = Text.of(TEXT_VALIDATION_BANCOLOMBIA).viewedBy(actor).asString();
        return stringTemporal.contains("Copyright © 2023 Grupo Bancolombia");
    }

    public static ValidationPageBancolombia theHomePage(){return new ValidationPageBancolombia();}
}
