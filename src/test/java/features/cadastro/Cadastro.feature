Feature: Fazer cadastro do seguro do automóvel da Tricentis
  Um usuário deve acessar o site da Tricentis e dar entrada no seguro do seu automóvel

  Scenario: Cadastro bem sucedido

    Given O usuario acessa a tela de preenchimento de Automobile Insurance
    And Preenche formulario EnterVehicleData corretamente
    And Preenche formulario EnterInsurantData corretamente
    And Preenche formulario EnterProductData corretamente
    And Preenche opcao de preco no SelectPriceOption corretamente
    And Preenche formulario SendQuote corretamente
    When Clica no botao de enviar e finalizar cadastro
    Then Realiza cadastro com Sucesso