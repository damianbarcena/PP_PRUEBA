Feature: Cantidad de letras?
  Saber la cantidad de letras

  Scenario Outline: Cantidad de letras es la correcta
    Given La palabra es "<cadena>"
    When se consulta la cantidad de letras
    Then la cantidad de letras es correcta "<cantidad>"

    Examples:
      | cadena | cantidad |
      | Damian | 6 |
      | Leo | 3 |
      | Andres | 6 |
      |  | 0 |