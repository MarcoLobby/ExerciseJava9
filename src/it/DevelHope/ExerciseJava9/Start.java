package it.DevelHope.ExerciseJava9;

public class Start {

    public static void main(String[] args) {

        Animal lion = new Animal("Lion");
        Animal zebra = new Animal("Zebra");

        System.out.println("Since we have no parameters, the sound of the Lion will be: ");
        lion.animalSound();
        System.out.println("Since we have an 'high' parameter, the sound of the Lion will be: ");
        lion.animalSound("high");
        System.out.println("-----------------");
        System.out.println("Since we have no parameters, the sound of the Zebra sound will be: ");
        zebra.animalSound();
        System.out.println("Since we have a 'low' parameter, the sound of the Zebra sound will be: ");
        zebra.animalSound("low");

    }
}
