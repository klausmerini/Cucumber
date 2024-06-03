package org.merini.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage
{
    private String URLLoginPage = "https://id.atlassian.com/login";

    public void clicarContinue(WebDriver driver)
    {
        driver.findElement(By.id("login-submit")).click();
    }

    public void clicarEntrar(WebDriver driver)
    {
        driver.findElement(By.id("login-submit")).click();
    }

    public WebElement getCampoLoginUsername(WebDriver driver)
    {
        return driver.findElement(By.id("username"));
    }

    public WebElement getCampoPassword(WebDriver driver)
    {
        return driver.findElement(By.id("password"));
    }

    public String getURLLoginPage() {
        return URLLoginPage;
    }

}
