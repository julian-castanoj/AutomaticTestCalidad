package com.calidad.calidadautomation.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.core.annotations.findby.By;

public class UsuarioPage extends PageObject {
    //public static final Target INPUT_TEXT = Target.the("INPUT TEXT").locatedBy("//*[@id='APjFqb']");
    //public static final Target LINK_HOMEPAGE_BANCOLOMBIA_PERSONAS = Target.the("LINK BANCOLOMBIA").locatedBy("//*[@id=\"home-conoce-mas-productos\"]/div/div[2]/div[1]/div/div[2]/span/a");

    public static final Target CLOSE_ADS = Target.the("CLOSE ADS").locatedBy("//*[@id=\"closeModalBtn\"]/span");
    public static final Target LINK_PAGE_CREDITO_CONSUMO = Target.the("LINK PAGE CREDITO CONSUMO").locatedBy("//*[@id=\"home-conoce-mas-productos\"]/div/div[2]/div[1]/div/div[2]/span/a");
    public static final Target LINK_PAGE_SIMULAR_CREDITO = Target.the("LINK PAGE SIMULAR CREDITO").locatedBy("//*[@id=\"creditos\"]/div/div[1]/div[4]/div/div[2]/div/a[1]");
    public static final Target BUTTON_CONTINUAR = Target.the("BUTTON CONTINUAR").locatedBy("//*[@id=\"boton-seleccion-tarjeta\"]");
    public static final Target SELECTION_SI = Target.the("SELECTION SI").locatedBy("//*[@id=\"opcion-si\"]/label");



    public static final Target TEXT_VALIDATION = Target.the("TEXTO EN LA HOMEPAGE").locatedBy("//*[@id='layoutContainers']/div/div[2]/div/div[4]/section/div[2]/footer/div/div[1]/div/div[3]/p[3]");

}