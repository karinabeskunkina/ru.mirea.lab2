package ru.mirea.lab2.punkt4;

import ru.mirea.lab2.Author;

import java.util.Scanner;
public class Tester {
    public static void main(String[] args){

        Shop Market = new Shop();
        Scanner source = new Scanner(System.in);
        System.out.println("Do you want to add a computer?");
        while(source.nextInt() != 0) {
            System.out.println("Enter the data: ");
            Computer c1 = new Computer(source.next(), source.next(), source.next(), source.next());
            Market.addComputer(c1);
            System.out.println("Do you want to add a computer?");
        }
        for(Computer x: Market.C){
            System.out.println("Name: " + x.model + "\tProcessor: " + x.processor + "\tMemory: " + x.memory + "\tBattery: " + x.battery);
        }
    }
}
