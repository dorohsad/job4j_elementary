package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        System.out.println(ages.length);
        System.out.println(surnames.length);
        System.out.println(prices.length);
        names[0] = "Petr Arsentev";
        names[1] = "Alex";
        names[2] = "Dima";
        names[3] = "Masha";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
