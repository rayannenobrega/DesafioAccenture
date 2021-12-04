Feature: Fazer cadastro do seguro do automóvel da Tricentis
  Um usuário deve acessar o site da Tricentis e dar entrada no seguro do seu automóvel

  Scenario: Cadastro bem sucedido

    Given O usuário acessa a tela de preenchimento de Automobile Insurance
    When Preenche formulário EnterVehicleData corretamente
    And Preenche formulário EnterInsurantData corretamente
    And Preenche formulário EnterProductData corretamente
    And Preenche opção de preço no SelectPriceOption corretamente
    And Preenche formulário SendQuote corretamente
    Then Realiza cadastro com Sucesso