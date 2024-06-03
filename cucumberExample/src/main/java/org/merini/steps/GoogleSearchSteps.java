package org.merini.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps
{
    WebDriver driver = null;

    @Given("O browser está aberto")
    public void o_browser_está_aberto() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(120,TimeUnit.SECONDS);
    }

    @Given("O usuário está na página de busca do google")
    public void o_usuário_está_na_página_de_busca_do_google()
    {
        System.out.println("@Given(\"O usuário está na página de busca do google\")");
        driver.navigate().to("https://www.google.com");
    }

    @When("O usuário digitar um texto na caixa de texto")
    public void o_usuário_digitar_um_texto_na_caixa_de_texto()
    {
        System.out.println("@When(\"O usuário digitar um texto na caixa de texto\")");
        driver.findElement(By.name("q")).sendKeys("Automation step by step");
    }

    @When("clicar em buscar")
    public void clicar_em_buscar() {
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @Then("O usuário é direcionado para a página de resultado da busca")
    public void o_usuário_é_direcionado_para_a_página_de_resultado_da_busca() {
        driver.getPageSource().contains("Online Courses");
        driver.close();
        driver.quit();
    }
}