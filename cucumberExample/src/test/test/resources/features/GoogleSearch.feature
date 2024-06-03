
@GoogleTest
Feature: Feature para testar funcionalidadede busca do google
  Scenario: Validar que a busca do google está funcionando
    Given O browser está aberto
    And O usuário está na página de busca do google
    When O usuário digitar um texto na caixa de texto
    And clicar em buscar
    Then O usuário é direcionado para a página de resultado da busca
