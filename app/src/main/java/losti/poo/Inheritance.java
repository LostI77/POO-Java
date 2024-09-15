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

public class Inheritance {
    public static void main(String[] args) {
        // example -> C c = new C("Lost", "default", 18, "Sudamerica", "Peru", "No");
        System.out.println("Inheritance funciona");
    }

    // Se pueden crear clases dentro de una clase!

    public static class D {
        // atributos ⬇️
        private String continent;
        private String country;
        private String address;

        // constructor ⬇️
        public D(String continent, String country, String address) {
            this.continent = continent;
            this.country = country;
            this.address = address;
        }

        // metodos de la clase ⬇️
        public void printlnPrivateData() {
            // ⬇️ puedes usar asi los atributos siempre y cuando el this sea innecesario
            System.out.println(continent);
            System.out.println(country);
            System.out.println(address);
        }

        // getters and setters ⬇️

        public String getContinent() {
            return this.continent;
        }

        public void setContinent(String continent) {
            this.continent = continent;
        }

        public String getCountry() {
            return this.country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public String getAddress() {
            return this.address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }

    public static class C extends D { // <- Extiende la clase C con la D. Usar extends siempre despues del nombre de
        // la clase y despues de extens usa el nombre de la clase que quieras que sea
        // con la cual se extienda
        // atributos ⬇️
        private String name;
        private String lastName;
        private int age;

        // constructor ⬇️
        public C(String name, String lastName, int age, String continent, String country, String address) {
            /*
             * Cuando usas extends se vuelve obligatorio usar "super()" en esta clase, ya
             * que en la clase D
             * tenemos un constructor con parametros, ahora desde aqui con super debemos
             * pasarle esos parametros para que no haya error alguno. Sino haces esto
             * tendras problemas, excepto que la clase que hayas creado para extender esta
             * no tenga parametros.
             */
            super(continent, country, address);
            this.name = name;
            this.lastName = lastName;
            this.age = age;
        }

        // metodos de la clase ⬇️
        public void printlnAllData() {
            // ⬇️ puedes usar asi los atributos siempre y cuando el this sea innecesario
            System.out.println(name);
            System.out.println(lastName);
            System.out.println(age);
        }

        public String getFullName() {
            return this.name + " " + this.lastName;
        }
        // getters and setters ⬇️

        public String getName() {
            return this.name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastName() {
            return this.lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getAge() {
            return this.age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    }
}