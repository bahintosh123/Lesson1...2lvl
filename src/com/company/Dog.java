package com.company;

import java.util.Arrays;

public final class Dog extends Pet {
    private String name;
    private String breed;
    private String[] commands;

    public Dog() {

    }

    public Dog(String name, String breed, Shelter shelter, Colors colors) {
        this.setName(name);
        this.setBreed(breed);
        this.setColor(colors);
        this.setShelter(shelter);
    }

    public Dog(String name, String breed, String[] commands, Shelter shelter, Colors colors) {
        this.setName(name);
        this.setBreed(breed);
        this.setCommands(commands);
        this.setColor(colors);
        this.setShelter(shelter);
    }

    public void makeVoice(String voice, int number) { //будет гавкать столько, сколько зададим
        for (int i = 0; i < number; i++) {
            System.out.println(voice);
        }
    }

    public void makeVoice(String voice) { //гавкнет один раз
            System.out.println(voice);
    }

    public void makeVoice() {
        System.out.println("gavgav");
    }
    public String getInfo1() { //создали новый метод гетинфо1 (потому что гетинфо файнал)
        return super.getInfo() + " " + getName() + " " + getBreed() + " " + Arrays.toString(getCommands()) ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String[] getCommands() {
        return commands;
    }

    public void setCommands(String[] commands) {
        this.commands = commands;
    }
}
