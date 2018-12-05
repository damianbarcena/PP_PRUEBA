package prueba;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class Stepdefs {

    int cantidad;
    Contador contador;

    @Given("^La palabra es \"([^\"]*)\"$")
    public void la_palabra_es(String arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        contador = new Contador();
        cantidad = contador.cantidadLetras(arg1);
    }

    @When("^se consulta la cantidad de letras$")
    public void se_consulta_la_cantidad_de_letras() throws Exception {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("^la cantidad de letras es correcta \"([^\"]*)\"$")
    public void la_cantidad_de_letras_es_correcta(String arg1) throws Exception {
        // Write code here that turns the phrase above into concrete actions
        assertEquals(Integer.parseInt(arg1), cantidad);
    }

}
