/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dog;

/**
 * Clase que permite la instanciación de objetos dog y la utilización de sus
 * métodos para mostrarlos por pantalla
 *
 * @author Alejandro
 */
public class Dog {

    /**
     * El nombre del perro.
     */
    private String name;

    /**
     * La raza del perro.
     */
    private String breed;

    /**
     * El color del pelaje del perro.
     */
    private String color;

    /**
     * La edad del perro en años.
     */
    private int age;

    /**
     * Crea un nuevo objeto Dog con los datos especificados.
     *
     * @param name el nombre del perro.
     * @param breed la raza del perro.
     * @param age la edad del perro en años.
     * @param color el color del pelaje del perro.
     */
    public Dog(String name, String breed, int age, String color) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    /**
     * Devuelve el nombre del perro.
     *
     * @return el nombre del perro.
     */
    public String getName() {
        return name;
    }

    /**
     * Devuelve la raza del perro.
     *
     * @return la raza del perro.
     */
    public String getBreed() {
        return breed;
    }

    /**
     * Devuelve la edad del perro en años.
     *
     * @return la edad del perro en años.
     */
    public int getAge() {
        return age;
    }

    /**
     * Devuelve el color del pelaje del perro.
     *
     * @return el color del pelaje del perro.
     */
    public String getColor() {
        return color;
    }

    /**
     * El método main crea una instancia de Dog y llama al método toString().
     *
     * @param args los argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String[] args) {
        Dog tuffy = new Dog("tuffy", "papillon", 5, "white");
        System.out.println(tuffy.toString());
    }

    /**
     * Devuelve una representación en cadena del objeto Dog.
     *
     * @return una cadena que describe el perro, incluyendo su nombre, raza,
     * edad y color.
     */
    @Override
    public String toString() {
        return ("Hi my name is " + this.getName()
                + ".\nMy breed,age and color are "
                + this.getBreed() + "," + this.getAge()
                + "," + this.getColor());
    }
}
