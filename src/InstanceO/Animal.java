package InstanceO;

class Animal {
    // Esta es la clase base (superclase) Animal
}

class Perro extends Animal {
    // Esta es la subclase Perro, que extiende la clase Animal


//public class Main {
    public static void main(String[] args) {
        Animal miAnimal = new Perro(); // Creamos una instancia de Perro pero la guardamos como tipo Animal

        if (miAnimal instanceof Perro) {
            System.out.println("El objeto es un perro.");
        } else if (miAnimal instanceof Animal) {
            System.out.println("El objeto es un animal, pero no un perro.");
        } else {
            System.out.println("El objeto no es ni un perro ni un animal.");
        }
    }
}