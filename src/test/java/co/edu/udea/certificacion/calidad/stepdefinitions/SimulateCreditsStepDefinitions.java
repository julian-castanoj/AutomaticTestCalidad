package co.edu.udea.certificacion.calidad.stepdefinitions;

import com.calidad.calidadautomation.questions.ValidationPageBancolombia;
import com.calidad.calidadautomation.questions.ValidationSimulation;
import com.calidad.calidadautomation.tasks.*;
import com.calidad.calidadautomation.userinterfaces.UsuarioPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;

@RunWith(Cucumber.class)
public class SimulateCreditsStepDefinitions {

    @Managed(driver = "chrome")
    public WebDriver driver;
    private final Actor user = Actor.named("Carlitos");

    @Before
    public void preStage(){
        /*driver.manage().window().maximize();
        usuario.can(BrowseTheWeb.with(driver));*/
    }

    @Given("me encuentro en la pagina de Bancolombia Personas")
    public void meEncuentroPaginaBancolombia(){
        driver.manage().window().maximize();
        user.can(BrowseTheWeb.with(driver));
    }

    @When("le doy click a Saber mas de la seccion de financia lo que sueñas, quieres y necesitas")
    public void  clickSabermasFinancia(){
        user.attemptsTo(OpenHomePage.Browser(new UsuarioPage()));
    }


    @Then("puedo ver la pagina de Bancolombia Personas")
    public void puedoVerPaginaBancolombia(){
        user.should(seeThat(ValidationPageBancolombia.theHomePage(),equalTo(true)));
    }

    @And("le doy a Simular de la seccion de libre inversion Bancolombia")
    public void  clickSimularLibreInversion(){
        user.attemptsTo(NavigateCreditsPage.onPage(new UsuarioPage()));
    }

    @And("le doy click en Continuar")
    public void clickContinuar(){
        user.attemptsTo(GoToSimulate.onPage(new UsuarioPage()));
    }

    @And("selecciono la opcion si")
    public void seleccionoSí(){
        user.attemptsTo(ContinuosToSimulate.onPage(new UsuarioPage()));
    }

    @And("ingreso los datos que necesito para la simulacion")
    public void ingresaDatosSimulacion(){
        user.attemptsTo(SimulateCredits.onPage(new UsuarioPage()));
    }

    @And("le doy click en Simular")
    public void clickSimular(){
        user.attemptsTo(SimulationGenerate.onPage(new UsuarioPage()));
    }

    @Then("puedo ver en la pagina mi simulacion del credito")
    public void puedoVerSimulacion(){
        user.should(seeThat(ValidationSimulation.theSimulationOk(),equalTo(true)));
    }

}
