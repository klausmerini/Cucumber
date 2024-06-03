
Feature: Feature para testar a funcionalidade de login

  Scenario: Verificar se login esta ok com credenciais corretas
    Given esta na pagina de login
    And usuario digita nome e senha
    And clicar no botão login
    Then usuario e direcionado para home page
