package com.company;

public class Main {

    public static void main(String[] args) {

        Cow cow1 = new Cow(85, 3, "female", "MuMu");
        Cow cow2 = new Cow(80, 3, "female", "MuMu");
        Cow cow3 = new Cow(87, 4, "male", "MuMu");
        Cow cow4 = new Cow(89, 5, "male", "MuMu");
        Cow cow5 = new Cow(95, 2, "female", "MuMu");
        Cow cow6 = new Cow(35, 1, "male", "MuMu");

        Cow[] cows = {cow1, cow2, cow3, cow4, cow5};
        Cow[] cows1 = {cow6};

        Sheep sheep1 = new Sheep(25, 2, "female", "Maa");
        Sheep sheep2 = new Sheep(27, 3, "female", "Maa");
        Sheep sheep3 = new Sheep(35, 4, "male", "Maa");
        Sheep sheep4 = new Sheep(15, 1, "male", "Maa");

        Sheep[] sheeps = {sheep1, sheep2, sheep3};
        Sheep[] sheeps1 = {sheep4};

        Horse horse1 = new Horse(115, 5, "female", "Mustang");
        Horse horse2 = new Horse(125, 6, "female", "Mustang");
        Horse horse3 = new Horse(135, 7, "female", "Mustang");

        Horse[] horses = {horse1, horse2};
        Horse[] horses1 = {horse3};

        Farm farm = new Farm("Toktogul", "Turusbek", cows, sheeps, horses);
        Farm farm1 = new Farm("Sary-Ozon", "Altynbek", cows1, sheeps1, horses1);

        System.out.println(farm);
        System.out.println();
        System.out.println(farm1);
    }
}
