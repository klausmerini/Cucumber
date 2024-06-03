package org.merini.steps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.merini.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {

    private LoginPage loginpage = new LoginPage();
    private String usenameSt = "klausmerini@yahoo.com.br";
    private String passwordSt = "4321admin";
    WebDriver driver = null;

    @Given("esta na pagina de login")
    public void esta_na_pagina_de_login()
    {
            System.out.println("LoginSteps.Given(\"esta na pagina de login\")");
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS);

        driver.navigate().to(loginpage.getURLLoginPage());
    }

    @And("usuario digita nome")
    public void usuario_digita_nome()
    {
            System.out.println("LoginSteps.And(\"usuario digita nome \")");
        loginpage.getCampoLoginUsername(driver).sendKeys(usenameSt);
    }

    @And("clicar no botão login")
    public void clicar_no_botão_login()
    {
            System.out.println("LoginSteps.and(\"clicar no botão login\")");
        loginpage.clicarContinue(driver);
    }

    @Then("usuario e direcionado para home page")
    public void usuario_e_direcionado_para_home_page()
    {
            System.out.println("LoginSteps.usuario_e_direcionado_para_home_page");
        driver.findElement(By.id("home-nav-button"));
    }

    @And("usuario digita senha")
    public void usuarioDigitaSenha()
    {
            System.out.println("LoginSteps.And(\"usuario digita senha\")");
        loginpage.getCampoPassword(driver).sendKeys(passwordSt);
    }

    @And("clicar no botão entrar")
    public void clicarNoBotaoEntrar()
    {
        loginpage.clicarEntrar(driver);
    }
}