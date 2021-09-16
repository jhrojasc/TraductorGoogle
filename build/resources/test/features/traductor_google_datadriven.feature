#Autor: your.email@your.domain.com
  Feature:
    Como un usuario
    Quiero ingresar a google Translator
    A traducir palabras entre diferentes lenguajes

   @traducir
   Scenario: Traducir de Ingles a Español
     Given que Yeison quiere usar el traductor de google
     When el traduce una palabra de inglés a español
     |origen        |destino |palabrai      |
     |ingles        |español |hello, welcome|
     |ingles        |español |bye           |
     Then el deberia ver la palabra traducida del idioma origen a idioma destino
     |palabrae       |
     |Hola bienvenido|
     |adiós          |