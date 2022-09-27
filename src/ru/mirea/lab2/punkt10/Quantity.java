package ru.mirea.lab2.punkt10;

import java.util.Scanner;

public class Quantity {
    public static void main(String[] args){
        Scanner source = new Scanner(System.in);
        String s = source.nextLine();
        System.out.println(s);
        String Sl[] = s.split(" ");
        System.out.println(Sl.length);
    }
}
