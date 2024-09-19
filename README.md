# Guia de POO en Java

Esta guia busca enseñarte lo basico y posibilitarte a avanzar en tu aprendizaje. Pero antes de empezar ¿que es la programación orientada a objectos?

El POO — programación orientada a objectos — es un paradigma de la programación que trata de resolver los problemas creando un modelo estructurado
que pueda satisfacer las necesidades/requirimientos del programa. Esto nos ayuda a la hora de reutilizar codigo y tener abstracciónes, etc. Cosas locas,
cosas divertidas.

## Conceptos fundamentales

La POO es una forma de programar que trata de encontrar una solución a **x** numero de problemas. Introduce una cantidad medianamente grande
de conceptos a tener consideración a la hora de aprender este.

- **Clase**: La clase es un tipo de **plantilla** en la que se crean atributos y metodos predeterminados. Esta plantilla se usa con la finalidad de
  poder crear objectos facilmente. Al crear algo objectos con nuestras clases estamos creando una **instancia** de esta ya que el objecto que creamos
  tiene todos los atributos y metodos que hemos definido en ella.

- **Herencia**: La herencia nos permite combinar o juntar dos clases totalmente diferentes. Ejemplo: Clase D tiene un numero de metodos y atributos, al
  extender la clase C con la D la clase C obtiene todos los metodos y atributos y podra usarlos siempre y cuando este permitido — depende de como definas
  la accesibilidad de la clase —.

- **Objecto**: Una instancia de una clase que contiene todo de esta siempre y cuando se haya definido como accesible para la instancia.

- **Atributo**: Caracteristica de la clase.

- **Estado interno**:
  Es una variable que se declara privada, que puede ser únicamente accedida y alterada por un método del objeto. No es visible al programador que maneja una
  instancia de la clase sera accedida unicamente en la clase de la cual viene.

- **Metodo**: Es un algoritmo asociado a la clase que permite una funcionalidad especifica o algo mas que eso, con los metodos se pueden hacer muchas cosas.

- **Evento**
  Es un suceso en el sistema (tal como una interacción del usuario con la máquina, o un mensaje enviado por un objeto). El sistema maneja el evento enviando el
  mensaje adecuado al objeto pertinente. También se puede definir como evento la reacción que puede desencadenar un objeto; es decir, la acción que genera.

## Caracteristicas de POO

- **Abstracción**
- **Encapsulamiento**
- **Polimorfismo**
- **Herencia**
- **Modularidad**
- **Principio de ocultación**
- **Recoleccion de basura**

### Principio de ocultación

En programación orientada a objetos el principio de ocultación hace referencia a que los atributos privados de un objeto no pueden ser modificados ni obtenidos a
no ser que se haga a través del paso de un mensaje (invocación a métodos, ya sean estos funciones o procedimientos).

### Modularidad

Divide las responsabilidades de cada clase claramente. Cada clase debe tener una responsabilidad bien definida para evitar que una clase maneje demasiadas
cosas (principio de responsabilidad única).
