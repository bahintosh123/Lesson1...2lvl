package com.company;

import java.util.Random;

public class Pet {
    Random r = new Random();
    private int age = setGenerateDefaultAge(); // Создать метод private int generateDefaultAge(), который генерирует рандомный возраст с 1 до 10 лет, и инициализировать поле age вызовом этого метода
    private Shelter shelter; //создание шелтер типом шелтер
    private Colors color;


    public final String getInfo(){
        return getShelter().getName() + " " + getShelter().getAddress() +" " + " " + getColor() + " " + getAge();
        //шелтер сложный тип данных, поэтому добавлям адрес и имя.
    }

    public int setGenerateDefaultAge() {
        return r.nextInt(10);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }

    public void setColor() {
    }
}
