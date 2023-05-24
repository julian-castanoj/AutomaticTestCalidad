package com.calidad.calidadautomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.TEXT_VALIDATION_SIMULATION;

public class ValidationSimulation implements Question {


    @Override
    public Object answeredBy(Actor actor) {

        String stringTemporal = Text.of(TEXT_VALIDATION_SIMULATION).viewedBy(actor).asString();
        if(stringTemporal.contains("Te ofrecemos estas opciones para Crédito de Libre Inversión")){
            return true;
        }else {
            return false;
        }
    }

    public static ValidationSimulation theSimulationOk(){return new ValidationSimulation();}
}
