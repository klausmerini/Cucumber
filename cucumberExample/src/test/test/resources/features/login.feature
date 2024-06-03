
Feature: Feature para testar a funcionalidade de login

  Scenario: Verificar se login esta ok com credenciais corretas
    Given esta na pagina de login
    And usuario digita nome
    And clicar no botão login
    And usuario digita senha
    And clicar no botão entrar
    Then usuario e direcionado para home page

  Scenario: Verificar se comportamento do login esta ok com credenciais incorretas
    Given esta na pagina de login
    And usuario digita nome
    And clicar no botão login
    And usuario digita senha incorreta
    And clicar no botão entrar
    Then usuario recebe mensagem indicando o nao sucesso do login

