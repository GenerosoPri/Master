package Tests;

import Elementos.elementos;
import Pages.metodos;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class steps {
	elementos elementos = new elementos();
	metodos metodos = new metodos();

	@Given("^que eu acesse o site \"([^\"]*)\"$")
	public void que_eu_acesse_o_site(String site) throws Throwable {
		metodos.abrirSite(site, "CHROME");
		metodos.esperar(7000);
		metodos.clicar(elementos.getBtnLogin());
        
	}

	@When("^preencha os campos com usuario e senha$")
	public void preencha_os_campos_com_usuario_e_senha() throws Throwable {
		metodos.escrever(elementos.getCampoDeEmail(), "Pri_100587");
		metodos.esperar(7000);
		metodos.escrever(elementos.getCampoDeSenha(), "Kenzo030118$");
		metodos.screnShoot("Cenario - Validar Campo de Login e Senha");
	}

	@Then("^sera validado login e senha$")
	public void sera_validado_login_e_senha() throws Throwable {
		metodos.clicar(elementos.getBtnSingIn());
		metodos.esperar(4000);
		metodos.fechar();
	}

}
