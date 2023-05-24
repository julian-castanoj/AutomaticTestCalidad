package com.calidad.calidadautomation.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class UsuarioPage extends PageObject {
    public static final Target CLOSE_ADS = Target.the("CLOSE ADS").locatedBy("//*[@id=\"closeModalBtn\"]/span");
    public static final Target LINK_PAGE_CREDITO_CONSUMO = Target.the("LINK PAGE CREDITO CONSUMO").locatedBy("//*[@id=\"home-conoce-mas-productos\"]/div/div[2]/div[1]/div/div[2]/span/a");
    public static final Target LINK_PAGE_SIMULAR_CREDITO = Target.the("LINK PAGE SIMULAR CREDITO").locatedBy("//*[@id=\"creditos\"]/div/div[1]/div[4]/div/div[2]/div/a[1]");
    public static final Target BUTTON_CONTINUAR = Target.the("BUTTON CONTINUAR").locatedBy("//*[@id=\"boton-seleccion-tarjeta\"]");
    public static final Target SELECTION_SI = Target.the("SELECTION SI").locatedBy("//*[@id=\"opcion-si\"]/label");

    public static final Target INPUT_NUMBER_RANDOM = Target.the("INPUT NUMBER RANDOM").locatedBy("//*[@id=\"valor-simulacion\"]");
    public static final Target INPUT_NUMBER_RANDOM_MONTH= Target.the("INPUT NUMBER RANDOM MONTH").locatedBy("//*[@id=\"valor-plazo\"]");
    public static final Target SELECT_DATE = Target.the("SELECT DATE").locatedBy("//*[@id=\"campo-fecha\"]");
    public static final Target SELECT_YEAR = Target.the("INPUT NUMBER RANDOM MONTH").locatedBy("//*[@id=\"mat-datepicker-0\"]/div/mat-multi-year-view/table/tbody/tr[3]/td[1]/div[1]");
    public static final Target SELECT_MONTH = Target.the("INPUT NUMBER RANDOM MONTH").locatedBy("//*[@id=\"mat-datepicker-0\"]/div/mat-year-view/table/tbody/tr[3]/td[1]/div[1]");
    public static final Target SELECT_DAY = Target.the("INPUT NUMBER RANDOM MONTH").locatedBy("//*[@id=\"mat-datepicker-0\"]/div/mat-month-view/table/tbody/tr[3]/td[2]/div[1]");
    public static final Target BUTTON_SIMULAR = Target.the("BUTTON SIMULAR").locatedBy("//*[@id=\"boton-simular\"]");




    public static final Target TEXT_VALIDATION_BANCOLOMBIA = Target.the("TEXTO EN LA HOMEPAGE").locatedBy("//*[@id=\"layoutContainers\"]/div/div[2]/div/div[2]/section/div[3]/div[2]/app-root/div/app-resultado-simulacion/section[1]/span");

}