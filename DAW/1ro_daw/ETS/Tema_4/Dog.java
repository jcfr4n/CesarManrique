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
public class Dog 
{
    // Instance Variables
    private String name; 
    private String breed; 
    private String color;
    private int age;
 
    // Constructor Declaration of Class
    public Dog(String name,String breed,int 
            age, String color)
    {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.color = color;
    }
 
    // method 1
    public String getName()
    {
        return name;
    }
 
    // method 2
    public String getBreed()
    {
        return breed;
    }
 
    // method 3
    public int getAge()
    {
        return age;
    }
 
    // method 4
    public String getColor()
    {
        return color;
    }
 
    public static void main(String[] args)
    {
        Dog tuffy = new Dog("tuffy","papillon", 5, "white");
        System.out.println(tuffy.toString());
    }
 
    @Override
    public String toString()
    {
        return("Hi my name is "+this.getName()+
               ".\nMy breed,age and color are "+
               this.getBreed()+","+this.getAge()+
               ","+ this.getColor());
    }
}