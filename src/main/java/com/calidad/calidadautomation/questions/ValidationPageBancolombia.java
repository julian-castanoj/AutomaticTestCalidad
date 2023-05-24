package com.calidad.calidadautomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.TEXT_VALIDATION_BANCOLOMBIA;

public class ValidationPageBancolombia implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        String stringTemporal = Text.of(TEXT_VALIDATION_BANCOLOMBIA).viewedBy(actor).asString();
        if(stringTemporal.contains("Copyright © 2023 Grupo Bancolombia")){
            return true;
        }else {
            return false;
        }
    }

    public static ValidationPageBancolombia theHomePage(){return new ValidationPageBancolombia();}
}
