package com.walking.lesson18_instanceof_getClass.Task1;


import com.walking.lesson18_instanceof_getClass.Task1.model.Animal;
import com.walking.lesson18_instanceof_getClass.Task1.model.Cat;
import com.walking.lesson18_instanceof_getClass.Task1.model.Cow;
import com.walking.lesson18_instanceof_getClass.Task1.model.Dog;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[]{new Cat(), new Dog(), new Cow()};

        soundAll(animals);
    }

    private static void soundAll(Animal[] animals) {
        for (Animal animal : animals) {
            sound(animal);
        }
    }

    private static void sound(Animal animal) {
        if (animal.getClass().equals(Cat.class)) {
            ((Cat) animal).sound();
        } else if (animal.getClass().equals(Dog.class)) {
            ((Dog) animal).sound();
        } else if (animal.getClass().equals(Cow.class)) {
            ((Cow) animal).sound();
        } else {
            System.out.println("Unknown animal");
        }

    }
}
