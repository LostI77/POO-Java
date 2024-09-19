package losti.poo;

import java.util.ArrayList;
import java.util.List;

public class ObjectRelationships {
    public static void Main(String[] args) {
        System.out.println("Object Realtionships - Association, Aggregation y Composition");

        // example 1. Association

        Profesor profesor = new Profesor("Juan Pérez");
        Universidad universidad = new Universidad("Universidad Nacional");

        universidad.asignarProfesor(profesor); // Asociación: Profesor -> Universidad

        // example 2. Aggregation

        Libro libro1 = new Libro("Java Programming");
        Libro libro2 = new Libro("Design Patterns");

        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        biblioteca.mostrarLibros(); // Agregación: Biblioteca -> Libro

        // example 3. Composition

        Coche coche = new Coche("V8");
        coche.mostrarMotor(); // El coche controla completamente el ciclo de vida del moto
    }
}

/*
 * 1. Association
 * 
 * La asociación es una relación simple entre dos clases, donde una clase puede
 * interactuar con otra, pero ninguna de las clases es responsable de la vida de
 * la otra.
 * 
 * En este caso, el Profesor y la Universidad existen de manera independiente,
 * pero pueden interactuar entre ellos.
 */

class Profesor {
    private String nombre;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Universidad {
    private String nombre;

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void asignarProfesor(Profesor profesor) {
        System.out.println(profesor.getNombre() + " enseña en " + this.nombre);
    }
}

/*
 * 2. Aggregation
 * 
 * La agregación es un tipo de asociación más fuerte, donde una clase "agrega"
 * otra como parte de su estructura, pero ambas pueden existir de forma
 * independiente. Aquí, la clase "contenida" puede ser parte de múltiples
 * "contenedores".
 * 
 * Aquí, la Biblioteca tiene una relación de agregación con los Libros, pero los
 * libros pueden existir fuera de la biblioteca.
 */

class Libro {
    private String titulo;

    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}

class Biblioteca {
    private List<Libro> libros = new ArrayList<Libro>();

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void mostrarLibros() {
        for (Libro libro : libros) {
            System.out.println("Libro: " + libro.getTitulo());
        }
    }
}

/*
 * 3. Composition
 * 
 * La composición es una relación "todo-parte" más fuerte, donde la clase
 * "contenida" no puede existir sin la clase "contenedora". Si la clase
 * principal se destruye, también lo hará la clase que contiene.
 * 
 * Aquí, el Coche crea y controla la vida del Motor, lo que significa que si el
 * coche deja de existir, el motor también lo hará.
 */

class Motor {
    private String tipo;

    public Motor(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
}

class Coche {
    private Motor motor;

    public Coche(String tipoMotor) {
        this.motor = new Motor(tipoMotor); // Composición: Coche contiene Motor
    }

    public void mostrarMotor() {
        System.out.println("El coche tiene un motor de tipo: " + motor.getTipo());
    }
}

/*
 * Problemas y Complicaciones
 * 
 * Asociación:
 * 
 * - Problema: La relación es débil y puede ser difícil controlar la interacción
 * si el flujo de datos entre las clases no está bien gestionado.
 * 
 * - Complicación: A medida que el sistema crece, demasiadas asociaciones pueden
 * complicar las dependencias.
 * 
 * Agregación:
 * 
 * - Problema: Puede ser confuso determinar quién es responsable de la gestión
 * del
 * ciclo de vida de los objetos agregados.
 * 
 * - Complicación: Si una clase agregada es compartida por múltiples clases
 * "contenedoras", hay que tener cuidado con la modificación accidental del
 * estado.
 * 
 * Composición:
 * 
 * - Problema: Dado que las clases están estrechamente vinculadas, si cambias la
 * clase principal, la clase compuesta también se verá afectada.
 * 
 * - Complicación: Puede ser difícil refactorizar si necesitas cambiar la
 * relación de dependencia, ya que la vida del objeto "parte" depende
 * completamente del objeto "todo".
 */