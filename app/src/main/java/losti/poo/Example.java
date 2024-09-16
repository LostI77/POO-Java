package losti.poo;

/*
 * Este archivo `Example` es una clase publica abstract que su objectivo es explicarte como funciona
 * el abstract en java y como usarla en tu desarrollo con este lenguaje.
 * 
 * Las clases abstractas se declaran por medio de la palabra abstract y contienen las siguientes
 * propiedades:
 *
 * - Estas clases pueden o no tener metodos abstractos, por ejemplos metodos sin un cuerpo.
 * - Si la clase tiene aunque sea un solo metodo abstracto debe ser declarado como abstracto
 * - Las clases declaradas como abstractas no pueden ser instanciadas
 *
 * ¿Para qué sirve una clase abstract?
 *
 * Organización de código:
 *
 * Ayuda a crear un diseño más estructurado al forzar la implementación
 * de ciertos métodos en las subclases.
 *
 * Polimorfismo:
 *
 * Permite que diferentes clases hijas se comporten de maneras distintas pero compartan
 * una misma interfaz.
 *
 * Plantilla para subclases:
 *
 * Define una plantilla que todas las subclases deben seguir.
*/

public abstract class Example {
    // ⬇️ atributos aqui ...

    protected int id;
    protected String name;

    /*
     * !! RECUERDA !!
     *
     * Cuando tenemos atributos a usar debemos crear un constructor.
     */

    public Example(int id, String name) {
        this.id = id;
        this.name = name;
    };

    /*
     * Metodos abstractos sin logica ni cuerpo.
     * Estos metodos se escriben siempre con el control de acceso primero y luego
     * añadiendo
     * abstract y el tipo de retorno (pueden o no tener retorno y parametros).
     * example:
     *
     * public abstract void exampleMethod();
     *
     * protected abstract String exampleMethod();
     *
     * protected abstract String exampleMethod(String i, int x);
     *
     * ...
     * 
     * !! RECUERDA !!
     * 
     * Methodos abstractos no requieren que les especifiques la logica que van
     * a ejecutar... su uso sera en otra clase. Y veras como implemetarla en el
     * archivo
     * ExtendExample.java
     */
    public abstract void abstractVoidMethod();

    public abstract void otherAbstractMethod();

    // Método no abstracto: tiene una implementación por defecto
    public void exampleMethod() {
        System.out.println("Este metodo es de ejemplo");
    }

    // Getters and Setters

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}