package losti.poo;

/*
 * Uso de las clases:
 * Tipo   Nombre      Crea instancia  Parametros con su tipo correspondiente
 * Class  class   =   new Class      (id, name, description);
 *
 * ⬇️
 *
 * Class class = new Class(id, name, description);
 */

public class Class { // <- Creación de la clase "Class", esto es lo mas importante y le debemos dar
                     // "public" ya que de esa forma podemos usarlo globalmente en nuestra app.

    // Los atributos se escriben aqui ⬇️, debemos especificar el control de acceso,
    // si va ser "public", "private", "protected" y luego le damos su tipo de dato:

    private String id;
    public String name;
    public String description;

    /*
     * Este es el constructor de la clase. En su mayoria debe ser pubic como control
     * de acceso y luego simplemente escribe de nuevo el nombre de tu clase (es
     * obligatorio).
     * 
     * En los "Class(aqui)" debemos debemos especificar los parametros que llegaran
     * cuando el constructor sea usado. ¿Por que? por que nuestros atributos ahorita
     * estan declarados pero no inicializados, su valor es por asi decirlo nulo.
     * 
     * Entonces para vamos a añadirle sus parametros correspondientes:
     * 
     * Class(String id, String name, String description)
     * 
     * Por costumbre siempre a cada parametro dale el mismo nombre que al atributo
     * al cual le daras ese valor. Tenemos de atributo id asi que crearemos un
     * parametro id con el mismo tipo de dato del atributo.
     * 
     * Luego de esto, toca darle los valores de cada parametro a cada atributo de la
     * clase.
     * 
     * ¿Como lo hago sin que me salga un error de que ambos elementos tienen el
     * mismo nombre o estan siendo re-declarados?
     * 
     * Usaremos "this.*", esto nos permite acceder al contexto de la clase. todo
     * atributo, metodo, etc. Sera accesible desde this. Entonces haremos lo
     * siguiente:
     * 
     * this.id = id;
     * 
     * Y asi con cada uno de atributos y parametros. De esta forma todos tendran su
     * valor inicializado y no necesitas hacer nada mas.
     * 
     */
    public Class(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    /*
     * Ahora, ¿como creo metodos?, no es muy dificil, tal como viste lo que
     * necesitas es especificar el control de acceso:
     * ["public", "private","protected"]
     * 
     * y luego el tipo de dato sea primitivo o no.
     * 
     * Ejemplo:
     * public void printlnData() {
     * System.out.println(this.id);
     * System.out.println(this.name);
     * System.out.println(this.description);
     * }
     * 
     */

    public void printlnData() {
        System.out.println(this.id);
        System.out.println(this.name);
        System.out.println(this.description);
    } // <- metodo de ejemplo funcional, te daras cuenta que puedes acceder a este
      // desde el "this.*"

    /*
     * Getters and Setters
     * 
     * Son metodos tradicionales que se usan para acceder a datos privados de forma
     * que no se pueda afectar directamente su valor original — Esto se hace
     * mediante metodos —.
     */

    // getter
    public String getId() {
        return this.id;
    }

    // setter
    public void setId(String newId) {
        this.id = newId;
    }

    // Este proceso en su mayoria se repite con todos los atributos privados, en los
    // publicos no son necesarios;)
}
