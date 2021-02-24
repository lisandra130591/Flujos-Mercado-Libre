Feature: Autenticacion
  Como usuario de ML, intento autenticarme sin exito ya que ML esta protegido por reCAPTCHA

  Scenario: Autenticarme en ML
    Given Me encuentro en la pagina principal de Mercado Libre
    When Acepto las cookies y presiono el boton Ingresa
    And Inserto el usuario y presiono el boton Ingresar
    Then Me lleva a la pagina para insertar la clave
