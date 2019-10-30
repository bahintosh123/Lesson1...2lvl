package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Shelter sh = new Shelter("Bublik", "Asanbai"); //создаем шелтер для всех собак
	Dog jim = new Dog();
    Dog bob = new Dog();
    Dog lucy = new Dog();

    jim.setGenerateDefaultAge();
    jim.setColor(Colors.BLACK);
    jim.setShelter(sh);
    jim.setName("Jim");
    jim.setBreed("ovcharka");
        jim.setCommands(new String[]{"say","shout"});

        bob.setGenerateDefaultAge();
        bob.setColor(Colors.WHITE);
        bob.setShelter(sh);
        bob.setCommands(new String[]{"sit","stay"});
        bob.setName("bob");
        bob.setBreed("laika");

        lucy.setGenerateDefaultAge();
        lucy.setColor(Colors.GRAY);
        lucy.setShelter(sh);
        lucy.setCommands(new String[]{"run","walk"});
        lucy.setName("lucy");
        lucy.setBreed("haski");

        bob.getInfo();
        jim.getInfo();
        lucy.getInfo();
        System.out.println(jim.getInfo());
        System.out.println(lucy.getInfo());
        System.out.println(bob.getInfo());

       jim.makeVoice("gggggggg"); // у нас есть 3 метода с makeVoice и для каждой собаки реализуем этот метод
       bob.makeVoice();
       lucy.makeVoice("GAAAV",2);








    }
}
