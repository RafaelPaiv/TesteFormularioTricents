#Author: paiva.victor.rafael@gmail.com

Feature: Formulario para cotacao de seguros automobilisticos Tricents
  Como usuario
  Quero preencher os formularios necessarios
  Para realizar uma cotacao de seguros automobilisticos com a empresa Tricents
  
  Background:
  Given que acesso o site da Trincents
  

  @caminhofeliz
  Scenario: Cotacao realizada com sucesso
    And preencho todos os dados obrigatórios do formulário enterVehicleData
    And preencho todos os dados obrigatórios do formulário enterInsurantData
    And preencho todos os dados obrigatórios do formulário enterProductData
    And seleciono uma modalidade de seguro na página selectPriceOption
    When envio email para cotação na página sendQuote
    Then valido mensagem de sucesso
