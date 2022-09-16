package ru.mirea.lab2.punkt3;

import ru.mirea.lab2.punkt2.Ball;

import java.util.Scanner;
public class Tester {
    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);
        int n;
        n = source.nextInt();
        Circle c[] = new Circle[n];
        for(int i = 0; i < n; i++){
            c[i] = new Circle(source.nextDouble(), source.nextDouble());
        }

    }
}
