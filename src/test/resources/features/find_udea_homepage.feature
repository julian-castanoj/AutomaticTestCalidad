#Autor:Anderson
  #languege:en

  Feature: Simulación de Préstamo de Libre Inversión
    Como usuario interesado en solicitar un crédito de libre inversión
    Quiero conocer las diferentes opciones de crédito
    Para poder elegir la más adecuada

  Scenario: Buscar la pagina oficial de Bancolombia Personas en google
    Given que me encuentro en la pagina principal de google
    When escriba la palabra Bancolombia Personas
    Then puedo ver el link de la pagina oficial

    Scenario: Buscar la seccion de financia lo que sueñas, quieres y necesitas. en la pagina de Bancolombia
      Given me encuentro en la pagina de Bancolombia Personas
      When le doy click a Saber mas de la seccion de financia lo que sueñas, quieres y necesitas
      Then puedo ver la página de Creditos de Consumo

    Scenario: Buscar la seccion de credito de libre inversion Bancolombia
      Given Me encuentro en la pagina de Creditos Comsumo
      When le doy click en Simular de la seccion de libre inversion Bancolombia
      And le doy click en Continuar
      And selecciono la opcion si
      And ingreso los datos que necesito para la simulacion
      And le doy click en Simular
      Then puedo ver en la pagina mi simulacion del credito

