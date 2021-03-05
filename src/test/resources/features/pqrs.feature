Feature: PQRS de Choucair
  As cliente nuevo
  I quiero enviar algun PQRS
  So la empresa pueda escucharme

  @PQRS
Scenario: Formulario con campos vacios
  Given el cliente ingresa al portal web de la empresa y luego al modulo contactenos
  And despues al boton PQRS
  And no completa ningun campo del formulario
  And presiona el boton ENVIAR
  Then obtendra un mensaje de error