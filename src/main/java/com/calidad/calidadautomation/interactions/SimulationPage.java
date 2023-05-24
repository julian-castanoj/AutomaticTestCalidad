package com.calidad.calidadautomation.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.Random;

import static com.calidad.calidadautomation.userinterfaces.UsuarioPage.*;

public class SimulationPage implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        int randomNumber = generateRandomNumber(1000000, 500000000);
        int randomNumberMonths = generateRandomNumber(48, 84);
        String randomNumberString = String.valueOf(randomNumber);
        String randomNumberMonthString = String.valueOf(randomNumberMonths);

        actor.attemptsTo(
                Enter.theValue(randomNumberString).into(INPUT_NUMBER_RANDOM),
                Enter.theValue(randomNumberMonthString).into(INPUT_NUMBER_RANDOM_MONTH),
                Click.on(SELECT_DATE),
                Click.on(SELECT_YEAR),
                Click.on(SELECT_MONTH),
                Click.on(SELECT_DAY)
        );
    }
    private int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static SimulationPage go(){
        return Tasks.instrumented(SimulationPage.class);
    }
}
