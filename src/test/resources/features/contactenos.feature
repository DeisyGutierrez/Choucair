Feature: Contactenos de Choucair
  As cliente
  I quiero enviar informacion
  So para que me contacten

  @Contactenos
  Scenario: Formulario con campos correctos
    Given el cliente ingresa al portal web de Choucair y luego al modulo contactenos
    And completa el formulario y presiona ENVIAR
    Then obtendra un mensaje correcto