Feature: Fazer cadastro do seguro do automóvel da Tricentis
  Um usuário deve acessar o site da Tricentis e dar entrada no seguro do seu automóvel

  Scenario: Cadastro bem sucedido

    Given O usuário confirma se está na página Tricentis
    When Preenche o formulário EnterVehicleData corretamente
    And Preenche formulário EnterInsurantData corretamente