package losti.poo;

/*
 * En java puedes crear clases y sobrecargar sus constructores. Pero ¿realmente es dificil
 * o complicado de entender?.
 * 
 * Para nada, de hecho se te hara muy familiar con tal que lo uses un par de veces en tu
 * dia a dia. Primero tenemos que entender como funciona el constructor (cosa que deberias
 * recordar sin problema alguno).
 * 
 * 1 - Tiene el mismo nombre de la clase.
 * 2 - Tiene que ser publico.
 * 3 - Tiene que tener la misma cantidad de parametros que los atributos a inicializar.
 * 4 - Declara a los parametros de la misma forma que tus atributos (incluyendo su tipo
 * correspondiente).
 * 
 * Ahora bien, antes de ir con el ejemplo de como crear constructores sobrecargados, algo
 * vital es entender que es el polimorfismo.
 * 
 * ¿Por que es importante entender el polimorfismo?
 * 
 * El polimorfismo se refiere a la propiedad por la cual es posible hacer cierto proceso
 * de diferentes maneras pero con un mismo resultado. Un ejemplo podria ser pedir pizza,
 * pueden haber 10 a 15 formas de pedir una simple pizza pero este no altera el resultado
 * que es pedir la pizza.
 * 
 * Entonces, ¿como lograremos crear una clase con un constructor que puede tener diferentes
 * formas de inicializar los atributos de nuestra clase sin que altere el resultado?
 * 
 * Eso lo veras en este ejemplo.
 * 
*/

public class Overload {
    private String nombre;
    private int edad;

    /*
     * En este ejemplo tenemos 3 constructores de la misma clase,
     * pero no hay un problema o conflicto por el cual preocuparnos.
     * 
     * ¿Por que?
     * 
     * Por que cada constructor tiene una signatura unica y esto
     * sucede por el contenido de cada constructor.
     * 
     * Una asignatura se forma por las caracteristicas inconfundibles
     * de un metodo, constructor, funcion, etc.
     * 
     * Las caracteristicas inconfundibles son:
     * 
     * - Nombre
     * - Serie de argumentos (número, tipo y orden)
     * 
     * Esto hace que java aunque parescan y tengan la misma funcionalidad
     * los perciva de manera diferente a cada uno. Trayendonos el constructor
     * ideal para la forma en la que le estamos pasando sus parametros.
     * 
     * Si creo una instancia de la clase con 0 parametros usara el primer
     * constructor, si uso solo 1 parametro, usara el segundo ya que ha
     * identificado que estoy usando ese parametro con ese tipo y en ese orden (y
     * vio que concuerdan y lo mismo para el tercer constructor)
     * 
     * De esta forma podemos crear constructores overload/sobrecargados que se
     * pueden usar sin, con y con cierta cantidad y orden de parametros.
     * 
     * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * !! EN LAS SIGNATURAS NO SE INCLUYEN CONTROLADORES DE ACCESOS !!
     * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     */

    // Constructor 1: sin parámetros
    public Overload() {
        this.nombre = "Desconocido";
        this.edad = 0;
    }

    // Constructor 2: un parámetro
    public Overload(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
    }

    // Constructor 3: dos parámetros
    public Overload(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Cada uno de los constructores en el ejemplo anterior tiene una signatura
    // diferente debido a las variaciones en el número, el tipo y el orden de los
    // parámetros.

    // Constructor con un parámetro int
    // public Overload(int a) {}

    // Otro constructor con el mismo parámetro int - causará un error
    // public Overload(int b) {} // Error: constructor duplicado

    public void mostrarInfo() {
        System.out.println("Nombre: " + nombre + "\n" + "Edad: " + edad);
    }

    /*
     * Overload de constructores con `this`
     * 
     * // Constructor 1: sin parámetros
     * public Persona() {
     * this("Desconocido", 0); // Llama al constructor con dos parámetros
     * }
     * 
     * // Constructor 2: un parámetro
     * public Persona(String nombre) {
     * this(nombre, 0); // Llama al constructor con dos parámetros
     * }
     * 
     * // Constructor 3: dos parámetros
     * public Persona(String nombre, int edad) {
     * this.nombre = nombre;
     * this.edad = edad;
     * }
     */
}
