package losti.poo;

public class AddAbstract extends Example {
    private int value1;
    private int value2;
    private String value3;
    private double value4;

    public AddAbstract(int id, String name, int value1, int value2, String value3, double value4) {
        super(id, name);
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
    }

    /*
     * ¿Por qué se usa `@Override` en clases que se extienden de una clase
     * abstractas?
     *
     * Usar `@Override` asegura que el compilador de java verifique que esta funcion
     * abstracta que quieres llamar sea la misma que la de la clase abstracta. Si
     * omites implementar `@Override` en algun método abstracto en la clase que la
     * hereda generara un error.
     * 
     * !! RECUERDA !!
     * 
     * Los metodos abstractos que uses tienes que escribirlos de forma identica que
     * la clase abstracta, ya que cualquier fallo tipografico generara un error de
     * compilación que seguro nadie quiere tener.
     * 
     * @Override:
     * - Garantiza que realmente estás sobrescribiendo un método.
     * 
     * - Facilita el mantenimiento del código y la lectura por otros
     * desarrolladores.
     * 
     * - Ayuda a evitar errores en la firma de métodos que podrían provocar que
     * accidentalmente definas un nuevo método en lugar de sobrescribir el
     * existente.
     */

    @Override
    public void abstractVoidMethod() {
        System.out.println("This is a abstract method 1 - %");
    }

    @Override
    public void otherAbstractMethod() {
        System.out.println("This is a abstract method 2  - %");
    }

    // ... Getters and Setters

    public int getValue1() {
        return value1;
    }

    public void setValue1(int value1) {
        this.value1 = value1;
    }

    public int getValue2() {
        return value2;
    }

    public void setValue2(int value2) {
        this.value2 = value2;
    }

    public String getValue3() {
        return value3;
    }

    public void setValue3(String value3) {
        this.value3 = value3;
    }

    public double getValue4() {
        return value4;
    }

    public void setValue4(double value4) {
        this.value4 = value4;
    }

}