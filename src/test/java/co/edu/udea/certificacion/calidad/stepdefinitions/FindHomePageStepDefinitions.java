package co.edu.udea.certificacion.calidad.stepdefinitions;

import com.calidad.calidadautomation.questions.Validacion;
import com.calidad.calidadautomation.tasks.OpenThe;
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
public class FindHomePageStepDefinitions {

    @Managed(driver = "chrome")
    public WebDriver driver;
    private final Actor usuario = Actor.named("Carlitos");

    @Before
    public void preStage(){
        driver.manage().window().maximize();
        usuario.can(BrowseTheWeb.with(driver));
    }

    /*@Given("que me encuentro en la pagina principal de google")
    public void queMeEncuentroPaginaPrincipal(){
        usuario.can(BrowseTheWeb.with(driver));
    }

    @When("escriba la palabra Bancolombia Personas")
    public void  escribaLaPalabraUdeA(){
        usuario.attemptsTo(OpenThe.Browser(new UsuarioPage()));
    }

    @Then("puedo ver el link de la pagina oficial")
    public void puedoVerElLinkOficial(){
        usuario.should(seeThat(Validacion.theHomePage(),equalTo(true)));
    }*/

    @Given("me encuentro en la pagina de Bancolombia Personas")
    public void meEncuentroPaginaBancolombia(){
    }

    @When("le doy click a Saber mas de la seccion de financia lo que sueñas, quieres y necesitas")
    public void  clickSabermasFinancia(){
         usuario.attemptsTo(OpenThe.Browser(new UsuarioPage()));
    }


    @Then("puedo ver la página de Creditos de Consumo")
    public void puedoVerPaginaCreditos() {
        usuario.should(seeThat(Validacion.theHomePage(), equalTo(true)));
    }


    //Escenario 2

    @When("le doy click en Simular de la seccion de libre inversion Bancolombia")
    public void  clickSimularLibreInversion(){
        usuario.attemptsTo(OpenThe.Browser(new UsuarioPage()));
    }

    @And("le doy click en Continuar")
    public void clickContinuar(){
        usuario.attemptsTo(OpenThe.Browser(new UsuarioPage()));
    }

    @And("selecciono la opcion sí")
    public void seleccionoSí(){
        usuario.attemptsTo(OpenThe.Browser(new UsuarioPage()));
    }





    
}
