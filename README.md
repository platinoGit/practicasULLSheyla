# Prácticas ULL-Sheyla

El código de este proyecto se encuentra en la rama máster.

## Objetivos

El objetivo del ejercicio, consiste en desarrollar un servicio que permita la recarga periódica de datos a partir del siguiente enlace:
https://datos.canarias.es/catalogos/general/dataset/procedimientos-y-servicios-del-gobierno-de-canarias

En dicho enlace, se encuentran diversos datos sobre los procedimientos y servicios del gobierno de canarias, de tal forma, que tras terminar el proyecto, hayamos implementado la siguiente consulta de datos:

- Búsquedas de procedimientos o servicios vinculados a una unidad administrativa.
- Búsquedas de procedimientos o servicios vinculados a un departamento.
- Búsquedas de procedimientos o servicios por nivel de gestión administrativa.
- Crear un procedimiento o servicio.
- Modificar los datos de un procedimiento o servicio.
- Eliminar los datos de un procedimiento o servicio.

En adición, se hará uso de una BBDD local, servicios SOAP y REST...

## Metodología utilizada

Puesto que se está siguiendo la filosofía de la empresa, se está empleando metodología de desarrollo ágil, principalmente basada en SCRUM.

## Estructura

La estructura a seguir es la siguiente:

![Image text](https://github.com/platinoGit/practicasULLSheyla/blob/main/Estructura/Diagrama%20(2).png)

Como se puede observar, se disponen de distintos módulos que simulan el comportamiento real de un proyecto Platino.

## Desarrollo del proyecto

A continuación, se van a enumerar los pasos seguidos para la elaboración del proyecto:

1) Una vez comprendida la estructura (o al menos la idea principal), el primer paso fue coger la URL para consultar los datos, y ver en POSTMAN que tipos de datos devolvía (en este caso, JSON). Tras esto, fuimos al codeready/eclipse a elaborar un código que trajera esos datos de la URL y los pasara a objetos java.
En este caso, los códigos se encuentran en la carpeta del gateway y hemos utilizado REST.

2) Después, hemos añadido unas líneas de código de dependencia en el entrypoint, para decirle que el WSDL que vamos a necesitar, se encuentra en el módulo del contract.

3) Dentro del contract, a partir de un ejemplo de LEMA, vamos a desarrollar nuestro propio WSDL, de tal forma, que si funciona correctamente, se deberían generar automáticamente las clases javas correspondiente.

4) Por otro lado, en el módulo interface, realizaremos el punto anterior a la inversa, es decir, a partir de clases javas, generar el WSDL y compararlo con el punto anterior (nota: esto todavía no me funciona).

5) Tras haber finalizado el/los WSDL, pasamos a la capa business. Aquí, el primer paso consiste en usar SOAPUI para añadir el WSDL y realizar pruebas (i.i cosa que no veo que funcione bien).

6) A continuación, fuimos al módulo business a continuar. Aquí empezamos con el enrutamiento, el logic y modificando el POM.

## Herramientas utilizadas

- Postman
- CodeReady Studio
- Eclipse
- SoapUI
- Notepad++

## Software

- Fuse-karaf version 7.10.0
- JDK versión 11.0.13
- Apache maven versión 3.8.5
- Apache CXF versión 3.5.2

## Links de interés

- Validador de WSDL: https://www.wsdl-analyzer.com/
- Maven repository: https://mvnrepository.com/
