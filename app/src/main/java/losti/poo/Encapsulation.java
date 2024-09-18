package losti.poo;

/*
 * Encapsulación/Encapsulamiento en Java
 * 
 * El encapsulamiento nos ayuda a agrupar logica de atributos (datos) y metodos (comportamientos) de nuestra clase
 * especificando el control de acceso en estos mismos.
 * 
 * "public", "private", "protected"
 * 
 * El encapsulamiento ayuda a ocultar logica compleja de una clase, evitando de que este sea visible y mejorando la
 * seguridad de tu programa, ya que estos solo se podran obtener y modificar a traves de metodos con sus validaciónes
 * y logica correspondiente.
 * 
 * ¿En que me beneficia el encapsulamiento?
 * 
 * Seguridad de los datos de tus clases
 * 
 * Control de acceso
 * 
 * Abstracción
 * 
 * Flexibilidad & Mantenibilidad
 * 
 * Reutilización de codigo
*/

public class Encapsulation {
    public String e; // <- Atributo que se puede acceder en toda la clase.
    protected String example; // <- Se puede acceder dentro de la clase y en clases en las que se aplique la
                              // herencia
    private int z; // <- Atributos privados solo se pueden acceder dentro de una misma clase.

    public Encapsulation(String e, String example, int z) {
        this.e = e;
        this.example = example;
        this.z = z;
    }

    // Encapsulamiento con methods
    // ...
    protected void printlnInf() {
        System.out.println("Attribute: e        Value: " + this.e);
        System.out.println("Attribute: example  Value" + this.example);
        System.out.println("Attribute: z        Value: " + this.z);
    } // <- esta metodo solo se podra usar herendandola o dentro de esta misma.

    // private void example() {
    // System.out.println("");
    // }; // <- este metodo solo se podra usar aqui

    // Encapsulamiento con getters y setters

    // El codigo puede ser muy diferente a este, ya que la idea es que aqui
    // implementes tu propia logica, con validadores, etc.

    public void setE(String e) {
        this.e = e;
    }

    public void setZ(int z) {
        this.z = z;
    }

}
